
public class Warrior extends GameCharacter{

    private String weapon;

    public Warrior(String character, String hp, String weapon){
        super(character, hp);
        this.weapon=weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Warrior(String character, String hp) {
        super(character, hp);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "weapon='" + weapon + '\'' +
                '}';
    }
}
