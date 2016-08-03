class DisplayTools{
	
	static void printDash()
	{
		System.out.println("________________________________________________________________________________");
	}
	
	static void clearConnecting()
		{
			for(int i=0;i<13;i++)System.out.print("\b");
			System.out.println("Connected!");
			printDash();
		}
		
	static void insertBackspace(int n)
	{
		for(int i=0;i<n;i++)System.out.print("\b");
	}
	
	static void titleShow(){
		
		String title =  "       _   __  __                                                         \n"+
						"      | | |  \\/  |                                                        \n"+
						"      | | | \\  / |   ___   ___   ___    ___   _ __     __ _    ___   _ __ \n"+
						"  _   | | | |\\/| |  / _ \\ / __| / __|  / _ \\ | '_ \\   / _` |  / _ \\ | '__|\n"+
						" | |__| | | |  | | |  __/ \\__ \\ \\__ \\ |  __/ | | | | | (_| | |  __/ | |   \n"+
						"  \\____/  |_|  |_|  \\___| |___/ |___/  \\___| |_| |_|  \\__, |  \\___| |_|   \n"+
						"                                                       __/ |              \n"+
						"                                                      |___/               \n";

 
		System.out.print(title);
	}
}
