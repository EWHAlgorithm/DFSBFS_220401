package DFSBFS;

public class AdjacencyMatrix {

    public static final int INF = 999999999;

    //2차원 리스트를 이용해 인접 행렬 표현
    public static int[][] graph= {
        {0,3,6},
        {3,0,INF},
        {6,INF,0}
    };

    public static void main(String[] args) {

        //그래프 출력
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[0].length; j++){
                System.out.print(graph[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
