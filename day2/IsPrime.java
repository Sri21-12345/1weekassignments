package week1.day2;


public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 13;
		int n=0;
		System.out.println("The given number is: " + number);
			for(int i = 1; i <= number; i++) {
	            if(number % i == 0) {
	               n++;
	               
	            }
	         }
			if(n == 2) {
	            System.out.println(number + " is a prime number");
	         } else {
	            System.out.println(number + " is not a prime number");
	         
		}

	}

}
