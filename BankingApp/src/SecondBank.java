
public class SecondBank {
	
	public static void main(String[] args) {
		Account harry = new Account("Harry Smith", "A00001");
		harry.showMenu();
		
		Account newUser = new Account("John Doe", "A00002");
		newUser.showMenu();
	}

}
