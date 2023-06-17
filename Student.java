public class Student {  
//instance variables of the class  
int id;  
String name; 
float overall_score; 
  
Student(){  
System.out.println("this a default constructor");  
}  
  // parameterized constructor
Student(int i, String n){  
id = i;  
name = n;  
} 

Student(int i, String n, float o){
id = i;
name = n;
overall_score = o;
} 
  

public static void main(String[] args) {  
//object creation  
Student s = new Student();  
System.out.println("\nDefault Constructor values: \n");  
System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);  
  
System.out.println("\nParameterized Constructor values: \n");  
Student student = new Student(10, "David");  
System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  

System.out.println("\nParameterized Constructor values with 3 Parameter: \n");  
Student student1 = new Student(10, "David" , 89);  
System.out.println("Student Id : "+student1.id + "\nStudent Name : "+student1.name + "\nOverall_Score" + student1.overall_score);  
}  
}  