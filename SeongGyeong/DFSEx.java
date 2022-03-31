package DFSBFS;

import java.util.ArrayList;

public class DFSEx {

    //방문처리 배열
    public static boolean[] visited = new boolean[9];
    //그래프를 표현한 인접 리스트 생성
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    //DFS 함수 정의
    public static void dfs(int x) { //x는 출발 노드
        //현재 노드를 방문 처리
        visited[x] = true;
        System.out.print(x + " ");

        //현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if(!visited[y]) dfs(y); //인접한 노드를 방문하지 않았다면 그 노드를 방문처리하고 그것과 인접한 노드들 방문
        }
    }

    public static void main(String[] args) {

        //인접 리스트 초기화
        for(int i=0; i<=8; i++)
            graph.add(new ArrayList<Integer>());

        //노드 1에 연결된 노드 정보 저장
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        //노드 2에 연결된 노드 정보 저장
        graph.get(2).add(1);
        graph.get(2).add(7);

        //노드 3에 연결된 노드 정보 저장
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        //노드 4에 연결된 노드 정보 저장
        graph.get(4).add(3);
        graph.get(4).add(5);

        //노드 5에 연결된 노드 정보 저장
        graph.get(5).add(3);
        graph.get(5).add(4);


        //노드 6에 연결되 노드 정보 저장
        graph.get(6).add(7);

        //노드 7에 연결된 노드 정보 저장
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        //노드 8에 연결된 노드 정보 저장
        graph.get(8).add(1);
        graph.get(8).add(7);

        dfs(1);
    }
}
