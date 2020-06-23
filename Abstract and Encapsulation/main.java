
public class main {

	public static void main(String[]args) {
			Book b=new Book("wiiliam","william@gmail.com",'M',"junglebook",500.50,4);
	System.out.println("Author's name:"+b.getAuthorname()+ "\nEmail:"+b.getEmail()+"\nGender:"+b.getGender()+"\nBook's name:"+b.getBookname()+"\nPrice:"+b.getPrice()+"\nQuantity:"+b.getQtyInStock());
			
		}
}
