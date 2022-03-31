package DFSBFS;

import java.util.Stack;

public class stackEx {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(5);
        s.push(2);
        s.push(3);
        s.push(7); // 5 2 3 7

        s.pop(); //5 2 3

        s.push(1); //5 2 3 1
        s.push(4); //5 2 3 1 4

        s.pop(); // 5 2 3 1

        //출력
        while(! s.empty()){
            System.out.print(s.peek() + " "); //최상단 숫자 리턴하고
            s.pop(); //삭제
        }



    }
}
