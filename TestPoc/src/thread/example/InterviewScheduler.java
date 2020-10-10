package thread.example;

import java.util.concurrent.BlockingQueue;

public class InterviewScheduler implements Runnable{
	
	private BlockingQueue<String> queue;
	
	InterviewScheduler(BlockingQueue<String> queue){
		this.queue = queue;
	}

	@Override
	public void run() {
		for(int i=1; i<=10; ++i) {
			String msg= "Candidate::"+i;
			try {
				queue.put(msg);
				System.out.println("Interview Scheduled for "+msg);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		System.out.println("Interview scheduled for all candidates");
		String msg= "stop";
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
