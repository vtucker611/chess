package projectPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Pawn extends ChessPieces{

	public Pawn(int rank, int colour, boolean captured, int move, int row, int col) {
		super(rank, colour, captured, move, row, col);

		this.name = "pawn";
	}

	public void rankPawn() {
		//sets rank to 1
	}

	public ArrayList<Object> pawnMovement(Object[][] board, int row, int col) {
		//movement of the pawn

		//is this the pawn's first move?
		//yes --> [row + 1] [0] or [row + 2] [0]
		//no --> [row + 1] [0]
		//if pawn is black move down a row
		//if pawn white is in row 6 and pawn black is in row 1, i can move two rows

		//for occupied tiles, something like if(row+1 == 0 || ==1), then can move there
		//else make a cute message like sorry i cant go there!  pick another row... col...
		ArrayList<Object> moveLocations = new ArrayList<Object>();
		if (this.captured == false) {

			if (this.whichColour()==0) {
				if (this.move == 0) {
					//add to list return array list
					for (int i=1; i<3; i++) {
						if(ChessBoard.isOccupied (board, row - i, col)) {
							System.out.println(" can't move");
							break;
						} else if (ChessBoard.inBoundary (board, row - i, col)) {
							moveLocations.add(Arrays.asList(row-i,col)); 
						}
					}
					System.out.println(" can move to " + moveLocations.toString());

					return moveLocations;
				} else {
					if(row-1>=0 && !ChessBoard.isOccupied(board, row-1, col)) {
						moveLocations.add(Arrays.asList(row-1,col)); 
					}else { 
						System.out.println(" can't move");
					};
					System.out.println(" can move to " + moveLocations.toString());
					return moveLocations;
				}
			}else {
				if (this.move == 0) {
					for (int i=1; i<3; i++) {
						if(ChessBoard.isOccupied (board, row + i, col)) {
							System.out.println(" can't move");
							break;
						} else if (ChessBoard.inBoundary (board, row + i, col)) {
							moveLocations.add(Arrays.asList(row+i,col)); 
						}
					}
					System.out.println(" can move to " + moveLocations.toString());
					return moveLocations;
				} else {
					if(row+1<=7 && !ChessBoard.isOccupied(board, row+1, col)) {
						moveLocations.add(Arrays.asList(row+1,col));
					}else { 
						System.out.println(" can't move");
					};
					System.out.println(" can move to " + moveLocations.toString());
					return moveLocations;
				}
			}
		} else {
			System.out.println(" is captured");
			return moveLocations;	
		}
	}

	//turn into queen

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		if(this.whichColour()==1) {
			return "♟";
		} else {
			return "♙";
		}
	}

}
