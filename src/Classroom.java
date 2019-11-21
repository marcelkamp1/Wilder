public class Classroom{
	
	public static void main(String[] args) {
		Wilder marcel = new Wilder("Marcel", true);
		marcel.whoamI();
		
		Wilder steffi = new Wilder("Stephanie", true);
		steffi.whoamI();
		
		Wilder martin = new Wilder("Martin", true);
		martin.setPresent(false);
		martin.whoamI();
		
		Wilder michael = new Wilder("Michael", false);
		michael.whoamI();
		
	}
}