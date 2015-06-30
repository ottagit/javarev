package Thread;

public class Relay {
	public static void main(String args[])
	{
		Racer rcr = new Racer();
		
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group1");
		ThreadGroup grp3 = new ThreadGroup("Group1");
		ThreadGroup grp4 = new ThreadGroup("Group1");
		ThreadGroup grp5 = new ThreadGroup("Group1");
		
		Thread t = new Thread(grp1, rcr, "Thread_0");
		Thread t1 = new Thread(grp1, rcr, "Thread_1");
		Thread t2 = new Thread(grp2, rcr, "Thread_2");
		Thread t3 = new Thread(grp2, rcr, "Thread_3");
		Thread t4 = new Thread(grp3, rcr, "Thread_4");
		Thread t5 = new Thread(grp3, rcr, "Thread_5");
		Thread t6 = new Thread(grp4, rcr, "Thread_6");
		Thread t7 = new Thread(grp4, rcr, "Thread_7");
		Thread t8 = new Thread(grp5, rcr, "Thread_8");
		Thread t9 = new Thread(grp5, rcr, "Thread_9");
		
		t.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t4.setPriority(Thread.NORM_PRIORITY);
		t5.setPriority(Thread.NORM_PRIORITY);
		t6.setPriority(Thread.NORM_PRIORITY);
		
		t7.setPriority(Thread.MIN_PRIORITY);
		t8.setPriority(Thread.MIN_PRIORITY);
		t9.setPriority(Thread.MIN_PRIORITY);
		
		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		
	}

}
