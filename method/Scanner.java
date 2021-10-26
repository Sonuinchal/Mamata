class Scanner{
  static int printer(String []args){
  for(int i=0 ; i<args.length ; i++){
  System.out.println(args[i]);
       }
      return 1;
   }
  
  static void colorprinter( String []args ,int numbers ){
   System.out.println("shoes have varity of color");
  for(int i=0 ; i<args.length ; i++){
  System.out.println(args[i] + "\t" +numbers);
      }
   
}
     static void scan( String []args, byte price,int numbers){
       System.out.println("shoes are perfect for walking and runing");
        for(byte i=0 ; i<args.length ; i++){
          System.out.println(args[i] + "\t" +numbers + "\t" +price);
       }
   }

}