
public class Resource {

	public void doSomething(){
		//do some operation, DB read, write etc
		System.out.println("DOING SOMETHING .... ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doLogging(){
		//logging, no need for thread safety
		System.out.println("DOING LOGGING .... ");
	}
}