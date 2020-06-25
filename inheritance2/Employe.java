
public class Employe extends Person {
public double annualsalary;
public int year;
public String insurenumber;
public Employe(String name, double annualsalary, int year, String insurenumber) {
	super(name);
	this.annualsalary = annualsalary;
	this.year = year;
	this.insurenumber = insurenumber;
}
public double getAnnualsalary() {
	return annualsalary;
}
public void setAnnualsalary(double annualsalary) {
	this.annualsalary = annualsalary;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getInsurenumber() {
	return insurenumber;
}
public void setInsurenumber(String insurenumber) {
	this.insurenumber = insurenumber;
}

}
	