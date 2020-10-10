package thread.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueEg1 {

	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
		InterviewScheduler schedulerProducer = new InterviewScheduler(queue);
		InterviewProcessor processorConsurmer = new InterviewProcessor(queue);
		new Thread(schedulerProducer).start();
		new Thread(processorConsurmer).start();
	}

}
