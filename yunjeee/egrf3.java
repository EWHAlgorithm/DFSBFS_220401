
public class egrf3 {

		// 1. 반복적으로 구현한 N!
	public static int factorialIterative(int n) {
		int result = 1;
		// 1부터 n까지의 수를 차례대로 곱하기
		for ( int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	// 2. 재귀적으로 구현한 N! 
	public static int factorialRecursive(int n) {
		//n이 1 이하인 경우 1을 반환
		if (n<=1) return 1;
		// n! = n * (n-1)! 를 그대로 코드로 작성하면 다음과 같다 
		return n * factorialRecursive(n-1);
	}
		
	
	public static void main(String[] args) {
		// 각각의 방식으로 구현된 N! 출력 (n = 5)
		System.out.println("반복적으로 구현: "+ factorialIterative(5));
		System.out.println("재귀적으로 구현: "+ factorialRecursive(5));
	}

}
