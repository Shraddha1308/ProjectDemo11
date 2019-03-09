package Javaprogram;

public class Option1 {

	public static void main(String[] args) {
		Employee abc=new Employee();
		abc.empno=12345678;
		abc.empname="abc";
		abc.empsal=12000;
		
		Employee xyz=new Employee();
		xyz.empno=45793198;
		xyz.empname="xyz";
		xyz.empsal=10000;
		
		
System.out.println("Employee no is \n"+abc.empno);
System.out.println("Employee name is \n"+abc.empname);
System.out.println("Employee salary is \n"+abc.empsal);

System.out.println("Employee no is \n"+xyz.empno);
System.out.println("Employee no is \n"+xyz.empname);
System.out.println("Employee no is \n"+xyz.empsal);
	}

}
