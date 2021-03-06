package Game;

public interface Printer {

    void PrintBoard(Checker board[][]);

    void PrintTurnOf(Checker player);

    void PrintAvilable(Checker board[][], Checker avilable_to_print);

    void PrintMessage(String s);

    void PrintWinnerMessage(Checker winner);

    void PrintScore(int scorePlayer1, int scorePlayer2);
}