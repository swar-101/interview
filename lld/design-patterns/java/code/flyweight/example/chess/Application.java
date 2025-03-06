package chess;

import chess.flyweight.FlyweightRegistry;
import chess.flyweight.FlyweightRegistryImpl;
import chess.flyweight.UserExtrinsicState;
import chess.flyweight.UserIntrinsicState;
import chess.user.ChessUser;
import chess.user.Colour;

public class Application {
    public static void main(String[] args) {
        // Let's create a few users
        ChessUser phillip = new ChessUser("Phillip Lahm", "56", "M", "phil.lahm@bayern.com",
                "(+49) 163 555 1584", Colour.BLACK, 3, new Byte[]{2, 3, 5, 3, 2, 3});
        UserIntrinsicState phillipIntrinsic = ChessUser.mapIntrinsicValues(phillip);
        FlyweightRegistry flyweightRegistry = new FlyweightRegistryImpl();

        // These values are cached and known as Flyweight objects
        flyweightRegistry.addFlyweight(phillipIntrinsic);


        // These values are in-match and are subjected to change
        UserExtrinsicState phillipExtrinsic = ChessUser.mapExtrinsicValues(phillip);

        ChessUser knightRider = new ChessUser("Knight Rider", "47", "M", "knight.rider@auto.com",
                "(+1) 123 456 7890", Colour.WHITE, 2, new Byte[]{4, 2, 3, 5, 1, 2});

        UserIntrinsicState knightRiderIntrinsic = ChessUser.mapIntrinsicValues(knightRider);
        flyweightRegistry.addFlyweight(knightRiderIntrinsic);
        UserExtrinsicState knightRiderExtrinsic = ChessUser.mapExtrinsicValues(knightRider);

        ChessUser rooknRoll = new ChessUser("Rook 'n Roll", "34", "F", "rooknroll@rockmail.com",
                "(+1) 321 654 0987", Colour.BLACK, 5, new Byte[]{3, 3, 4, 1, 5, 3});

        UserIntrinsicState rooknRollIntrinsic = ChessUser.mapIntrinsicValues(rooknRoll);
        flyweightRegistry.addFlyweight(rooknRollIntrinsic);
        UserExtrinsicState rooknRollExtrinsic = ChessUser.mapExtrinsicValues(rooknRoll);
    }
}