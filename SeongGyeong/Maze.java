package DFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//미로 탈출은 가까운 길부터 주어진 모든 길에 대한 탐색을 해야하기 때문에 + 최단 거리 문제 => BFS

class NODE {
    private int x;
    private int y;

    public NODE(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}

public class Maze {

    public static int N,M;
    public static int[][] graph = new int[201][201];

    //이동하는 방향 (좌, 우, 하, 상)
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    //bfs 정의 : 가까운 쪽부터 미로를 풀어서 최단거리로 가야하니까 BFS 쓰면 좋을 것 같다
    public static int bfs(int x, int y){
        //큐 구현
        Queue<NODE> q = new LinkedList<>();
        q.offer(new NODE(x,y)); //시작 노드  큐에 넣기

        //큐가 빌 때까지 반복
        while(!q.isEmpty()){
            NODE n = q.poll();
            x = n.getX();
            y = n.getY();

            //현재 위치에서 4가지 방향 확인
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                //미로를 벗어나면 안됨
                if(nx<0 || ny<0 || nx>=N ||ny>=M) //인덱스는 0부터니까 N-1,M-1 지점이 진짜 출구고, N과 M에 도달하게 되면 출구를 벗어남
                    continue; //무시하고 다음 반복문 돌리기

                //벽인 경우도 무시
                if(graph[nx][ny] == 0)
                    continue;

                //해당 노드를 처음 방문하는 경우 최단 거리 기록하기
                if(graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    q.offer(new NODE(nx,ny));
                }
            }
        }

        //출구에 도착했을 때 그 최단 거리 반환하기
        return graph[N-1][M-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        //sc.nextLine(); (한줄 버리는 코드)
        //위 코드를 안 써주면 M을 입력하고 우리가 입력한 엔터가 str 값으로 들어가버리기 때문에
        //오류가 생긴다 그래서 꼭 스캐너 쓰고 밑에서 또 입력 받으려면 버퍼 비워주기!


        for(int i =0; i<N; i++){
            String str = sc.nextLine(); //next는 공백 기준으로 한 단어나 한 문자만 입력 받고, NextLine은 한 줄!
            for(int j=0; j<M; j++){
                graph[i][j] = str.charAt(j) -'0'; //한 줄 통째로 입력받은 걸 하나씩 쪼개기
            }
        }

        //BFS 수행 결과
        System.out.println(bfs(0,0));
    }
}
