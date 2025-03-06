package chess.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightRegistryImpl implements FlyweightRegistry {

    public static Map<String, UserIntrinsicState> flyweightRegistry = new HashMap<>();

    @Override
    public void addFlyweight(UserIntrinsicState userIntrinsicState) {
        flyweightRegistry.put(userIntrinsicState.getEmail(), userIntrinsicState);
    }

    @Override
    public UserIntrinsicState getFlyweight(String email) {
        return flyweightRegistry.get(email);
    }
}