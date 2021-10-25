class Fresher
{
	static byte[] numbers={1,2,3,4,5,6};
	static short[] odd_numbers={1,3,5,7,9,11};
	static int[] even_numbers={2,4,6,8,10,12};
	static long[] id_numbers={102431, 435251,776851};
	static float[] ph_numbers={1.0f,2.0f,3.0f,4.0f};
	static double[] dec_numbers={1.2,2.3,3.4,4.5,5.6,};
	static char[] alpha ={'a','b','c','d','e'};
	static boolean[] is_java_fun={true,false};
	
	
	 public static void main(String []args){
				for(int i=0; i<numbers.length; i++)
				System.out.println(numbers[i]);
				
				for(int i=0; i<odd_numbers.length;i++)
				System.out.println(odd_numbers[i]);
				
				for(int i=0;i<even_numbers.length;i++)
				System.out.println(even_numbers[i]);
				
				for(int i=0;i<id_numbers.length;i++)
				System.out.println(id_numbers[i]);
				
				for(int i=0;i<dec_numbers.length;i++)
				System.out.println(dec_numbers[i]);
				
				for(int i=0;i<alpha.length;i++)
				System.out.println(alpha[i]);
				
				for(int i=0;i<is_java_fun.length;i++)
				System.out.println(is_java_fun[i]);
				}
		}