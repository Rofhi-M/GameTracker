public class Game {
    String title;
    String platform;
    String status;

    public Game(String title, String platform, String status) {
        this.title = title;
        this.platform = platform;
        this.status = status;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = status;
    }

    public String toString() {
        return "Game: " + title + " | Platform: " + platform + " | Status: " + status;
    }

}