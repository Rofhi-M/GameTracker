import java.util.ArrayList;

public class GameTracker {
    
    private ArrayList<Game> games;

    public GameTracker() {
        this.games = new ArrayList<>();
    }

    public void addGames(Game game) {
        games.add(game);
        System.out.println("Game added "+ game.getTitle());
    }

    public boolean removeGame(String title){
        for (Game game : games) {
            if (game.getTitle().equalsIgnoreCase(title)){
                games.remove(game);
                System.out.println("Game removed " + title);
                return true;
            }
        }
        System.out.println("Game not found");
        return false;
    }

    public void listAllGames(){
        if (games.isEmpty()) {
            System.out.println("Your library is empty!");
            return;
        }
        System.out.println("\n--- All Tracked Games ---");
        for(Game game : games) {
            System.out.println(game);
        }
    }

    public void printGamesByStatus(String status) {
        System.out.println("\n--- Games Status: " + status + " ---");
        boolean found = false;
        for (Game game : games) {
            if (game.getStatus().equalsIgnoreCase(status)) {
                System.out.println(game);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No games found with status: " + status);
        }
    }

}
