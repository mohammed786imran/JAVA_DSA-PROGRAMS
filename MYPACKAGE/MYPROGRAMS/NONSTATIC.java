package MYPACKAGE;

public class NONSTATIC {
	
	int count=0;
	NONSTATIC()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		NONSTATIC CME=new NONSTATIC();
		NONSTATIC ITI=new NONSTATIC();
		NONSTATIC ECE=new NONSTATIC();
	// TODO Auto-generated method stub
	}

}
