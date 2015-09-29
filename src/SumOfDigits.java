


public class SumOfDigits extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumOfDigits(126));
	}

	public static int sumOfDigits(int n){
		
		if(n < 10)
			return n;
		
		return n % 10 + sumOfDigits(n / 10);
	}
}
