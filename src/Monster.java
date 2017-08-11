/**
 * Created by Lenovo on 10.08.2017.
 */
public class Monster {
    private int attack;
    private int def;

    public Monster(int attack, int def) {
        this.attack = attack;
        this.def = def;
    }

    public int getAttack() {
        return  attack;
    }

    public int getDef() {
        return def;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public void setDef(int def){
        this.def = def;
    }

}
