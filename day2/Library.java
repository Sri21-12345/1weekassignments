package week1.day2;

public class Library {
	// method syntax
		public String addBook (String bookTitle) {
	    System.out.println("Book added successfully");
		return bookTitle;
		}
				
		public void issueBook() {
			System.out.println("Book issued successfully");
					
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library book=new Library();
		String cl=book.addBook("Classmate");
		System.out.println(cl);
		book.issueBook();
		}
	
	}


