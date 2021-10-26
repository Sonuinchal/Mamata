class Solarsystem{
	static int planets(String []grahas){
		for( int no=0 ;no<grahas.length; no++){
			System.out.println( grahas[no] );
		}
		return 1;
	}

	static void planets(int numbers , String []grahas){
		
		for( int no=0 ;no<grahas.length; no++){
			
	      System.out.println( grahas[no] +"\t" +numbers);	
	}
   }
   static void orbit( String []args, char earth ,int numbers){
       System.out.println("Solarsystem conatins 9 planets");
        for(char i=0 ; i< args.length ; i++){
          System.out.println(args[i] + "\t" +numbers + "\t" +earth);
}
	}
}
 

 