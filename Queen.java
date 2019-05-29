package projectPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Queen extends ChessPieces{

	public Queen(int rank, int colour, boolean captured, int move, int row, int col) {
		super(rank, colour, captured, move, row, col);
		// TODO Auto-generated constructor stub
	}

	public void rankQueen() {
		//sets rank to 5
	}
	
	public ArrayList<Object> queenMovement(Object[][] board, int row, int col) {
		//movement of the queen, she can move anywhere
		ArrayList<Object> moveLocations = new ArrayList<Object>();
		//if 8 or greater, don't add to array
		
		//up
	       for (int i=1; i<8; i++) {
          if(ChessBoard.isOccupied (board, row - i, col)) {
     		System.out.println(" can't go up");
     		break;
     	 } else if (ChessBoard.inBoundary (board, row - i, col)) {
     		moveLocations.add(Arrays.asList(row-i,col));
     	 }
        }
			//down
	       for (int i=1; i<8; i++) {
	             if(ChessBoard.isOccupied (board, row + i, col)) {
	        		System.out.println(" can't go down");
	        		break;
	        	 } else if (ChessBoard.inBoundary (board, row + i, col)) {
	        		moveLocations.add(Arrays.asList(row+i,col));
	        	 }
	           }
			//left
	       for (int i=1; i<8; i++) {
	             if(ChessBoard.isOccupied (board, row, col-i)) {
	        		System.out.println(" can't go left");
	        		break;
	        	 } else if (ChessBoard.inBoundary (board, row, col-i)) {
	        		moveLocations.add(Arrays.asList(row,col-i));
	        	 }
	           }
			//right
	       for (int i=1; i<8; i++) {
	             if(ChessBoard.isOccupied (board, row, col+i)) {
	        		System.out.println(" can't go right");
	        		break;
	        	 } else if (ChessBoard.inBoundary (board, row, col+i)) {
	        		moveLocations.add(Arrays.asList(row,col+i)); 
	        	 }
	           }
	     //down right
	        for (int i=1; i<8; i++) {
	          if(ChessBoard.isOccupied (board, row + i, col + i)) {
	        		System.out.println(" can't go down and right");
	        		break;
	        	} else if (ChessBoard.inBoundary (board, row + i, col + i)) {
	        		moveLocations.add(Arrays.asList(row+i,col+i)); 
	        	}
	         }
			//down left
	        for (int i=1; i<8; i++) {
		      if(ChessBoard.isOccupied (board, row + i, col - i)) {
		        	System.out.println(" can't go down and left");
		        	break;
		       } else if (ChessBoard.inBoundary (board, row + i, col - i)) {
		        	moveLocations.add(Arrays.asList(row+i,col-i)); 
		       }
		    }
			//up right
	        for (int i=1; i<8; i++) {
			  if(ChessBoard.isOccupied (board, row - i, col + i)) {
			        System.out.println(" can't go up and right");
			       	break;
			  } else if (ChessBoard.inBoundary (board, row - i, col + i)) {
			       	moveLocations.add(Arrays.asList(row-i,col+i)); 
			  }
		    }
			//up left
	        for (int i=1; i<8; i++) {
			  if(ChessBoard.isOccupied (board, row - i, col - i)) {
				    System.out.println(" can't go up and left");
				    break;
			  } else if (ChessBoard.inBoundary (board, row - i, col - i)) {
				    moveLocations.add(Arrays.asList(row-i,col-i)); 
			  }
			}
				
				System.out.println(" can move to " + moveLocations.toString());
				return moveLocations;
		
	}
	//queen can move anywhere, but there is a specific way she moves
	//she can move straight or diagonally, but not at the same time
	//perhaps I can make the queen movement into two with queenMovementStraight and diagonal
	//make another prompt for the player asking if the¥ want her to go straight or diagonal
	//queen can then only move diagonally or straight in one turn 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		if(this.whichColour()==1) {
			return "♛";
		} else {
			return "♕";
		}
	}
}
