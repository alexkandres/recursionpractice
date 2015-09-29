
public class Fibonnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonnacci(6));
	}

	public static int fibonnacci(int n){
		
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		
		return fibonnacci(n - 1) + fibonnacci(n - 2);
	}
}
