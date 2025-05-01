package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int x=0;
			int y=1;
			
			//for loop
			for (int i = 1; i <=8; i++) {
				System.out.println("fibonacci series" + x);
				
				 x+=y;
			     y=x-y;
				
			}
		}

}
