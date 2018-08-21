import java.util.*;

public class Test1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        HashMap<Integer, Node> nodes = new HashMap<>();
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
            nodes.put(i, new Node(arr[i]));
        }

        for (int i = 0; i < size -1; i++) {
            for (int j = i + 1; j < size; j++) {
                int val = Math.max(arr[i], arr[j]);
                Node from = nodes.get(i);
                Node to = nodes.get(j);
                Edge e = new Edge(val, to);
                from.edges.add(e);
            }
        }
        System.out.println(prim(nodes));
    }

    public static int prim(HashMap<Integer, Node> nodes) {
        PriorityQueue<Edge> smallHeap = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
        HashSet<Node> set = new HashSet<>();

        int res = 0;
        for (Node node : nodes.values()) {
            if (!set.contains(node)) {
                set.add(node);
                smallHeap.addAll(node.edges);
                while (!smallHeap.isEmpty()) {
                    Edge edge = smallHeap.poll();
                    Node toNode = edge.to;
                    if (!set.contains(toNode)) {
                        set.add(toNode);
                        res += edge.val;
                        smallHeap.addAll(toNode.edges);
                    }
                }
            }
        }
        return res;
    }
}

class Node {
    public int value;
    public ArrayList<Edge> edges;

    public Node(int value) {
        this.value = value;
        edges = new ArrayList<>();
    }
}

class Edge {
    public int val;
    public Node to;

    public Edge(int val, Node to) {
        this.val = val;
        this.to = to;
    }
}
