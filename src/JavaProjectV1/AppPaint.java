package JavaProjectV1;

public class AppPaint {
	public static void main(String[] args) throws Exception {
		 SwingButton menu= new SwingButton();
		 //MenuV2 menu= new MenuV2();
		 int choice; 
		// LineDrawer l = new LineDrawer();
		 //we let the time for the user to select an item 
		 // in the menu before attributing a value to the
		 // variable choice, otherwise choice=0;
		 Thread.sleep(5000);
		 choice = menu.getChoice();
		 System.out.println("your choice :"+choice);
		 
		 // now we succeeded to get the choice of the user
		 // we can use it 
		
	}
}
