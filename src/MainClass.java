import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MainClass {

	public static void main(String[] args) {
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
		
		for (int i = 0; i < 10; i++)
        {
			ConcurrencyLockExample worker = new ConcurrencyLockExample(new Resource(),i);
            executor.execute(worker);
        }
		
		// TODO Auto-generated method stub
		/*ConcurrencyLockExample worker = new ConcurrencyLockExample(new Resource());
		Thread th = new Thread(worker);
		th.start();*/
	}

}
