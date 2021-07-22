package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		//Computer c1 = new Computer();
		Computer c2 = new Desktop();
		//Computer c3 = new NoteBook();
		
		Computer c4 = new MyNotebook();
		
		c2.display();
		c4.display();
		
	}

}
