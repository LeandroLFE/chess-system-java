package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
		
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}
 
	public Piece[][] possibleMoves(){
		
		Piece[][] moves= new Piece[1][1];
		
		return moves;
	}
	
	public boolean possibleMove(Position position) {
		return true;
	}
	
	public boolean isThereAnyPossibleMove() {
		return true;
	}
	
	
}
