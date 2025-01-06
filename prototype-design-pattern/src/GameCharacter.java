public class GameCharacter implements Prototype{

    private String character;
    private String hp;

    public GameCharacter(String character, String hp){
        this.character=character;
        this.hp=hp;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "character='" + character + '\'' +
                ", hp='" + hp + '\'' +
                '}';
    }

    @Override
    public Prototype clone() {
        return new GameCharacter(this.character, this.hp);
    }
}
