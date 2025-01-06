import java.util.HashMap;
import java.util.Map;

public class CharacterRegistry {

    private static Map<String, GameCharacter> map = new HashMap<>();

    static {
        map.put("Warrior", new Warrior("char", "100", "sword"));
    }

    public GameCharacter getGameCharacter(String type){
        return map.get("Warrior");
    }

}
