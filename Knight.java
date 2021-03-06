package projectPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Knight extends ChessPieces {

	public Knight(int rank, int colour, boolean captured, int move, int row, int col) {
		super(rank, colour, captured, move, row, col);
		this.name = "knight";
	}

	public void rankKnight() {
		//sets rank to 3
	}

	public ArrayList<Object> knightMovement(Object[][] board, int row, int col) {
		ArrayList<Object> moveLocations = new ArrayList<Object>();

		if (this.captured == false) {
			if((row-1>=0 && col+2<=7) && !ChessBoard.isOccupied(board, row-1, col+2)) {
				if((this.colour == 1 && ChessBoard.isOccupiedByWhite(board, row-1, col+2)) ||
						(this.colour == 0 && ChessBoard.isOccupiedByBlack(board, row-1, col+2))){
					System.out.println(" can capture");
					moveLocations.add(Arrays.asList(row-1, col+2, 50)); 
				} else {
					moveLocations.add(Arrays.asList(row-1, col+2));
				}
			}else { 
				System.out.println(" can't move up 1 and right 2");
			};
			if((row-1>=0 && col-1>=0) && !ChessBoard.isOccupied(board, row-1, col-2)) {
				if((this.colour == 1 && ChessBoard.isOccupiedByWhite(board, row-1, col-2)) ||
						(this.colour == 0 && ChessBoard.isOccupiedByBlack(board, row-1, col-2))){
					System.out.println(" can capture");
					moveLocations.add(Arrays.asList(row-1, col-2, 50)); 
				} else {
					moveLocations.add(Arrays.asList(row-1, col-2));
				}
			}else { 
				System.out.println(" can't move up 1 and left 2");
			};
			if((row-2>=0 && col+1<=7) && !ChessBoard.isOccupied(board, row-2, col+1)) {
				if((this.colour == 1 && ChessBoard.isOccupiedByWhite(board, row-2, col+1)) ||
						(this.colour == 0 && ChessBoard.isOccupiedByBlack(board, row-2, col+1))){
					System.out.println(" can capture");
					moveLocations.add(Arrays.asList(row-2, col+1, 50)); 
				} else {
					moveLocations.add(Arrays.asList(row-2, col+1));
				}
			}else { 
				System.out.println(" can't move up 2 and right 1");
			};
			if((row-2>=0 && col-1>=0) && !ChessBoard.isOccupied(board, row-2, col-1)) {
				if((this.colour == 1 && ChessBoard.isOccupiedByWhite(board, row-2, col-1)) ||
						(this.colour == 0 && ChessBoard.isOccupiedByBlack(board, row-2, col-1))){
					System.out.println(" can capture");
					moveLocations.add(Arrays.asList(row-2, col-1, 50)); 
				} else {
					moveLocations.add(Arrays.asList(row-2, col-1));
				}
			}else { 
				System.out.println(" can't move up 2 and left 1");
			};
			if((row+1<=7 && col+2<=7) && !ChessBoard.isOccupied(board, row+1, col+2)) {
				if((this.colour == 1 && ChessBoard.isOccupiedByWhite(board, row+1, col+2)) ||
						(this.colour == 0 && ChessBoard.isOccupiedByBlack(board, row+1, col+2))){
					System.out.println(" can capture");
					moveLocations.add(Arrays.asList(row+1, col+2, 50)); 
				} else {
					moveLocations.add(Arrays.asList(row+1, col+2));
				}
			}else { 
				System.out.println(" can't move down 1 and right 2");
			};
			if((row+1<=7 && col-2>=0) && !ChessBoard.isOccupied(board, row+1, col-2)) {
				if((this.colour == 1 && ChessBoard.isOccupiedByWhite(board, row+1, col-2)) ||
						(this.colour == 0 && ChessBoard.isOccupiedByBlack(board, row+1, col-2))){
					System.out.println(" can capture");
					moveLocations.add(Arrays.asList(row+1, col-2, 50)); 
				} else {
					moveLocations.add(Arrays.asList(row+1, col-2));
				}
			}else { 
				System.out.println(" can't move down 1 and left 2");
			};
			if((row+2<=7 && col+1<=7) && !ChessBoard.isOccupied(board, row+2, col+1)) {
				if((this.colour == 1 && ChessBoard.isOccupiedByWhite(board, row+2, col+1)) ||
						(this.colour == 0 && ChessBoard.isOccupiedByBlack(board, row+2, col+1))){
					System.out.println(" can capture");
					moveLocations.add(Arrays.asList(row+2, col+1, 50)); 
				} else {
					moveLocations.add(Arrays.asList(row+2, col+1));
				}
			}else { 
				System.out.println(" can't move down 2 and right 1");
			};
			if((row+2<=7 && col-1>=0) && !ChessBoard.isOccupied(board, row+2, col-1)) {
				if((this.colour == 1 && ChessBoard.isOccupiedByWhite(board, row+2, col-1)) ||
						(this.colour == 0 && ChessBoard.isOccupiedByBlack(board, row+2, col-1))){
					System.out.println(" can capture");
					moveLocations.add(Arrays.asList(row+2, col-1, 50)); 
				} else {
					moveLocations.add(Arrays.asList(row+2, col-1));
				}
			}else { 
				System.out.println(" can't move down 2 and left 1");
			};
			System.out.println(" can move to " + moveLocations.toString());
			return moveLocations;

		} else {
			System.out.println(" is captured");
			return moveLocations;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		if(this.whichColour()==1) {
			return "♞";
		} else {
			return "♘";
		}
	}

}
