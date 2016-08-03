class JC implements Runnable{
	
	public void run()
	{
		JMClient jc = new JMClient();
		jc.runClient();
	}
}

class JS implements Runnable{
	
	public void run()
	{
		JMServer js = new JMServer();
		js.runServer();
	}
}
