package MYPACKAGE;
public class THIS {
	int rollno;
	String name;
	float fee;
	THIS(int rollno,String name,float fee)
	{
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
	}
  void display()
	{
	System.out.println(rollno+" "+name+" "+fee);
	}
	class students
	{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
        THIS t1=new THIS(1,"MOHAMMED",5000f);
		THIS t2=new THIS(2,"IMRAN",6000f);
			t1.display();
			t2.display();
		// TODO Auto-generated method stub
	}
	}
}
