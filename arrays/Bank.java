class Bank{
	static int[] branchCode = {45897,98675,986587,98697};
	public static void main(String []a){
		System.out.println(branchCode[2]);
		branchCode[2]=100001;
		System.out.println(branchCode[2]);
		System.out.println(branchCode[3]);
		int size=branchCode.length;
		System.out.println(branchCode[size]);
		}
		}