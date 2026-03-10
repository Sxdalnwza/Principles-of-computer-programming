import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

void main() {

    Scanner input = new Scanner(System.in);
    String name;
    boolean gender;
    short yearOfBirth;
    String genderName;
    short age;
    IO.print("Input your name : ");
    name = input.next();
    IO.print("Input your gender (male = true, female = false) : ");
    gender = input.nextBoolean();
    IO.print("Input your Year of Birth : ");
    yearOfBirth = input.nextShort();
    if (gender == true) {
        genderName = "male";
    } else {
        genderName = "female";
    }

    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
    String formattedDate = now.format(formatter);
    int thisYear = Integer.parseInt(formattedDate);
    age = (short) (thisYear - yearOfBirth);
    IO.println("Your name is " + name);
    IO.println("Your gender is " + genderName);
    IO.println("Year of Birth : " + yearOfBirth);
    IO.println("Age : " + age);
    if (age > 18 && gender == true) {
        IO.println("You can vote and serve nation");
    } else if (age > 18) {
        IO.println("You can vote");
    } else {
        IO.println("You can not vote");
    }

}