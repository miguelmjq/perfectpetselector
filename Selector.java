import java.util.*;

public class Selector{
    public static void main(String[] args) {
        int n=0;
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Your name is: "+name);

        System.out.println("Choose your favourite color from Red, Green, or Blue: ");
        String color = scan.nextLine();
        color = color.toLowerCase();
        while (n==0) {
            
          if (color.equalsIgnoreCase("red")||color.equalsIgnoreCase("green")||color.equalsIgnoreCase("blue")){
            System.out.println("You chose: "+color);     
             n=n+1;
          }
          else{
            System.out.println("Please choose from one of the options!");
            System.out.println("Choose your favourite color from Red, Green, or Blue: ");
            color = scan.nextLine();
            color = color.toLowerCase();
          }
        }

 


        System.out.println("Choose your favourite season from Spring, Summer, Fall, or Winter: ");
        String season = scan.nextLine();
        season = season.toLowerCase();
        int b=0;
        while (b==0) {
            
          if (season.equalsIgnoreCase("spring")||season.equalsIgnoreCase("summer")||season.equalsIgnoreCase("fall")||season.equalsIgnoreCase("winter")){
            System.out.println("You chose: "+season);     
             b=b+1;
          }
          else{
            System.out.println("Please choose from one of the options!");
            System.out.println("Choose your favourite season from Spring, Summer, Fall, or Winter: ");
            season = scan.nextLine();
            season = season.toLowerCase();
          }
        }
        scan.close();
    }

}
