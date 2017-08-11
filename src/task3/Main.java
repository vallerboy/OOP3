package task3;

/**
 * Created by Lenovo on 11.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        Game game = new Game("Deadmatch");

        game.addPlayer(new Player("Oskar" , "Polak", 120));
        game.addPlayer(new Player("Janek" , "Polak", 234));
        game.addPlayer(new Player("Rafał" , "Polak", 20));
        game.addPlayer(new Player("Doris" , "Polak", 134));

        System.out.println(game.winner().fullName());

    }
}
