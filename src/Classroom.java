public class Classroom{
	
	public static void main(String[] args) {
		Wilder marcel = new Wilder("Marcel", true);
		marcel.whoAmI();
		
		Wilder steffi = new Wilder("Stephanie", true);
		steffi.whoAmI();
		
		Wilder martin = new Wilder("Martin", true);
		martin.setPresent(false);
		martin.whoAmI();
		
		Wilder michael = new Wilder("Michael", false);
		michael.whoAmI();
		
	}
}
