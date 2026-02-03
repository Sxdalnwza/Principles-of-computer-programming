public class TestDriver {
    public static void main(String[] args) {
        System.out.println("=== การประกาศตัวแปรประเภทต่างๆ ใน Java ===");

        // 1. จำนวนเต็ม (Integers)
        byte b = 10; // 8-bit (-128 ถึง 127)
        short s = 200; // 16-bit
        int i = 1000; // 32-bit (ใช้บ่อยที่สุด)
        long l = 10000000000L; // 64-bit (ต้องลงท้ายด้วย L)

        System.out.println("\n--- จำนวนเต็ม ---");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);

        // 2. ทศนิยม (Floating Points)
        float f = 3.14f; // 32-bit (ต้องลงท้ายด้วย f)
        double d = 3.14159265; // 64-bit (ใช้บ่อยที่สุดสำหรับทศนิยม)

        System.out.println("\n--- ทศนิยม ---");
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        // 3. ตัวอักษร (Character)
        char c = 'A'; // เก็บตัวอักษรเดียว ใน single quotes
        char unicode = '\u0E01'; // ก ไก่ (Unicode)

        System.out.println("\n--- ตัวอักษร ---");
        System.out.println("char: " + c);
        System.out.println("unicode: " + unicode);

        // 4. ค่าความจริง (Boolean)
        boolean isJavaFun = true;
        boolean isHard = false;

        System.out.println("\n--- ค่าความจริง ---");
        System.out.println("สนุกไหม: " + isJavaFun);
        System.out.println("ยากไหม: " + isHard);

        // 5. ข้อความ (String) - ไม่ใช่ Primitive Type แต่ใช้บ่อย
        String message = "สวัสดี Java";

        System.out.println("\n--- ข้อความ ---");
        System.out.println("ข้อความ: " + message);

        // 6. การใช้ var (Type Inference - Java 10+)
        var name = "สมชาย"; // คอมไพเลอร์รู้เองว่าเป็น String
        var age = 25; // คอมไพเลอร์รู้เองว่าเป็น int

        System.out.println("\n--- การใช้ var ---");
        System.out.println("ชื่อ: " + name + ", อายุ: " + age);
    }
}
