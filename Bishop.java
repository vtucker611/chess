package projectPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Bishop extends ChessPieces{

	public Bishop(int rank, int colour, boolean captured, int move, int row, int col) {
		super(rank, colour, captured, move, row, col);
		this.name = "bishop";
	}

	public void rankBishop() {
		//sets rank to 4
	}

	public ArrayList<Object> bishopMovement(Object[][] board, int row, int col) {
		ArrayList<Object> moveLocations = new ArrayList<Object>();
		if (this.captured == false) {
			//if 8 or greater, don't add to array
			//down right
			for (int i=1; i<8; i++) {
				if(ChessBoard.isOccupied (board, row +i, col+i)) {
					if((this.colour == 1 && ChessBoard.isOccupiedByWhite(board, row +i, col+i)) ||
							(this.colour == 0 && ChessBoard.isOccupiedByBlack(board, row +i, col+i))){
						System.out.println(" can capture");
						moveLocations.add(Arrays.asList(row+i,col+i, 50)); 
						break;
					} else {
						System.out.println(" can't go up (anymore)");
						break;
					}
				} else if (ChessBoard.inBoundary (board, row + i, col + i)) {
					moveLocations.add(Arrays.asList(row+i,col+i)); 
				}
			}
			//down left
			for (int i=1; i<8; i++) {
				if(ChessBoard.isOccupied (board, row + i, col - i)) {
					if((this.colour == 1 && ChessBoard.isOccupiedByWhite(board, row + i, col - i)) ||
							(this.colour == 0 && ChessBoard.isOccupiedByBlack(board, row + i, col - i))){
						System.out.println(" can capture");
						moveLocations.add(Arrays.asList(row + i, col - i, 50)); 
						break;
					} else {
						System.out.println(" can't go up (anymore)");
						break;
					}
				} else if (ChessBoard.inBoundary (board, row + i, col - i)) {
					moveLocations.add(Arrays.asList(row+i,col-i)); 
				}
			}
			//up right
			for (int i=1; i<8; i++) {
				if(ChessBoard.isOccupied (board, row - i, col + i)) {
					if((this.colour == 1 && ChessBoard.isOccupiedByWhite(board, row - i, col + i)) ||
							(this.colour == 0 && ChessBoard.isOccupiedByBlack(board, row - i, col + i))){
						System.out.println(" can capture");
						moveLocations.add(Arrays.asList(row - i, col + i, 50)); 
						break;
					} else {
						System.out.println(" can't go up (anymore)");
						break;
					}
				} else if (ChessBoard.inBoundary (board, row - i, col + i)) {
					moveLocations.add(Arrays.asList(row-i,col+i)); 
				}
			}
			//up left
			for (int i=1; i<8; i++) {
				if(ChessBoard.isOccupied (board, row - i, col - i)) {
					if((this.colour == 1 && ChessBoard.isOccupiedByWhite(board, row - i, col - i)) ||
							(this.colour == 0 && ChessBoard.isOccupiedByBlack(board, row - i, col - i))){
						System.out.println(" can capture");
						moveLocations.add(Arrays.asList(row - i, col - i, 50)); 
						break;
					} else {
						System.out.println(" can't go up (anymore)");
						break;
					}
				} else if (ChessBoard.inBoundary (board, row - i, col - i)) {
					moveLocations.add(Arrays.asList(row-i,col-i)); 
				}
			}

			System.out.println(" can move to " + moveLocations.toString());
			return moveLocations;
		}else {
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
			return "♝";
		} else {
			return "♗";
		}
	}

}
