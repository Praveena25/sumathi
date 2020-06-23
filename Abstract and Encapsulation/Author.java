
public class Author {
    public String Authorname; 
    public String email;
    public Character gender;
	public Author(String authorname, String email, Character gender) {
		super();
		Authorname = authorname;
		this.email = email;
		this.gender = gender;
	}
	public String getAuthorname() {
		return Authorname;
	}
	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}

    
}
