public class PassByValue {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Before calling the method: " + number);
        
        // Calling the method
        increment(number);
        
        System.out.println("After calling the method: " + number);
    }
    
    public static void increment(int num) {
        num = num + 1;
        System.out.println("Inside the method: " + num);
    }
}
