public class Wilder{
	
	//attributes
	private String firstname;
	private boolean present;
	
	//constructor
	public Wilder(String firstname, boolean present){
		this.firstname = firstname;
		this.present = present;
	}
	
	//method
	public void whoamI() {
		if(present)
		System.out.println("My name is " + this.firstname + " and I'm present!");
		else
		System.out.println("My name is " + this.firstname + " and I'm not present!");}
	
	//getter
	public String getName() {
		return this.firstname;
	}
	
	public boolean isPresent() {
		return this.present;
	}
	
	//setter
	public void setName(String name) {
		this.firstname = name;
	}
	
	public void setPresent(boolean present) {
		this.present = present;
	}
}