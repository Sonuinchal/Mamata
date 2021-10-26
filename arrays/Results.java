class Results{
	public static void main(String []marks){
		for(int mark=0; mark<marks.length; mark++){
			String cgpa = marks[mark];
			float per= Float.parseFloat(cgpa);
			int percentage = Integer.parseInt(cgpa);
			long pers= Long.parseLong(cgpa);
			double perc = Double.parseDouble(cgpa);
			short perce = Short.parseShort(cgpa);
			boolean isTrue = Boolean.parseBoolean(cgpa);
		

			
		System.out.println(cgpa + "\t" + per + "\t" + percentage + "\t" + pers + "\t" + perc + "\t" + perce + "\t" + isTrue + "\t" + a);
			  
			 }
			 
	}
}
