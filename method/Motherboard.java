class Motherboard{
  static int model(String []args){
  for(byte no=0 ; no<args.length ; no++){
  System.out.println(args[no]);
       }
      return 1;
   }

  
  static void keys(String []types ,String []args){
	System.out.println("Motherboard is uses to type the numbers n names.");
	for(byte no=0; no<args.length ;no++){
	System.out.println(args[no] +"\t" +types);
   }
 }

  static void functions(int numbers ,String []types ,String []args){
	System.out.println("Motherboard is uses to type the numbers n names.");
	for(byte no=0; no<args.length ;no++){
	System.out.println(args[no] +"\t" +types);
    }
  }
}
 