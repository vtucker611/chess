package projectPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class King extends ChessPieces {
	
	public King(int rank, int colour, boolean captured, int move, int row, int col) {
		 super(rank, colour, captured, move, row, col);
		 this.rank = 6; 

		// TODO Auto-generated constructor stub
	}

	public int rankKing() {
		return this.rank; 
	}
	
	public ArrayList<Object> kingMovement(Object[][] board, int row, int col) {
		ArrayList<Object> moveLocations = new ArrayList<Object>();
		//if 8 or greater, don't add to array
		
		if(row-1>=0 && !ChessBoard.isOccupied(board, row-1, col)) {
			moveLocations.add(Arrays.asList(row-1,col));
	    }else { 
			System.out.println(" can't move up");
		};
		if(row+1<=7 && !ChessBoard.isOccupied(board, row+1, col)) {
			moveLocations.add(Arrays.asList(row+1,col));
	    }else { 
			System.out.println(" can't move down");
		};
		if(col-1>=0 && !ChessBoard.isOccupied(board, row, col-1)) {
			moveLocations.add(Arrays.asList(row,col-1));
	    }else { 
			System.out.println(" can't move left");
		};
		if(col+1<=7 && !ChessBoard.isOccupied(board, row, col+1)) {
			moveLocations.add(Arrays.asList(row,col+1));
	    }else { 
			System.out.println(" can't move right");
		};
		if((row-1>=0 && col-1>=0) && !ChessBoard.isOccupied(board, row-1, col-1)) {
			moveLocations.add(Arrays.asList(row-1,col-1));
	    }else { 
			System.out.println(" can't move up and left");
		};
		if((row-1>=0 && col+1<=7) && !ChessBoard.isOccupied(board, row-1, col+1)) {
			moveLocations.add(Arrays.asList(row-1,col+1));
	    }else { 
			System.out.println(" can't move up and right");
		};
		if((row+1<=7 && col-1>=0) && !ChessBoard.isOccupied(board, row+1, col-1)) {
			moveLocations.add(Arrays.asList(row+1,col-1));
	    }else { 
			System.out.println(" can't move down and left");
		};
		if((row+1<=7 && col+1<=7) && !ChessBoard.isOccupied(board, row+1, col+1)) {
			moveLocations.add(Arrays.asList(row+1,col+1));
	    }else { 
			System.out.println(" can't move down and right");
		};
		        System.out.println(" can move to " + moveLocations.toString());
				return moveLocations;	
	}
	
	
	public void ifCheck() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		if(this.whichColour()==1) {
			return "♚";
		} else {
			return "♔";
		}
	}

}