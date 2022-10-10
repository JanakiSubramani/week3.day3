package week3.day3;

public class LearnConstructor {
	int empId;
	String empName;
	boolean empStatus;
	
	LearnConstructor(){
		System.out.println("This is Default Constructor");
		empId=100;
		empName="Janaki";
		empStatus=true;
	}
	LearnConstructor(int id,String name,boolean status){
		System.out.println("This is Parameterized Constructor");
		empId=id;
		empName=name;
		empStatus=status;
	}
	public static void main(String[] args) {
		LearnConstructor lc =new LearnConstructor(10,"Janaki",true);
		System.out.println("Emp ID is: " +lc.empId);
		System.out.println("Emp name is: "+lc.empName);
		System.out.println("Emp still working: "+lc.empStatus);
		
	}
	}
