
public class Book extends Author {
 public Book(String Bookname, String email, Character gender) {
		super(Bookname, email, gender);
		// TODO Auto-generated constructor stub
	}
public String Bookname;
 public Double price;
 public int qtyInStock;
public Book(String name, String email, Character gender, String bookname, Double price, int qtyInStock) {
	super(name, email, gender);
	Bookname = bookname;
	this.price = price;
	this.qtyInStock = qtyInStock;
}
public String getBookname() {
	return Bookname;
}
public void setBookname(String bookname) {
	Bookname = bookname;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public int getQtyInStock() {
	return qtyInStock;
}
public void setQtyInStock(int qtyInStock) {
	this.qtyInStock = qtyInStock;
}
 
}