package chess.flyweight;

import chess.annotations.ExtrinsicState;
import chess.user.Colour;

@ExtrinsicState
public class UserExtrinsicState {
    private Colour colour;
    private int currentGameStreak;

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public int getCurrentGameStreak() {
        return currentGameStreak;
    }

    public void setCurrentGameStreak(int currentGameStreak) {
        this.currentGameStreak = currentGameStreak;
    }
}