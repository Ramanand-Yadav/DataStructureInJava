package Recursion.tryingOutAllCombination;

public class colorNode {
    public static void main(String[] args) {
        
    }
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        int[] colors = new int[n];
        return colorGraph(graph,m,n,colors,0);
    }
    public boolean colorGraph(boolean[][] graph, int m,int n, int[]colors, int v){
        if(v==n)return true;
        for(int color=1;color<=m; color++){
            if(isSafe(graph,colors,v,color,n)){
                colors[v]=color;
                if(colorGraph(graph,m,n,colors,v+1))return true;
                colors[v] = 0;
            }
        }
        return false;
    }
    public boolean isSafe(boolean[][]graph,int[]colors,int v, int c, int n){
        for(int u=0; u<n; u++){
            if(graph[v][u] && colors[u]==c)return false;
        }
        return true;
    }
}
