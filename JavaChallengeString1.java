package week3.marathon;

public class JavaChallengeString1 {
	public int Lengthoflastword(String a) {
		int len=0;
		String input=a.trim();
		//for loop
		for (int i = 0; i < input.length(); i++) {
			//if condition
			if (input.charAt(i)==' ')
			len = 0;
			//else condition
			else 
				len++;
		}
		//return
		return len;
	}	
	public static void main(String[] args) {
		//string
		String a = "Hello World";
		//local variable
		JavaChallengeString1 string1 = new JavaChallengeString1();
		System.out.println(string1.Lengthoflastword(a));
	}

}
