package task3;

import javafx.application.Platform;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 11.08.2017.
 */
public class Game {
    private String name;
    private List<Player> playerList;

    public Game(String name){
        this.name = name;
        playerList = new ArrayList<>();
    }

    public void addPlayer(Player p){
        playerList.add(p);
    }

    public void addAllPlayers(List<Player> players){
        playerList.addAll(players);
    }

    public Player winner(){
        int max = Integer.MIN_VALUE;
        Player winnerPlayer = null;

        for (Player player : playerList) {
            if(player.getPoints() > max){
                max = player.getPoints();
                winnerPlayer = player;
            }
        }

        if(max > 100){
            return winnerPlayer;
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
