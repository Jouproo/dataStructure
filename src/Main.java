public class Main {

    public static void main(String[] args) {

        BFS graph1 = new BFS(5);
//        BFS graph2 = new BFS(6);
//        BFS graph3 = new BFS(5);

        graph1.addEdge(0,1);
        graph1.addEdge(0,2);
        graph1.addEdge(1,2);
        graph1.addEdge(2,0);
        graph1.addEdge(2,3);
        graph1.addEdge(3,3);
        graph1.addEdge(3,2);
        graph1.addEdge(3,4);
        graph1.addEdge(3,3);

        System.out.println(" traversal graph ");

        graph1.BFSg(4);
    }



}