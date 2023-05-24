import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    private int N ;
    private LinkedList <Integer> [] adj ;

    public BFS(int n ){
        N =n ;
        adj = new LinkedList[n];
        for(int i =0 ; i< N ; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }
     public void addEdge(int st , int nd ){
        adj[st].add(nd);
   }
   void BFSg(int s){
        boolean [] Visited = new boolean[N];
       Queue <Integer> queue = new LinkedList<Integer>();
       Visited[s] = true ;
       queue.add(s);
       while (!queue.isEmpty()){
           s = queue.poll();
           System.out.print(s + " ");
           Iterator<Integer> itr = adj[s].listIterator();
           while (itr.hasNext()){
               int n = itr.next();
               if(!Visited[n]){
                   Visited[n]= true;
                   queue.add(n);
               }
           }

       }


   }





}
