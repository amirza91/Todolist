import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Todoitems list = new Todoitems();

        Scanner scanner = new Scanner(System.in);
        // Made a main menu where user picks which functionality he/she wants
        // to use. It goes through a while loop until user wants to quit.

        System.out.println("Add item enter 1\nDelete item enter 2\nlist all reminders enter 3\nEnter 4 to exit");
        System.out.println("Enter choice: ");
        String input = scanner.nextLine();
        while(!input.equals("4")){
            if(input.equals("1")){
                System.out.println("Enter new reminder: ");
                String reminder = scanner.nextLine();
                list.add(reminder);



            }
            else if (input.equals("2")){
                list.all();
                System.out.println("Which reminder would you like to delete ");
                String reminder = scanner.nextLine();
                list.delete(Integer.parseInt(reminder));

            }
            else if (input.equals("3")){
                list.all();
            }
            else{
                System.out.println("Please enter a valid input");
            }
            System.out.println("Add item enter 1\nDelete item enter 2\nlist all reminders enter 3\nEnter 4 to exit");
            System.out.println("Enter choice: ");
            input = scanner.nextLine();


        }



    }
}
