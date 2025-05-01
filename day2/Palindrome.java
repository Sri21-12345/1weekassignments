package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=323;
int output=input;
int reversenumber=0;
int rem;
for (int i = input; i > 0; i/=10) {
	 rem = i%10;
	 reversenumber=reversenumber*10+rem;
}
if(output==reversenumber) {
		System.out.println(output+"is palindrome");		
}
	else {
		System.out.println(output+"is not palindrome");
	}
	}
}



