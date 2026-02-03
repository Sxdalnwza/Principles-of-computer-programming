public class convert {
    public static void main(String[] args) {
        Long thaiD = 1709800494164L;
        System.out.println(thaiD);
        String newID = thaiD.toString();
        System.out.println(newID);
        System.out.println("ID has" + newID.length() + "characters");
        System.out.println("ID has" + newID.contains("88"));
        System.out.println("ID has" + newID.charAt(8));
    }
}
