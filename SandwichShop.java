import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        
        
       
      
        out.println("Checking sales goals.\n\n");
        out.println("The sales goal for veggie sandwiches is 50");
        out.println("How many veggie sandwiches were sold today?");
        
       
        int soldVeggies;
        soldVeggies = keyboard.nextInt();
        
        if (goalForVeggies <= soldVeggies)
        {
            out.println("Made goal for veggies.\n");
        } else {
            out.println("Fell short\n");
        }
        
        
       
        out.println("The sales goals for burgers is 250");
        out.println("How many burgers were sold today?");
        
        
        int soldBurgers;
        soldBurgers = keyboard.nextInt();
        
        if (goalForBurgers <= soldBurgers)
        {
            out.println("Made goal for burgers.\n");
        } else {
            out.println("Fell short\n");
        }
       
        
        
        
        out.println("The sales goals for subs is 180");
        out.println("How many subs were sold today?");
        
        
        int soldSubs;
        soldSubs = keyboard.nextInt();
        
        if (goalForSubs <= soldSubs) 
        {
            out.println("Made goals for subs.\n");
        } else {
            out.println("Fell short\n");
        }
          
        
        
        
        out.println("The sales goals for soup is 70\n");
        out.println("How many soups were sold today?");
        
        
        int soldSoup;
        soldSoup = keyboard.nextInt();
        
        if (goalForSoup <= soldSoup)
        {
            out.println("Made goal for soup.\n");
        } else { 
            out.println("Fell short\n");
        }
        
        if (goalForVeggies <= soldVeggies && (goalForBurgers <= soldBurgers) && (goalForSubs <= soldSubs) && goalForSoup <= soldSoup)
        {
            out.println("Made total goal!");
        } else {
            
        }
    }
}
        
        
     