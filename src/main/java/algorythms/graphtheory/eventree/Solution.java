package algorythms.graphtheory.eventree;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(java.util.Map<Integer, java.util.Set<Integer>> map) {
        int removed = 0;
        while (true) {
            int newRemovals = removeNodes(map);
            if (newRemovals == 0) break;
            removed += newRemovals;
        }
        return Integer.toString(removed);
    }

    protected static int removeNodes(java.util.Map<Integer, java.util.Set<Integer>> map) {
        int removed = 0;
        java.util.Map<Integer, Integer> removeNodes = new java.util.HashMap<>();
        for (int key : map.keySet()) {
            for (int node : map.get(key)) {
                int children = countChildren(map, key, node);
                if (children % 2 == 0) {
                    removeNodes.put(key, node);
                }
            }
        }
        for (int key : removeNodes.keySet()) {
            int node = removeNodes.get(key);
            boolean removedKey = map.get(key).remove(node);
            boolean removedNode = map.get(node).remove(key);
            if (removedKey && removedNode) {
                removed++;
            }
        }
        return removed;
    }

    protected static int countChildren(
            java.util.Map<Integer, java.util.Set<Integer>> map,
            int rootNode,
            int childNode
    ) {
        java.util.Set<Integer> children = new java.util.HashSet<>();
        children.add(childNode);
        while (addChildren(map, children, rootNode)) {
            // Nothing
        }
        return children.size();
    }

    private static boolean addChildren(
            java.util.Map<Integer, java.util.Set<Integer>> map,
            java.util.Set<Integer> children,
            int rootNode
    ) {
        int childrenCount = children.size();
        java.util.Set<Integer> newChildren = new java.util.HashSet<>();
        for (int child : children) {
            for (int node : map.get(child)) {
                if (node != rootNode) {
                    newChildren.add(node);
                }
            }
        }
        children.addAll(newChildren);
        return childrenCount != children.size();
    }

    protected static void addToMap(Integer a, Integer b, java.util.Map<Integer, java.util.Set<Integer>> map) {
        if (!map.containsKey(a)) {
            map.put(a, new java.util.HashSet<Integer>());
        }
        map.get(a).add(b);
    }

    protected static void addBothToMap(Integer a, Integer b, java.util.Map<Integer, java.util.Set<Integer>> map) {
        addToMap(a, b, map);
        addToMap(b, a, map);
    }


    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int vertices = in.nextInt();
        int edges = in.nextInt();
        java.util.Map<Integer, java.util.Set<Integer>> map = new java.util.HashMap<>();
        for (int edge = 0; edge < edges; edge++) {
            int a = in.nextInt();
            int b = in.nextInt();
            Solution.addBothToMap(a, b, map);
        }
        System.out.println(Solution.getOutput(map));
    }

}