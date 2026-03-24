public class PassByValue {
    public static void main(String[] args) {
        int x = 1000;
        addNumber(x);
        System.out.println("X " + x); 
    }

    // Added the 'static' keyword here
    public static void addNumber(int number) {
        number++;
    }
}