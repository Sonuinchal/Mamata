class Application{
 static long studentdetails(String[]args){
  for(int i=0; i<args.length ; i++){
  System.out.println(args[i]);
     }
         return 56;
   }

   static void personaldetails( long marks ,String []args){
    System.out.println("student details contains educational marks");
    for(int i=0; i<args.length ; i++){
    System.out.println(args[i]  +"\t" +marks);
        }
       
    }
	static void calculate( String []args, long marks ,int numbers){
       System.out.println("student details contains subject marks");
        for(short i=0 ; i< args.length ; i++){
          System.out.println(args[i] + "\t" +numbers + "\t" +marks);
}
	}
}
