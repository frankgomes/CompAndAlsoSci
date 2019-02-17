import java.util.Scanner;

/**
 * @author Frank Gomes
 * @version 0.1
 * @lab MidYear Project
 * @date 17-02-19
 * @extra Cart with multiple items
 **/

public class PromotionalPromo {

    // Global variables are bad but I'm lazy
    public static Scanner kbd = new Scanner(System.in);

    private static int moscowHoodie = 0;
    private static int moscowZipper = 0;
    private static int hartsShirt = 0;
    private static int wildBoy = 0;
    private static int pugetProgress = 0;

    public static void main(String[] args) {
        divider(14);
        // Here's those "nested loops" as desired for the logo
        for (int a = 0; a < 2; a++) {
            System.out.print("     .  .      .  .");
            System.out.print("\n");
            for (int c = 0; c < 2; c++)
                System.out.print("    / \\/ \\");
            System.out.print("\n");
            for (int d = 0; d < 2; d++)
                System.out.print("    \\    /");
            System.out.print("\n");
            System.out.print("     \\  /      \\  /");
            System.out.print("\n");
            System.out.print("      \\/        \\/");
            System.out.print("\n");
        }
        // Prints company name
        System.out.println(" ___   ___   ___   __    ___   ____  __   __  \n" +
                "| |_) | |_) / / \\ / /`_ | |_) | |_  ( (` ( (` \n" +
                "|_|   |_| \\ \\_\\_/ \\_\\_/ |_| \\ |_|__ _)_) _)_)\n" +
                "Denville, NJ\n" +
                "2019 collection");
        divider(10);
        // Calls option menu
        menu();
    }

    private static void divider(int length) {
        for (int i = 0; i < length; i++)
            System.out.print("-");
        System.out.print("\n");
    }

    // Interactive menu for accessing employees, catalogue, and cart
    private static void menu() {
        System.out.println("What would you like to do?\n 1. See our employees\n 2. See the catalogue\n 3. Go to your cart\n 4. Exit");
        // Gets user input
        String input = kbd.next();
        // Selects the appropriate option
        switch (input) {
            case "1":
                divider(10);
                employees();
                break;
            case "2":
                divider(10);
                products();
                break;
            case "3":
                divider(10);

                break;
            case "4":
                System.out.println("Goodbye, and thank you for shopping with Progress Fashions.");
                System.exit(0);
            default:
                System.out.println("That was not a recognized input. Please try again.");
                break;
        }
        menu();
    }

    // Displays our esteemed employees
    private static void employees() {
        System.out.println("Employees:");
        System.out.println(" CEO & Founder: Poojit \"Puget\" Tummalapalli");
        System.out.println(" Lead Designer: Marc Campos");
        System.out.println(" Head of Production: Agranya Ketha");
        System.out.println(" Royalties and like nothing else: Harish \"Chris Hart\" Sundar");
        divider(10);
    }

    // Displays our products and allows user to buy them
    private static void products() {
        System.out.println("# Product                         Description                                  Price");
        System.out.println("1 Progress Moscow Hoodie          Progress Moscow hoodie. Red and white.       $69.99");
        System.out.println("2 Progress Moscow Zipped Hoodie   Progress Moscow hoodie with a zipper. Black  $74.99");
        System.out.println("                                  and white.");
        System.out.println("3 In Our Harts Shirt              Commemorative design long-sleeve shirt for   $64.99");
        System.out.println("                                  Chris Hart. Black, red and green.");
        System.out.println("4 «le garçon sauvage» Sweatpants  The iconic French I students' hero. Blue,    $89.99");
        System.out.println("                                  white and red.");
        System.out.println("5 Puget Progress Hoodie           A collaboration between Project Mathnasium   $79.99");
        System.out.println("                                  and Progress Fashions. Grey.");
        System.out.println("Enter the number of the item you want to order. Type \"exit\" to go back to the menu.");
        // Gets input from user
        String input = kbd.next();
        // The number of the item the user wants to buy
        int choice = 0;
        switch (input) {
            case "1":
                choice = 1;
                break;
            case "2":
                choice = 2;
                break;
            case "3":
                choice = 3;
                break;
            case "4":
                choice = 4;
                break;
            case "5":
                choice = 5;
                break;
            case "exit":
                divider(10);
                return;
        }
        // Gets the quantity the user wants to purchase
        System.out.println("How many would you like?");
        int quantity = kbd.nextInt();
            addToCart(choice, quantity);
        System.out.println("Would you like to purchase another item?");
    }

    // Adds the selected item in its quantity to the cart
    private static void addToCart(int item, int quantity) {
        // If this is called, that most likely means that the return; statement on line 130 probably didn't work
        if (item == 0) {
            System.out.println("An error has occurred. Ask for assistance.");
            System.out.println("Error: addToCart.choiceNotInitialized");
            System.exit(2);
        }

    }
}
