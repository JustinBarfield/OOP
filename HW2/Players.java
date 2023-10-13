import cs331Helper.cs331TicTacToePlayer;
import cs331Helper.cs331TicTacToeSquare;

public class Players extends myTicTacToe implements cs331TicTacToePlayer  {
    private String symbol;
    private String currentPlayerSymbol;

    public Players(String string) {
        this.symbol = string;
    }
    public Players getPlayerX() {
        return playerX;
    }
    public Players getPlayerO() {
        return playerO;
    }
    public void switchPlayer() {
        // Method to switch the current player's symbol
        if (currentPlayerSymbol.equals("X")) {
            currentPlayerSymbol = "O";
        } else {
            currentPlayerSymbol = "X";
        }
    }
public Players getCurrentPlayer() {
    
    String currentPlayerSymbol = getCurrentPlayerSymbol();

    if ("X".equals(currentPlayerSymbol)) {
        return playerX;
    } else if ("O".equals(currentPlayerSymbol)) {
        return playerO;
    } else {
        throw new IllegalStateException("Invalid player symbol: " + currentPlayerSymbol);
    }
}
public String getCurrentPlayerSymbol() {
    
    return currentPlayerSymbol;
}
    @Override
public void selectSquare(int row, int col) {
    // Check if the square at (row, col) is empty
    cs331TicTacToeSquare square = board.squareAt(row, col);
    
    if (square != null) {
        // Mark the square with the player's symbol ("X" or "O").
        square.markSquare(symbol);
        
        // Update the controller's message
        controller.setControllerMessage("Player " + symbol + " finished their turn");
        
        
    }
}
    

    public String getPlayerSymbol() {
        return symbol;
    }
}