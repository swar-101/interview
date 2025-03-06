package chess.user;

import chess.flyweight.UserExtrinsicState;
import chess.flyweight.UserIntrinsicState;

public class ChessUser {
    private String name;
    private String age;
    private String gender;
    private String email;
    private String phoneNumber;
    private Colour colour;
    private int currentGameStreak;
    private Byte[] photo;

    public ChessUser(String name, String age, String gender, String email, String phoneNumber, Colour colour,
                     int currentGameStreak, Byte[] photo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.colour = colour;
        this.currentGameStreak = currentGameStreak;
        this.photo = photo;
    }

    public static UserIntrinsicState mapIntrinsicValues(ChessUser user) {
        UserIntrinsicState userIntrinsicState = new UserIntrinsicState();
        userIntrinsicState.setName(user.name);
        userIntrinsicState.setAge(user.age);
        userIntrinsicState.setGender(user.gender);
        userIntrinsicState.setEmail(user.email);
        userIntrinsicState.setPhoneNumber(user.phoneNumber);
        userIntrinsicState.setPhoto(user.photo);
        return userIntrinsicState;
    }

    public static UserExtrinsicState mapExtrinsicValues(ChessUser user) {
        UserExtrinsicState userExtrinsicState = new UserExtrinsicState();
        userExtrinsicState.setColour(user.colour);
        userExtrinsicState.setCurrentGameStreak(user.currentGameStreak);
        return userExtrinsicState;
    }
}