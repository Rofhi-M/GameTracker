public class Main {
    public static void main(String[] args) {
        GameTracker tracker = new GameTracker();
        System.out.println("=== Testing: Adding Games ===");

        Game game1 = new Game("The Sims 4", "PC", "In progress");
        Game game2 = new Game("Red Dead Redemption 2", "Xbox", "Wishlist");
        Game game3 = new Game("Little Nightmare", "PS5", "Completed");

        tracker.addGames(game1);
        tracker.addGames(game2);
        tracker.addGames(game3);

        tracker.listAllGames();

        System.out.println("\n=== Testing: Filtering by Status ===");

        tracker.printGamesByStatus("In progress");

        System.out.println("\n=== Testing: Removing a Game ===");

        tracker.removeGame("The Sims 4");

        tracker.listAllGames();

        System.out.println("\n=== Testing: Removing a Game ===");

        tracker.removeGame("Halo");
        
    }
}
