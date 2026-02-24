import java.util.Scanner;

public class Rectangle {
    private static int length;
    private static int width;
    private static int area;

    public static void main(String[] args) {
        System.out.println("--- Rectangle Calculator ---");
        
        inputDimensions();
        
        area = calcArea(length, width);
        
        System.out.println("The area of the rectangle is: " + area);
    }

    public static int calcArea(int l, int w) {
        return l * w; 
    }

    public static void inputDimensions() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter length: ");
            length = input.nextInt();
            System.out.print("Enter width: ");
            width = input.nextInt();
        } finally {
        }
    }
}