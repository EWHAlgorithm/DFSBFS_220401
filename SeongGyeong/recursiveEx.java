package DFSBFS;


public class recursiveEx {

    //팩토리얼 구현 함수 (반복문)
    public static int factorialItertive(int n){
        int result = 1;
        for(int i = 1; i<=n; i++){
            result *= i;
        }
        return result;
    }

    //팩토리얼 구현 함수 (재귀)
    public static int factorialRecursive(int n){

        if(n<=1) return 1; //종료조건
        else
            return n*factorialRecursive(n-1);
    }

    public static void main(String[] args) {

        System.out.println("반복적으로 구현한 5! : " +factorialItertive(5) );
        System.out.println("재적으로 구현한 5! : " +factorialRecursive(5) );

    }
}
