
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyLockExample implements Runnable{

	private Resource resource;
	private Lock lock;
	private int id;
	
	public ConcurrencyLockExample(Resource r,int i){
		this.resource = r;
		this.id = i;
		this.lock = new ReentrantLock();
	}
	
	public int getId() {
		return this.id;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Running worker: "+this.id);
			if(lock.tryLock(1, TimeUnit.SECONDS)/*lock.tryLock()*/){
			resource.doSomething();
			}
		} catch (Exception e) {
			System.out.println("Exception ...."+id + " ");
			e.printStackTrace();
		}finally{
			System.out.println("Unlocking lock for "+id);
			//release lock
			lock.unlock();
		}
		resource.doLogging();
	}

}
