import java.util.Scanner;

// ลบ public ออกจากหน้า class นี้เพื่อให้เขียนรวมในไฟล์เดียวได้
class MyRectangle {
    public double length;
    public double width;
    public double area;

    public double calculateArea() {
        this.area = this.length * this.width;
        return this.area;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        this.length = input.nextDouble();
        System.out.print("Enter width: ");
        this.width = input.nextDouble();
    }
}

// ชื่อ class นี้ต้องตรงกับชื่อไฟล์ (TestDriver.java)
public class TestDriver {
    public static void main(String[] args) {
        MyRectangle rectangle = new MyRectangle();
        rectangle.input();
        double result = rectangle.calculateArea();
        System.out.println("The area of the rectangle is: " + result);
    }
}