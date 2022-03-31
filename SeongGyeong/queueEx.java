package DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class queueEx {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(5); //5
        q.offer(2); //2 5
        q.offer(3); //3 2 5
        q.offer(7); //7 3 2 5

        //poll 함수는 가장 먼저 들어온 값 리턴하고 삭제
        q.poll(); //7 3 2

        q.offer(1); //1 7 3 2
        q.offer(4); //4 1 7 3 2

        q.poll(); //4 1 7 3

        while(!q.isEmpty()){
            System.out.print(q.poll()+ " ");
            // 출력 : 3 7 1 4
        }
    }

}
