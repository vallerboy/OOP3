/**
 * Created by Lenovo on 10.08.2017.
 */
public class Monster {
    private  int attack;
    private int def;
    private String name;

    public Monster(int def){
        this( 0, def,"noname");
    }

    public Monster(int attack, int def, String name) {
        this.attack = attack;
        this.def = def;
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "attack=" + attack +
                ", def=" + def +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monster monster = (Monster) o;

        if (attack != monster.attack) return false;
        if (def != monster.def) return false;
        return name != null ? name.equals(monster.name) : monster.name == null;
    }

    @Override
    public int hashCode() {
        int result = attack;
        result = 31 * result + def;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
