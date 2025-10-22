// Miguel Mirabal Q
// period 7
// The program recieves a name, a color, and a season from the user and
// outputs the perfect pet for them based on those inputs.
import java.util.*;

public class Selector{
    public static void main(String[] args) {
      //scanner starts here
        int n=0;
        int b=0;
        String vowel = "AEIOUaeiou";
        String consonant = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        String pet= "";
        Scanner scan = new Scanner(System.in);
        //name
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Your name is: "+name);
        //color
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
        //season
        System.out.println("Choose your favourite season from Spring, Summer, Fall, or Winter: ");
        String season = scan.nextLine();
        season = season.toLowerCase();
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

        //if statements start here
        if (color.equalsIgnoreCase("blue")){
          if (season.equalsIgnoreCase("fall")){
            pet = "alligator";
          }
          else if (season.equalsIgnoreCase("spring")){
            pet = "ostrich";
          }
          else if (((consonant.indexOf((name.substring(0,1))))!=-1)&& ((season!="summer")&&(season!="fall"))){
              if (pet.equalsIgnoreCase("ostrich")){
                  pet = "ostrich";
              }
              else{
                pet = "axolotl";
              }
          }
        }

        if (color .equals("green")){
          if (((consonant.indexOf((name.substring(0,1))))!=-1)&& season .equals("winter")){
            pet ="giraffe";
          }
          else if (season !="fall"){
            if (pet.equals("giraffe")){
              pet = "giraffe";
            }
            else{
              pet ="dog";
            }
          }
        }

        if (color .equals("red")){
          if (((vowel.indexOf((name.substring(0,1))))!=-1)){
            pet = "porcupine";
          }
          else{
            pet = "panda";
          }
        }
      
        if ((season .equals("summer") )&&(pet!="dog"&&pet!="porcupine"&&pet!="panda")){
          pet ="pony";
        }
        
        if (pet.equals("")){
          pet = "rock";
        }
        System.out.println("Your perfect pet is "+pet);
    }


}
