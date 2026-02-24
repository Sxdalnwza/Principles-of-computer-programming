import java.util.Scanner;

public class MyRectangle {
    public double length;
    public double width;
    public double area;

    // แก้ไขสูตรการคำนวณพื้นที่
    public double calculateArea() {
        this.area = this.length * this.width; // ใช้ * แทนการใช้ = ซ้อนกัน
        return this.area;
    }

    public void input() {
        // เพิ่มจุดระหว่าง System และ in
        Scanner input = new Scanner(System.in); 
        
        // แก้คำผิดจาก legth เป็น length และใช้ System.out ปกติ
        System.out.print("Enter length: "); 
        this.length = input.nextDouble();
        
        System.out.print("Enter width: ");
        this.width = input.nextDouble();
    }
    
    // เพิ่ม Main Method สำหรับทดสอบรันโปรแกรม
    public static void main(String[] args) {
        MyRectangle rect = new MyRectangle();
        rect.input();
        double result = rect.calculateArea();
        System.out.println("The area of the rectangle is: " + result);
    }
}