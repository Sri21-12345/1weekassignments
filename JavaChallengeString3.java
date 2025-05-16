package week3.marathon;

public class JavaChallengeString3 {
	public int Lengthoflastword(String c) {
		int len=0;
		String input=c.trim();
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
		String c= "Luffy is still Joyboy";
		//local variable
		JavaChallengeString3 string3=new JavaChallengeString3();
		System.out.println(string3.Lengthoflastword(c));
	}
}