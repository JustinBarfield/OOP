import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToeFrame;
import cs331Helper.cs331TicTacToeGame;
import javafx.application.Application;
import javafx.stage.Stage;

public class myTicTacToe implements cs331TicTacToeGame {
    
    cs331TicTacToeBoard board;
    cs331TicTacToeController controller ;
    String message;
    protected Players playerX;
    protected Players playerO;

    public myTicTacToe() {
        board = new cs331TicTacToeBoard();
        controller = new cs331TicTacToeController();

        playerX = new Players("X");
        playerO = new Players("O");

        controller.addPlayer(playerX);
        controller.addPlayer(playerO);

        controller.setControllerMessage("Select a square to start playing.");
    }
    
        
    void setControllerMessage() {
    controller.setControllerMessage(message);    
    }

    @Override
public void invalidSquareChosen(int row, int col) {
    String currentPlayerSymbol = playerX.getCurrentPlayerSymbol();
    controller.setControllerMessage("Square at row " + row + ", col " + col + " has already been taken by Player " + currentPlayerSymbol + ". Try again.");
}
    
    

    @Override
    public void noWinner() {
        controller.setControllerMessage("its a tie");
    }

    @Override
    public void playerWins() {
        controller.setControllerMessage("Player Wins");
    }

    @Override
    public void restartGame() {
        myTicTacToe ticTacToeGame = new myTicTacToe();
    }
    
}
