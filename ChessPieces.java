package projectPackage;

public class ChessPieces {
	public int rank;
	public int colour; //white = 0, black = 1
	public boolean captured;
	public int move; 
	public int row;
	public int col;
	
	//things I need to do:
	//1. capture 
	//2. turns (white turn can't move black pieces) (extra) 
	//3. popup you win/lost message in javafx 
	//4. create AI that picks a random piece on their side, checks to see if it can move, and will
	//   then move accordingly
	
	//there are 36 chess pieces in total, 16 of which are white
	//and 16 of which are black
	
	//of the 16 pieces, there are 8 pawns, 2 knights, 2 bishops,
	//2 rooks, 1 queen, and 1 king
	public ChessPieces(int rank, int colour, boolean captured, int move, int row, int col) {
		this.rank = rank;
		this.colour = colour;
		this.captured = captured;
		this.move = move;  
		this.row = row;
		this.col = col;
	}
	

	public int whichColour(){ //or which player
		//player = boolean is turn true false
		//piece = what was last colour that went?  was it the same as mine or different? this in class board 
		
		return this.colour;
	}
	
	public int whatRank() {
		return this.rank;
	}
	
	//each of the pieces have different ways of moving.  I'm not sure
	//if I should make another class for this but I will keep them on this
	//class for now
	
	//each square on the chess board has a specific name, which will be
	//in a separate class
	
	//classes instead of these, movements in the classes; one method to return the rank 
	
    //there should also be a position in which the pieces start out.  I'm
    //not entirely sure what to call that, or if I should place it in the 
    //chess board class, as it would involve the chess board names
    
    public boolean ifCaught() {
    	//this would be for when a piece is captured by the other team.
    	//would include check mate 
    	return captured;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessPieces whiterook1 = new ChessPieces(2, 0, false, 0, 0, 0);
		System.out.println(whiterook1.ifCaught());
		System.out.println(whiterook1.whatRank());

	}

}
