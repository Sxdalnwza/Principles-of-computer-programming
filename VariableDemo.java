public class VariableDemo {
    public static void main(String[] args) {
        System.out.println("=== การประกาศตัวแปรแบบต่างๆ (Variable Declaration) ===");

        // 1. จำนวนเต็ม (Integer types)
        byte b = 10;
        short s = 200;
        int i = 5000;
        long l = 9000000000L; // ต้องมี L ต่อท้าย

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);

        // 2. จำนวนจริง/ทศนิยม (Floating-point types)
        float f = 3.14f; // ต้องมี f ต่อท้าย
        double d = 123.456;

        System.out.println("float: " + f);
        System.out.println("double: " + d);

        // 3. ตัวอักษร (Character)
        char c = 'A';
        char thai = 'ก';

        System.out.println("char: " + c);
        System.out.println("char (thai): " + thai);

        // 4. ตรรกะ (Boolean)
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("boolean true: " + isTrue);
        System.out.println("boolean false: " + isFalse);

        // 5. ข้อความ (String)
        String message = "Hello Java";

        System.out.println("String: " + message);
    }
}
