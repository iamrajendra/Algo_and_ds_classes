import sun.jvm.hotspot.memory.EdenSpace;

import java.util.ArrayList;

public class GraphEx {
    public static class Edge {

        int src;
        int nbr;
        int wt;

        public Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }

    }

    public static void main(String[] args) {
        int vc = 7;
        ArrayList<Edge>[] graph = new ArrayList[vc];
// Declearation of graph
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
// initialization of Path
        graph[0].add(new Edge(0,3,40));
        graph[0].add(new Edge(0,1,10));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,2,10));

        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,10));

        graph[3].add(new Edge(3,0,40));
        graph[3].add(new Edge(3,2,10));
        graph[3].add(new Edge(3,4,10));

        graph[1].add(new Edge(4,3,10));
        graph[1].add(new Edge(4,5,10));
        graph[3].add(new Edge(4,6,10));

        graph[2].add(new Edge(5,4,10));
        graph[2].add(new Edge(5,6,10));

        graph[2].add(new Edge(6,5,10));
        graph[2].add(new Edge(6,4,10));

        int src = 0;
        int dest = 6;

        boolean[] visited = new boolean[vc];
        printAllPath(graph,src,dest,visited,src + "");

//        System.out.println(path);
    }

    private static boolean hasPath(ArrayList<Edge>[] graph, int src, int des, boolean[] visited) {
//   src
        if (src == des) {
            return true;
        }
        visited[src] = true;
        for (Edge edge : graph[src]) {
            if (visited[edge.nbr] == false) {
                boolean hasNbrPath = hasPath(graph, edge.nbr, des, visited);
                if (hasNbrPath == true) {
                    return true;
                }
            }

        }

        return false;
    }

    public static void printAllPath(ArrayList<Edge>[] graph, int src, int des, boolean[] visited, String psf) {
        if (src == des) {
            System.out.println(psf);
            return;
        }

       /* visited[src] = true;
        for (Edge egde : graph[src]) {
            if (visited[egde.nbr] == false) {
                printAllPath(graph, egde.nbr, des, visited, psf + egde.nbr);
            }

        }

        visited[src] = false;
*/

        visited[src] = true ;
        for(Edge edge : graph[src]){
            if(visited[edge.nbr] == false){
                printAllPath(graph, edge.nbr,des,visited, psf + edge.nbr);

            }
        }visited[src] =  false;
    }
}
