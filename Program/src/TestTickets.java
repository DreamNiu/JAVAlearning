//package shiyan8.zxq;

	class A implements Runnable
	{
	public int tickets = 100;
	String str = new String("込込");
		
	public void run()  
	{
		String str = "込込";  
		
		while (true)
		{
			synchronized (str)  
			{
				if (tickets > 0)
				{
					System.out.printf("%s_________%d\n",
						Thread.currentThread().getName(), tickets);
					--tickets;	
				}
				else
				{
					break;
				}
			}
		}		
	}
	}

	public class TestTickets
	{
	public static void main(String[] args)
	{
		A aa = new A();
		Thread t1 = new Thread(aa);
		t1.start();	
		
		Thread t2 = new Thread(aa);
		t2.start();
		
		Thread t3 = new Thread(aa);
		t3.start();
		
		Thread t4 = new Thread(aa);
		t4.start();
		
		Thread t5 = new Thread(aa);
		t5.start();
			
	}
	
}
