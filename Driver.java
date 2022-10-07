/*
 * CSC232A
 *      1. Lydia Hollis
 * 
 *      2. Matt  Rowley
 * 
 *      3. Kevin Le
 */
import java.util.Scanner;
public class Driver{

    public static Location currLocation;

    public static void main(String[] args){
        currLocation = new Location("Kitchen", "A small room with a dim lightbulb illuminating the area. The room has the following items:");
        currLocation.addItem(new Item("sandwich", "food", "a peanut butter and jelly sandwich"));
        currLocation.addItem(new Item("hammer", "tool", "a blunt object used for hitting things"));
        currLocation.addItem(new Item("knife", "weapon", "a sharp object"));

        Scanner scan = new Scanner(System.in);
        
        String command = "null";
        while (!command.equalsIgnoreCase("quit")){
            System.out.println("Enter command:");
            command = scan.nextLine();

            //check w/ group
            command = command.toLowerCase();
            String[] commands = command.split(" ");

            switch(commands[0]){
                case "look":
                    System.out.println(currLocation.getName() + " - " + currLocation.getDescription());
                    for(int i = 0; i < currLocation.numItems(); i++){
                        System.out.println("+ " + currLocation.getItem(i).getName());
                    }
                   break;
                case "examine":
                    if(2 > commands.length){
                        System.out.println("What do you want to examine?");
                    }
                    else if(currLocation.hasItem(commands[1])){
                        System.out.println(currLocation.getItem(commands[1]).toString());
                    }
                    else if(!currLocation.hasItem(commands[1])){
                        System.out.println("Cannot find that item");
                    }
                    break;
                case "quit":
                    scan.close();
                    break;
                default:
                    System.out.println("I don't know how to do that");
            }
        }
    }
}
