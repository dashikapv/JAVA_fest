//Java Program to demonstrate the use of static variable  
class Student{  
   int rate;//instance variable  
   String name;  
   static String band ="BTS";//static variable  
   //constructor  
   Student(int r, String n){  
   rate = r;  
   name = n;  
   }  
   //method to display the values  
   void display (){
      System.out.println(rate+" "+name+" "+band);}  
}  
//Test class to show the values of objects  
public class TestStaticVariable1{  
 public static void main(String args[]){  
 Student s1 = new Student(5,"HOBI");  
 Student s2 = new Student(4,"SUGA");  
 //we can change the band of all objects by the single line of code  
 //Student.band="Bangtan Seonyandan";  
 s1.display();  
 s2.display();  
 }  
}  