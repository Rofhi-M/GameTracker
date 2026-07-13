import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameTracker tracker = new GameTracker();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;


        System.out.println("=== Welcome to the Video Game Tracker! ===");

        while(running){
            System.out.println("\n--- Main Meun ---");
            System.out.println("1. Add a Game");
            System.out.println("2. Remove a Game");
            System.out.println("3. Viwe All Games");
            System.out.println("4. Game status");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enetr the game title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter platform: ");
                    String platform = scanner.nextLine();

                    System.out.print("Enter status(e.g Wishlist, In progress, Complete): ");
                    String status = scanner.nextLine();

                    Game newGame = new Game(title, platform, status);
                    tracker.addGames(newGame);
                    break;
            
                case 2:
                    System.out.print("Enter the title of the game to remove: ");
                    String removeTitle = scanner.nextLine();
                    tracker.removeGame(removeTitle);
                    break;
                
                case 3:
                    tracker.listAllGames();
                    break;

                case 4:
                    System.out.print("Enter game status: ");
                    status = scanner.nextLine();
                    tracker.printGamesByStatus(status);
                    break;

                case 5:
                    System.out.println("Goodbye! Happy gaming.");
                    running = false;
                    break;
                
                default:
                    System.out.println("Invalid option. Please enter a number between 1 and 4.");
            }
        }

        scanner.close();
       
    }
}
