import java.util.LinkedList;
class producer_consumer
{
	public static void main(String[] args) throws InterruptedException
	{
		final PC pc = new PC();
		// Producer
		Thread t1 = new Thread(new Runnable()
		{
			public void run()
			{
				try
				{
					pc.produce();
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
		});
		// Consumer
		Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				try
				{
					pc.consume();
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
		});

		// Start threads
		t1.start();t2.start();

		// t1 finishes before t2 (t1 is producer)
		t1.join();t2.join();
	}

	public static class PC
	{
		LinkedList<Integer> l = new LinkedList<>();
		int cap = 3;
		public void produce() throws InterruptedException
		{
			// Integer v = Integer.MAX_VALUE - 10;
			int v = 0;
			while(true)
			{
				synchronized(this)
				{
					while(l.size() == cap)
						wait();
					System.out.println("Producer produced: "+v);
					l.add(v++);

					notify();
					// Thread.sleep(2500);
				}
			}
		}
		public void consume() throws InterruptedException
		{
			while(true)
			{
				synchronized(this)
				{
					// int a = l.size();
					while(l.size() == 0)
						wait();
					int val = l.removeFirst();
					System.out.println("Consumer consumed: "+val);

					notify();
					// Thread.sleep(2500);
				}
			}
		}
	}
}