package week3.marathon;

public class JavaChallengeString2 {
	public int Lengthoflastword(String b) {
		int len=0;
		String input=b.trim();
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
				String b= "Fly me to the Moon";
				//local variable
				JavaChallengeString2 string2=new JavaChallengeString2();
				System.out.println(string2.Lengthoflastword(b));
			}
	}