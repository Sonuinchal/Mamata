class TestAnimals{
 public static void main(String []args){
 
 Animals ani= new Animals();
 System.out.println(ani.name);
System.out.println(ani.weight);
 System.out.println(ani.bread);
 System.out.println(ani.height);
 System.out.println(ani.colour);
  
  ani.pet();
 String res= ani.eatingfood();
  System.out.println(res);
 
 
   }

}