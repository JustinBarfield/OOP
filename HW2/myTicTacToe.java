import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToeFrame;
import cs331Helper.cs331TicTacToeGame;
import javafx.application.Application;
import javafx.stage.Stage;

public class myTicTacToe implements cs331TicTacToeGame {
    
    cs331TicTacToeBoard board = new cs331TicTacToeBoard();
    cs331TicTacToeController controller = new cs331TicTacToeController();
   String  message = ("Select a square to start playing");

   this.controller.setControllerMessage(message);
    
    
    public void setControllerMessage(String message){
        
    }

    @Override
    public void invalidSquareChosen(int arg0, int arg1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'invalidSquareChosen'");
    }

    @Override
    public void noWinner() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'noWinner'");
    }

    @Override
    public void playerWins() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'playerWins'");
    }

    @Override
    public void restartGame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'restartGame'");
    }
    
}
