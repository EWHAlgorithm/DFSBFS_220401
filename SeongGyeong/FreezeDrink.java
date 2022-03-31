package DFSBFS;

import java.util.Arrays;
import java.util.Scanner;

//다 한 번씩 탐색해야됨 -> 그래서 DFS나 BFS를 쓰면 좋을 것 같음
//DFS를 써야한다.

//최단 거리를 구한다면 BFS
//이동할 때마다 가중치가 붙거나, 이동과정에서 여러 제약이 있다면 DFS


public class FreezeDrink {

    public static int N, M;

    //얼음판 상태 입력 받을 2차원 배열
    public static int[][] iceFrame = new int[1000][1000];
    //public static int[][] iceFrame = new int[N][M]
    //이렇게 했더니 오류남. dfs함수에서 수 증가시켰을 때 인덱스 벗어나서 그런가봄.


    public static boolean dfs(int x, int y){

        if(x<0 || x>=N|| y<0 || y>=N)
            return false;

        //현재 노드 아직 방문 안했다면
        if(iceFrame[x][y] == 0){
            iceFrame[x][y] = 1;
            dfs(x-1,y);
            dfs(x+1,y);
            dfs(x,y-1);
            dfs(x,y+1);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        for(int i =0; i<N; i++){
            String str = sc.nextLine();
            for(int j=0; j<M; j++){
                iceFrame[i][j] = str.charAt(j) -'0';
            }
        }

        //덩어리 세기
        int result =0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(dfs(i,j))
                    result += 1;
            }
        }

        System.out.println(result);
    }
}
