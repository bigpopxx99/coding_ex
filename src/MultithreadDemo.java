import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultithreadDemo {

	public static void main(String[] args) {
//		doRunnableTest();
		doCallableTest();
		

        
	}
	
	private static void doCallableTest() {
		ExecutorService service = Executors.newCachedThreadPool();
		List<Future<String>> taskList = new ArrayList<Future<String>>();
		
		for (int i=0; i<10; i++) {
			Future<String> task = service.submit(new MyCallableTask(i));
			taskList.add(task);
		}
		
		List<Integer> finishList = new ArrayList<Integer>();
		for (int i=0; i<taskList.size(); i++) {
			finishList.add(i, 0);
		}
		
		while (getFinishedNum(finishList) < 10) {
			
			for (int j=0; j<taskList.size(); j++) {
				if (taskList.get(j).isDone() && finishList.get(j) == 0) {
					try {
						System.out.println(taskList.get(j).get());
						finishList.set(j, 1);
					} catch (InterruptedException | ExecutionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}	
		System.out.print("all done");
	}
	
	private static int getFinishedNum(List<Integer> list) {
		int ret = 0;
		for (int i=0; i<list.size(); i++) {
			if (list.get(i) == 1) {
				ret++;
			}
		}
		return ret;
	}
	
	
	private static void doRunnableTest() {
//      Saler saler = new Saler();
//      Producter producter = new Producter(saler);
//      Consumer consumer = new Consumer(saler);
//      new Thread(producter).start();
//      new Thread(consumer).start();
//      
//      Thread[] threads = new Thread[Thread.activeCount()];
//      int n = Thread.enumerate(threads);
//      System.out.println("there are " + n + "threads");
//      for (int i=0; i<n; i++) {
//      	System.out.println("No." + i + ":" + threads[i]);
//      }
		Saler saler = new Saler();
		ExecutorService threadPool = Executors.newCachedThreadPool();
		//ExecutorService threadPool = Executors.newFixedThreadPool(1);  //newFixedThreadPool,指定线程池的大小，如果线程池中的线程全部都处于活动状态，则新申请的线程会在等待队列中，直到等到有可用的线程
		threadPool.execute(new Producter(saler));
		threadPool.execute(new Consumer(saler));
	}

}

class Saler {
	
	private int productNum = 0;
	
	public void produce() {
		synchronized (this) {
			if (this.productNum >= 20) {
				try {
					System.out.println("?????? no enough space to store, waiting consume here, now total product num is:" + this.productNum);
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				this.productNum++;
				System.out.println("++++++ produce a new product, now total product num is:" + this.productNum);
				notifyAll();
			}
		}
	}
	
	public void consume() {
		synchronized (this) {
			if (this.productNum <= 0) {
				try {
					System.out.println("?????? no more product, waiting produce here, now total product num is:" + this.productNum);
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				this.productNum--;
				System.out.println("------ consume a product, now total product num is:" + this.productNum);
				notifyAll();
			}
			
		}
	}
	
}



class Producter implements Runnable{
	
	private Saler mSaler;
	
	public Producter(Saler saler) {
		this.mSaler = saler;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Random random = new Random(System.currentTimeMillis());
				Thread.sleep(3*random.nextInt(1000));
			    this.mSaler.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable{
	private Saler mSaler;
	
	public Consumer(Saler saler) {
		this.mSaler = saler;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Random random = new Random(System.currentTimeMillis());
				Thread.sleep(6*random.nextInt(1000));
			    this.mSaler.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyCallableTask implements Callable<String> {
	
	private int mNum;
	
	public MyCallableTask(int num) {
		this.mNum = num;
	}

	@Override
	public String call() throws Exception {
		int timeToSleep = (10 - this.mNum) * 1000;
		System.out.println("start a callable task, num is:" + this.mNum + " i want to sleep:" + timeToSleep + "seconds");
		Thread.sleep(timeToSleep);
		return "task finished, my num is:" + this.mNum;
	}
	
}
