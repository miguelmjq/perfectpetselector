import java.util.*;

public class Selector{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Your name is: "+name);

        System.out.println("Choose your favourite color from Red, Green, or Blue: ");
        String color = scan.nextLine();
        color = color.toLowerCase();
        System.out.println("You chose: "+color);


        System.out.println("Choose your favourite color from Spring, Summer, Fall, or Winter: ");
        String season = scan.nextLine();
        season = season.toLowerCase();
        System.out.println("You chose: "+season);
        scan.close();
    }

}
