package aplication;



import bordegame.Board;
import bordegame.Position;
import chess.ChessMatch;


public class Program {
    public static void main(String[] args) throws Exception {
        
        ChessMatch chessMatch = new ChessMatch();

        UI.printBoad(chessMatch.getPieces());
    }
}
