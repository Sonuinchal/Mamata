class TestTime{
public static void main(String []args){
	int hours=10;
	byte mins=4;
	String zone="GMT+5.30";
Time.currtime();
Time.currtime(hours,mins);

System.out.println("timezone is "+Time.timezone(zone)); 

}

}
