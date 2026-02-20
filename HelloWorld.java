public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        // Simple example: print numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }
        
        // Simple example: calculate sum
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of 1 to 5: " + sum);
    }
}