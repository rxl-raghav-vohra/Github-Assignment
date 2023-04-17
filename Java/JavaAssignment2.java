import java.io.*;
import java.util.*;

class Parent { // Superclass (parent)
  public void printParent() {
    System.out.println("This is a parent class");
  }
}

class Child extends Parent { // Subclass (child)
  public void printChild() {
    //super.printParent(); // Call the superclass method
    System.out.println("This is a child class");
  }
}

class Employee {
 
    int salary;
    String name;
    String doj;
 
    // employee class constructor
    
    Employee(int salary, String name,String doj)
    {
        this.salary = salary;
        this.name = name;
        this.doj = doj;
    }
 
    // display() method to display
    // the employee data
    public void display()
    {
        System.out.println("Salary is: " + salary + " "
                           + ", employee name is: "
                           + name + " " + "and date of Joining is : " + doj);
        System.out.println();
    }
}

class Member{
	String name;
	int age;
	String phone;
	String address;
	int salary;
	
	Member(String name,int age,String phone,String address,int salary){
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.salary = salary;	
	}
	
	public void printSalary(){
		System.out.println("NAME is " + name + "Age is " + age + "Phone is " + phone + "Address is " + address + 
				"Salary is " + salary);
	}
}

class Employee2 extends Member{
	public String specialisation;
	
	Employee2(String name,int age,String phone,String address,int salary, String specialisation){
		super(name, age, phone, address, salary);
		this.specialisation = specialisation;
	}
	
	public void printSpecial(){
		System.out.println("Specialisation is " + specialisation);
	}
}

class Manager extends Member{
	public String department;
	
	Manager(String name,int age,String phone,String address,int salary, String department){
		super(name, age, phone, address, salary);
		this.department = department;
	}
	
	public void printDeptt(){
		System.out.println("Department is " + department);
	}
}

class JavaAssignment2{

	public static void main(String[] args){
	
	Scanner scn= new Scanner(System.in);    //System.in is a standard input stream 
	//ans1
	
	/*
	int[] arr = new int[20];

	for(int i=0;i<20;i++){
	    int curr = scn.nextInt();
	    arr[i] = curr;	
	}
	int posInteger = 0 , negInteger = 0 , Zeroes = 0 , odds = 0 , evens = 0;
	
	for(int i=0;i<20;i++){
	   if(arr[i]==0){Zeroes++;}
	   
	   if(arr[i]>0)
	    {posInteger++;}
	   else
	    {negInteger++;}
	    
	   if(arr[i]%2==0)
	     {odds++;}
	   else
	     {evens++;}  
	   	
	}
	
	System.out.println("No. of positive integer : " + posInteger);
	System.out.println("No. of negative integer : " + negInteger);
	System.out.println("No. of odds integer : " + odds);
	System.out.println("No. of evens integer : " + evens);
	System.out.println("No. of Zeroes : " + Zeroes);
	*/
	
	//ans2
	/*
	int[] arr = new int[10];

	for(int i=0;i<10;i++){
	    int curr = scn.nextInt();
	    arr[i] = curr;	
	}
	
	int[] one = new int[5];
	int[] two = new int[5];
	
	for(int i=0;i<5;i++){
	    one[i] = arr[i];
	}
	for(int i=0;i<5;i++){
	    two[i] = arr[i+5];
	}
	
	System.out.println("elements of first array");
	for(int i=0;i<5;i++){
	    System.out.print(one[i] + " ");	
	}
	System.out.println();
	
	System.out.println("elements of second array");
	for(int i=0;i<5;i++){
	    System.out.print(two[i] + " ");	
	}
	*/
	
	/*ans3
	Parent par = new Parent();
	par.printParent();
	
	Child chld = new Child();
	chld.printChild();
	*/
	
	/*ans4
	Employee[] arr = new Employee[10];
 
 
        arr[0] = new Employee(17012, "Satyabrata" , "1-Jan");
        arr[1] = new Employee(170128, "Omm Prasad" , "3-Feb");
        arr[2] = new Employee(17128, "Tara" , "13-Feb");
        arr[3] = new Employee(10128, "Lakshay" , "9-Feb");
        arr[4] = new Employee(1028, "Abhishek" , "3-Mar");
        arr[5] = new Employee(1128, "Ankit" , "13-apr");
        arr[6] = new Employee(1728, "Aman" , "8-Feb");
        arr[7] = new Employee(170128, "Krishna" , "5-Feb");
        arr[8] = new Employee(128, "Raj" , "10-apr");
        arr[9] = new Employee(1028, "Ram" , "12-may");
        
 
        // Displaying the employee data
        for(int i=0;i<10;i++){
        	System.out.println("Employee data is represented as : " + i + " " );
        	arr[i].display();
        }
        
        */
        
        /*ans5
         
        String str = scn.nextLine();
        StringBuilder sb = new StringBuilder();
        char first = str.charAt(0), second= 'b';
        int i, n = str.length();
        for(i=1;i<n;i++){
        //System.out.println(str.charAt(i));
		if(str.charAt(i)>='a' && str.charAt(i)<='z'){
			continue;
		}
		if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
			continue;
		}
		else{
			second = str.charAt(i+1);
		 	break;
		}
        }
        sb.append(first);
        sb.append(".");
        sb.append(second);
        sb.append(".");
        boolean flag = false;
        for(int k=i+1;k<n;k++){
        System.out.println(str.charAt(i));
               if(Character.isWhitespace(str.charAt(i)) == true)
               {	flag = true;
               	continue;
               }
               
               if(flag==false){continue;}
               else
        	sb.append(str.charAt(i));
        }
        System.out.print(sb.toString());
        */
        
        /*ans5 --> correct method
        String str = scn.nextLine();
        
        String[] arrOfStr = str.split(" ");
  
        //for (String a : arrOfStr)
            //System.out.println(a);
        
        if(arrOfStr.length==2){
        	System.out.print(arrOfStr[0].charAt(0) + "." + arrOfStr[1]);
        }    
         if(arrOfStr.length==3){
        	System.out.print(arrOfStr[0].charAt(0) + "." + arrOfStr[1].charAt(0) + "." + arrOfStr[2]);
        }    
        
        */
        
        /*ans6
        equality operator check the address , while (.=) check the actual characters of the string.
        */
        
        /*ans7
        StringBuilder is non - synchronised , i.e not threadsafe.It means two threads can call methods of stringBuilder simultaneously.
        StringBuffer is synchronised , i.e threadsafe . It means two threads can't call methods of stringbuffer simultaneously.
        
        StringBuilder is more efficient than stringbuffer.
        */
        
        /*ans8
        final variable : variable can not be changed and redefined.
        final method : can be redefined and cannot be overriden.
        final class : it can't be inherited
        */
        
        /*
        ans9
        if we use exit , then finally block will not run
        */
        
        /*ans10
        In shallow copy , only field of primitive data type are copied while object reference are not copied.. 
        In deep copy , both primitive data type and object reference are copied..
        */
        
        /*ans11
        It will give arithematic exception when divided by zero.
        */
        
        /*ans12
        As finally we always run , so it recommended to use finally block. 
        */
        
        /*ans13
        It will give ArrayOutOfBoundException , since array is 0-index based.
        */
        
        /*ans14
        A).2 object will be created.
        B).1 object will be created.
        C).3 object will be created.
        */
        
        /*ans15
        by using st.isEmpty() function.
        another method : if(st.size()==0) , it represents string is empty
        */
        
        /*ans16
        addAll() method is used for adding one ArrayList into another
        */
        
        /*ans17
        Arrays.fill() will be used to fill all elements in the array
        */
        
        /*ans18
        The main purpose of generics is to provide type safety and to resolve the typecasting problem.
        -> Arrays are type safe, the type of elements inside the array is ensured.
        -> If we declaring string type array , then only string type can be stored inside that particular array.
        -> It is not possible to add any other type of element in that particular string array
        */
        
        /*ans19
        Comparable : It provide single sorted sequence with help of compareTo() method.
        We can sort list element of comparable type by Collections.sort(list).
        e.g : We can sort on the basis of single element such as id,name or price.
        
        Comparator : It provide multiple sorted sequence with help of compare() method.
        We can sort list element of comparator type by Collections.sort(List,Comparator) method.
        e.g : We can sort on the basis of multiple element such as id,name or price.
        */
        
        /*ans20
        The throw keyword in java is used to explicitly throw an exception from a method or block of code.
        */
        
        /*ans21
        == checks the actual characters of the string
        */
        
        /*ans22        
        Employee2 emp = new Employee2("Raghav",23,"8700042640","Nirankari Colony",35000,"Engineer");
        Manager man = new Manager("Mayank",30,"9990191029","Nirankari Colony",60000,"Forensic");
        
        emp.printSalary();
        emp.printSpecial();
        man.printSalary();
        man.printDeptt();
        */
        
} 

}
