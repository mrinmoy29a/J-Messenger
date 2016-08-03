class Main{
	
	
	public static void main(String[] args)
	{
		
		Thread jc = new Thread(new JC());
		Thread js = new Thread(new JS());
		
		DisplayTools.titleShow();
		js.start();
		
		StartMenu.show();
		jc.start();
	}
}
		
