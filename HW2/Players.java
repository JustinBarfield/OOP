import cs331Helper.cs331TicTacToePlayer;
import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToeFrame;
import cs331Helper.cs331TicTacToeGame;
import javafx.application.Application;
import javafx.stage.Stage;

public class Players implements cs331TicTacToePlayer{
    private char symbol;  // Player's symbol ("X" or "O")
    
    

    public Players(char symbol) {
        this.symbol = symbol;
        

    }
    @Override
    public void selectSquare(int arg0, int arg1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectSquare'");
    }
    
}
