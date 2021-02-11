import java.util.ArrayList;

public class Graph {
    public static class Edge{
        int src;
        int nbr;
        int wt;

        Edge(int src,int nbr,int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt ;

        }
    }
    public static void main(String[] args) {
        int vces = 7 ; // 0123456
        ArrayList<Edge>[] graph = new ArrayList[vces];
        for(int i = 0;i<vces;i++){
            graph[i] = new ArrayList<Edge>();
        }
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

        boolean[] visited = new boolean[vces];
        printAllPaths(graph,src,dest,visited,src + "");
        //System.out.println(path);

    }
    public static void printAllPaths(ArrayList<Edge>[] graph, int src , int dest, boolean[] visited , String psf){
        if(src == dest){
            System.out.println(psf);
            return;
        }

        visited[src] = true ;
        for(Edge edge : graph[src]){
            if(visited[edge.nbr] == false){
                printAllPaths(graph, edge.nbr,dest,visited, psf + edge.nbr);

            }
        }visited[src] =  false;
    }

}
