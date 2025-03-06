package chess.flyweight;

public interface FlyweightRegistry {
     void addFlyweight(UserIntrinsicState userIntrinsicState);
    UserIntrinsicState getFlyweight(String email);
}
