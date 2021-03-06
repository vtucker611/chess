package projectPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ChessBoard {

	public static Pawn pawn1w;
	public static Pawn pawn2w;
	public static Pawn pawn3w;
	public static Pawn pawn4w;
	public static Pawn pawn5w;
	public static Pawn pawn6w;
	public static Pawn pawn7w;
	public static Pawn pawn8w;

	public static Pawn pawn1b;
	public static Pawn pawn2b;
	public static Pawn pawn3b;
	public static Pawn pawn4b;
	public static Pawn pawn5b;
	public static Pawn pawn6b;
	public static Pawn pawn7b;
	public static Pawn pawn8b;

	public static Rook rook1b;
	public static Rook rook2b;
	public static Rook rook1w;
	public static Rook rook2w;

	public static Knight knight1b;
	public static Knight knight2b;
	public static Knight knight1w;
	public static Knight knight2w;

	public static Bishop bishop1bw;
	public static Bishop bishop2bb;
	public static Bishop bishop1ww;
	public static Bishop bishop2wb;

	public static Queen queenw;
	public static Queen queenb;

	public static King kingw;
	public static King kingb;

	public static Map <String, Pawn> pawnMap = new HashMap<>();
	public static Map <String, King> kingMap = new HashMap<>();
	public static Map <String, Knight> knightMap = new HashMap<>();
	public static Map <String, Rook> rookMap = new HashMap<>();
	public static Map <String, Bishop> bishopMap = new HashMap<>();
	public static Map <String, Queen> queenMap = new HashMap<>();

	public static ArrayList<ChessPieces> allBlackPieces = new ArrayList<>();
	public static ArrayList<ChessPieces> allWhitePieces = new ArrayList<>();

	private static int columns = 8; 
	private static int rows = 8;

	public static boolean ifCheckmate = false; 

	public static int turn = 0;


	//int lastMoved (0=white 1=black)  method to return this 

	//because the chess board is grid based, a 2D array
	//would work well 

	//string name for each square

	public static void pawnCreation(int rank, int colour, boolean captured, int move) {
		pawn1w = new Pawn(1, 0, false, 0, 6, 0);
		allWhitePieces.add(pawn1w);
		pawn2w = new Pawn(1, 0, false, 0, 6, 1);
		allWhitePieces.add(pawn2w);
		pawn3w = new Pawn(1, 0, false, 0, 6, 2);
		allWhitePieces.add(pawn3w);
		pawn4w = new Pawn(1, 0, false, 0, 6, 3);
		allWhitePieces.add(pawn4w);
		pawn5w = new Pawn(1, 0, false, 0, 6, 4);
		allWhitePieces.add(pawn5w);
		pawn6w = new Pawn(1, 0, false, 0, 6, 5);
		allWhitePieces.add(pawn6w);
		pawn7w = new Pawn(1, 0, false, 0, 6, 6);
		allWhitePieces.add(pawn7w);
		pawn8w = new Pawn(1, 0, false, 0, 6, 7);
		allWhitePieces.add(pawn8w);

		pawn1b = new Pawn(1, 1, false, 0, 1, 0);
		allBlackPieces.add(pawn1b);
		pawn2b = new Pawn(1, 1, false, 0, 1, 1);
		allBlackPieces.add(pawn2b);
		pawn3b = new Pawn(1, 1, false, 0, 1, 2);
		allBlackPieces.add(pawn3b);
		pawn4b = new Pawn(1, 1, false, 0, 1, 3);
		allBlackPieces.add(pawn4b);
		pawn5b = new Pawn(1, 1, false, 0, 1, 4);
		allBlackPieces.add(pawn5b);
		pawn6b = new Pawn(1, 1, false, 0, 1, 5);
		allBlackPieces.add(pawn6b);
		pawn7b = new Pawn(1, 1, false, 0, 1, 6);
		allBlackPieces.add(pawn7b);
		pawn8b = new Pawn(1, 1, false, 0, 1, 7);
		allBlackPieces.add(pawn8b);
	}

	public static void rookCreation(int rank, int colour, boolean captured, int move) {
		rook1w = new Rook(2, 0, false, 0, 7, 0);
		allWhitePieces.add(rook1w);
		rook2w = new Rook(2, 0, false, 0, 7, 7);
		allWhitePieces.add(rook2w);

		rook1b = new Rook(2, 1, false, 0, 0, 0);
		allBlackPieces.add(rook1b);
		rook2b = new Rook(2, 1, false, 0, 0, 7);
		allBlackPieces.add(rook2b);
	}

	public static void knightCreation(int rank, int colour, boolean captured, int move) {
		knight1w = new Knight(3, 0, false, 0, 7, 2);
		allWhitePieces.add(knight1w);
		knight2w = new Knight(3, 0, false, 0, 7, 5);
		allWhitePieces.add(knight2w);

		knight1b = new Knight(3, 1, false, 0, 0, 2);
		allBlackPieces.add(knight1b);
		knight2b = new Knight(3, 1, false, 0, 0, 5);
		allBlackPieces.add(knight2b);
	}

	public static void bishopCreation(int rank, int colour, boolean captured, int move) {
		bishop1ww = new Bishop(4, 0, false, 0, 7, 1);
		allWhitePieces.add(bishop1ww);
		bishop2wb = new Bishop(4, 0, false, 0, 7, 6);
		allWhitePieces.add(bishop2wb);

		bishop1bw = new Bishop(4, 1, false, 0, 0, 6);
		allBlackPieces.add(bishop1bw);
		bishop2bb = new Bishop(4, 1, false, 0, 0, 1);
		allBlackPieces.add(bishop2bb);
	}

	public static void queenCreation(int rank, int colour, boolean captured, int move) {
		queenw = new Queen(5, 0, false, 0, 7, 3);
		allWhitePieces.add(queenw);

		queenb = new Queen(5, 1, false, 0, 0, 3);
		allBlackPieces.add(queenb);
	}

	public static void kingCreation(int rank, int colour, boolean captured, int move) {
		kingw = new King(6, 0, false, 0, 7, 4);
		allWhitePieces.add(kingw);

		kingb = new King(6, 1, false, 0, 0, 4);
		allBlackPieces.add(kingb);
	}

	public static Object[][] chessBoard() {
		Object[][] board = new Object[rows][columns];

		board [0][0] = rook1b;     board [4][0] = 0;
		board [0][1] = bishop2bb;  board [4][1] = 1;
		board [0][2] = knight1b;   board [4][2] = 0;
		board [0][3] = queenb;     board [4][3] = 1;
		board [0][4] = kingb;      board [4][4] = 0;
		board [0][5] = knight2b;   board [4][5] = 1;
		board [0][6] = bishop1bw;  board [4][6] = 0;
		board [0][7] = rook2b;     board [4][7] = 1;

		board [1][0] = pawn1b;  board [5][0] = 1;
		board [1][1] = pawn2b;  board [5][1] = 0;
		board [1][2] = pawn3b;  board [5][2] = 1;
		board [1][3] = pawn4b;  board [5][3] = 0;
		board [1][4] = pawn5b;  board [5][4] = 1;
		board [1][5] = pawn6b;  board [5][5] = 0;
		board [1][6] = pawn7b;  board [5][6] = 1;
		board [1][7] = pawn8b;  board [5][7] = 0;

		board [2][0] = 0;  board [6][0] = pawn1w;
		board [2][1] = 1;  board [6][1] = pawn2w;
		board [2][2] = 0;  board [6][2] = pawn3w;
		board [2][3] = 1;  board [6][3] = pawn4w;
		board [2][4] = 0;  board [6][4] = pawn5w;
		board [2][5] = 1;  board [6][5] = pawn6w;
		board [2][6] = 0;  board [6][6] = pawn7w;
		board [2][7] = 1;  board [6][7] = pawn8w;

		board [3][0] = 1;  board [7][0] = rook1w;
		board [3][1] = 0;  board [7][1] = bishop1ww;
		board [3][2] = 1;  board [7][2] = knight1w;
		board [3][3] = 0;  board [7][3] = queenw;
		board [3][4] = 1;  board [7][4] = kingw;
		board [3][5] = 0;  board [7][5] = knight2w;
		board [3][6] = 1;  board [7][6] = bishop2wb;
		board [3][7] = 0;  board [7][7] = rook2w;

		return board;
		//this would lay out the chessBoard
	}

	//moves the selected piece and replaces it with a 0 or 1 based on which colour the empty space is 
	public static void movePiece(Object[][] board, ChessPieces piece, int sourceRow, int sourceCol, int destRow, int destCol) {

		System.out.println("Piece " + piece + " moves to row " + destRow + ", column " + destCol + ".");

		if (piece.row % 2 == 0 && piece.col % 2 == 0) {
			board[piece.row][piece.col] = 0;
		} else if (piece.row % 2 == 0 && piece.col % 2 != 0) {
			board[piece.row][piece.col] = 1;
		} else if (piece.row % 2 != 0 && piece.col % 2 == 0) {
			board[piece.row][piece.col] = 1;
		} else if (piece.row % 2 != 0 && piece.col % 2 != 0) {
			board[piece.row][piece.col] = 0;
		}

		board [destRow][destCol] = piece; 
		for(int i=0; i<rows; i++) {

			for(int j = 0; j < columns; j++) {
				System.out.print(board[i][j]);
				System.out.print("  ");
			}
			System.out.println();
		}
		piece.row = destRow;
		piece.col = destCol;
		piece.move++;
		System.out.println(piece + " has moved " + piece.move + " times");
	}

	//checks if the inputed row and col are occupied by a piece 
	public static boolean isOccupied (Object[][] board, int row, int col) {
		if(inBoundary(board, row, col)) {
			if(board[row][col].equals(0) || board[row][col].equals(1)) {
				return false;
			} else {
				return true; 
			}
		} else {
			return false;
		}
	}

	//checks if the inputed row and col are occupied by a white piece 
	public static boolean isOccupiedByWhite(Object[][] board, int row, int col) {
		if(inBoundary(board, row, col)) {
			if(board[row][col].equals(0) || board[row][col].equals(1)) {
				return false;
			} else {
				ChessPieces p = (ChessPieces) board[row][col]; 
				if (p.colour == 0) {
					return true;
				}
			}
			return false;
		}
		return false;
	}

	//checks if the inputed row and col are occupied by a black piece 
	public static boolean isOccupiedByBlack(Object[][] board, int row, int col) {
		if(inBoundary(board, row, col)) {
			if(board[row][col].equals(0) || board[row][col].equals(1)) {
				return false;
			} else {
				ChessPieces p = (ChessPieces) board[row][col]; 
				if (p.colour == 1) {
					return true;
				}
			}
			return false;
		}
		return false;
	}

	//checks if inputed row and col are in the boundary of the board
	public static boolean inBoundary (Object[][] board, int row, int col) {
		if ((row >= 0) && (row <= 7) && (col >= 0) && (col <= 7)) {
			return true;
		} else {
			return false;
		}
	}

	//capture method
	public static void capture (Object[][] board, ChessPieces piece, int sourceRow, int sourceCol, int destRow, int destCol){
		ChessPieces capturedPiece = (ChessPieces) board[destRow][destCol];
		capturedPiece.captured = true;

		System.out.println("Piece " + piece + " captures piece at row " + destRow + ", column " + destCol + ".");

		if (piece.row % 2 == 0 && piece.col % 2 == 0) {
			board[piece.row][piece.col] = 0;
		} else if (piece.row % 2 == 0 && piece.col % 2 != 0) {
			board[piece.row][piece.col] = 1;
		} else if (piece.row % 2 != 0 && piece.col % 2 == 0) {
			board[piece.row][piece.col] = 1;
		} else if (piece.row % 2 != 0 && piece.col % 2 != 0) {
			board[piece.row][piece.col] = 0;
		}

		board [destRow][destCol] = piece; 
		for(int i=0; i<rows; i++) {

			for(int j = 0; j < columns; j++) {
				System.out.print(board[i][j]);
				System.out.print("  ");
			}
			System.out.println();
		}
		piece.row = destRow;
		piece.col = destCol;
		piece.move++;
		System.out.println(piece + " has moved " + piece.move + " times");
	}

	//ai black pieces see where it can go, random piece

	public static void setup() {

		pawnMap.put("pawn2w", pawn2w);
		pawnMap.put("pawn1w", pawn1w);
		pawnMap.put("pawn3w", pawn3w);
		pawnMap.put("pawn4w", pawn4w);
		pawnMap.put("pawn5w", pawn5w);
		pawnMap.put("pawn6w", pawn6w);
		pawnMap.put("pawn7w", pawn7w);
		pawnMap.put("pawn8w", pawn8w);

		pawnMap.put("pawn1b", pawn1b);
		pawnMap.put("pawn2b", pawn2b);
		pawnMap.put("pawn3b", pawn3b);
		pawnMap.put("pawn4b", pawn4b);
		pawnMap.put("pawn5b", pawn5b);
		pawnMap.put("pawn6b", pawn6b);
		pawnMap.put("pawn7b", pawn7b);
		pawnMap.put("pawn8b", pawn8b);


		kingMap.put("kingw", kingw);
		kingMap.put("kingb", kingb);


		knightMap.put("knight1w", knight1w);
		knightMap.put("knight2w", knight2w);

		knightMap.put("knight1b", knight1b);
		knightMap.put("knight2b", knight2b);


		rookMap.put("rook1w", rook1w);
		rookMap.put("rook2w", rook2w);

		rookMap.put("rook1b", rook1b);
		rookMap.put("rook2b", rook2b);


		bishopMap.put("bishop1ww", bishop1ww);
		bishopMap.put("bishop2wb", bishop2wb);

		bishopMap.put("bishop1bw", bishop1bw);
		bishopMap.put("bishop2bb", bishop2bb);


		queenMap.put("queenw", queenw);
		queenMap.put("queenb", queenb);
	}

	public static void main(String[] args) {
		pawnCreation(1, 2, false, 0);
		rookCreation(2, 2, false, 0);
		knightCreation(3, 2, false, 0);
		bishopCreation(4, 2, false, 0);
		queenCreation(5, 2, false, 0);
		kingCreation(6, 2, false, 0);
		Object[][] board = chessBoard();
		for(int i=0; i<rows; i++) {

			for(int j = 0; j < columns; j++) {
				System.out.print(board[i][j]);
				System.out.print("  ");
			}
			System.out.println();
		}

		setup();

		//System.out.print(Arrays.deepToString(chessBoard()));
		Scanner userInput = new Scanner(System.in);
		String pieceName;
		Integer rowScan;
		Integer columnScan;
		//perhaps ask for a piece type and then lead to if else statement to lead to corresponding piece	
		//while loop until game = won bool 	
		while(kingw.captured == false && kingb.captured == false) {
			if(turn == 0) {
				System.out.println("Piece?");
				pieceName = userInput.next();
				if (pieceName.contains("pawn")) {
					System.out.print(pieceName);
					Pawn piece = pawnMap.get(pieceName);
					if (allBlackPieces.contains(piece)) {
						System.out.println("You can't move that piece");
					}else {
					ArrayList<Object> destinations = piece.pawnMovement(board, piece.row, piece.col); 
					if (destinations.isEmpty()) {
						System.out.println("try another piece"); 
					} else {
						System.out.println("Row?");
						rowScan = userInput.nextInt();
						System.out.println("Column?");
						columnScan = userInput.nextInt();
						if(board[rowScan][columnScan].equals(0) || board[rowScan][columnScan].equals(1)) {
							if(destinations.contains(Arrays.asList(rowScan,columnScan))) { 
								movePiece(board, piece, piece.row, piece.col, rowScan, columnScan);
							} else{
								System.out.println("destination not valid boundary"); 
							}
						} else {
							System.out.println("destination not valid piece"); 
						}
					}
					}
				} else if (pieceName.contains("king")){
					System.out.print(pieceName);
					King piece = kingMap.get(pieceName);
					if (allBlackPieces.contains(piece)) {
						System.out.println("You can't move that piece");
					}else {
					ArrayList<Object> destinations = piece.kingMovement(board, piece.row, piece.col); 
					if (destinations.isEmpty()) {
						System.out.println("try another piece"); 
					} else {
						System.out.println("Row?");
						rowScan = userInput.nextInt();
						System.out.println("Column?");
						columnScan = userInput.nextInt();
						if(board[rowScan][columnScan].equals(0) || board[rowScan][columnScan].equals(1)) {
							if(destinations.contains(Arrays.asList(rowScan,columnScan))) { 
								movePiece(board, piece, piece.row, piece.col, rowScan, columnScan);
							}  else{
								System.out.println("destination not valid boundary"); 
							}
						}	else if(destinations.contains(Arrays.asList(rowScan,columnScan, 50))) {
							System.out.println("I can capture " + rowScan + ", " + columnScan);
							capture(board, piece, piece.row, piece.col, rowScan, columnScan);

						} else {
							System.out.println("destination not valid piece"); 
						}
					}
					}
				} else if (pieceName.contains("knight")){
					System.out.print(pieceName);
					Knight piece = knightMap.get(pieceName);
					if (allBlackPieces.contains(piece)) {
						System.out.println("You can't move that piece");
					}else {
					ArrayList<Object> destinations = piece.knightMovement(board, piece.row, piece.col); 
					if (destinations.isEmpty()) {
						System.out.println("try another piece"); 
					} else {
						System.out.println("Row?");
						rowScan = userInput.nextInt();
						System.out.println("Column?");
						columnScan = userInput.nextInt();
						if(board[rowScan][columnScan].equals(0) || board[rowScan][columnScan].equals(1)) {
							if(destinations.contains(Arrays.asList(rowScan,columnScan))) { 
								movePiece(board, piece, piece.row, piece.col, rowScan, columnScan);
							}  else{
								System.out.println("destination not valid boundary"); 
							}
						}	else if(destinations.contains(Arrays.asList(rowScan,columnScan, 50))) {
							System.out.println("I can capture " + rowScan + ", " + columnScan);
							capture(board, piece, piece.row, piece.col, rowScan, columnScan);

						} else {
							System.out.println("destination not valid piece"); 
						}
					}
					}
				} else if (pieceName.contains("rook")){
					System.out.print(pieceName);
					Rook piece = rookMap.get(pieceName);
					if (allBlackPieces.contains(piece)) {
						System.out.println("You can't move that piece");
					}else {
					ArrayList<Object> destinations = piece.rookMovement(board, piece.row, piece.col); 
					if (destinations.isEmpty()) {
						System.out.println("try another piece"); 
					} else {
						System.out.println("Row?");
						rowScan = userInput.nextInt();
						System.out.println("Column?");
						columnScan = userInput.nextInt();
						if(board[rowScan][columnScan].equals(0) || board[rowScan][columnScan].equals(1)) {
							if(destinations.contains(Arrays.asList(rowScan,columnScan))) { 
								movePiece(board, piece, piece.row, piece.col, rowScan, columnScan);
							}  else{
								System.out.println("destination not valid boundary"); 
							}
						}	else if(destinations.contains(Arrays.asList(rowScan,columnScan, 50))) {
							System.out.println("I can capture " + rowScan + ", " + columnScan);
							capture(board, piece, piece.row, piece.col, rowScan, columnScan);

						} else {
							System.out.println("destination not valid piece"); 
						}
					}
					}
				} else if (pieceName.contains("bishop")){
					System.out.print(pieceName);
					Bishop piece = bishopMap.get(pieceName);
					if (allBlackPieces.contains(piece)) {
						System.out.println("You can't move that piece");
					}else {
					ArrayList<Object> destinations = piece.bishopMovement(board, piece.row, piece.col); 
					if (destinations.isEmpty()) {
						System.out.println("try another piece"); 
					} else {
						System.out.println("Row?");
						rowScan = userInput.nextInt();
						System.out.println("Column?");
						columnScan = userInput.nextInt();
						if(board[rowScan][columnScan].equals(0) || board[rowScan][columnScan].equals(1)) {
							if(destinations.contains(Arrays.asList(rowScan,columnScan))) { 
								movePiece(board, piece, piece.row, piece.col, rowScan, columnScan);
							}  else{
								System.out.println("destination not valid boundary"); 
							}
						}	else if(destinations.contains(Arrays.asList(rowScan,columnScan, 50))) {
							System.out.println("I can capture " + rowScan + ", " + columnScan);
							capture(board, piece, piece.row, piece.col, rowScan, columnScan);

						} else {
							System.out.println("destination not valid piece"); 
						}
					}
					}
				} else if (pieceName.contains("queen")){
					System.out.print(pieceName);
					Queen piece = queenMap.get(pieceName);
					if (allBlackPieces.contains(piece)) {
						System.out.println("You can't move that piece");
					}else {
					ArrayList<Object> destinations = piece.queenMovement(board, piece.row, piece.col); 
					if (destinations.isEmpty()) {
						System.out.println("try another piece"); 
					} else {
						System.out.println("Row?");
						rowScan = userInput.nextInt();
						System.out.println("Column?");
						columnScan = userInput.nextInt();
						if(board[rowScan][columnScan].equals(0) || board[rowScan][columnScan].equals(1)) {
							if(destinations.contains(Arrays.asList(rowScan,columnScan))) { 
								movePiece(board, piece, piece.row, piece.col, rowScan, columnScan);
							}  else{
								System.out.println("destination not valid boundary"); 
							}
						}	else if(destinations.contains(Arrays.asList(rowScan,columnScan, 50))) {
							System.out.println("I can capture " + rowScan + ", " + columnScan);
							capture(board, piece, piece.row, piece.col, rowScan, columnScan);

						} else {
							System.out.println("destination not valid piece"); 
						}
					}
					}
				} else {
					System.out.println("keyword does not exist, try again");
				}
				turn = 1;
			} else {
				//AI 
				Random generator=new Random();
				int comppieceindex = generator.nextInt(16);
				ChessPieces comppiece = allBlackPieces.get(comppieceindex);
				String compPieceName = comppiece.name;

				if (compPieceName.contains("pawn")) {
					Pawn comppawn = (Pawn) comppiece;
					ArrayList<Object> destinations = comppawn.pawnMovement(board, comppiece.row, comppiece.col); 
					if (destinations.isEmpty()) {
						System.out.println("try another piece"); 
					} else if (destinations.size() == 1) {
						System.out.println(destinations.get(0));
						List<Object> destinationSquare = (List<Object>) destinations.get(0);
						int destRow = (int) destinationSquare.get(0);
						int destCol = (int) destinationSquare.get(1);
						movePiece(board, comppiece, comppiece.row,comppiece.col,destRow,destCol);
					} else {
						Random destinationGenerator = new Random();
						int indexOfDestination = destinationGenerator.nextInt(destinations.size()-1);
						System.out.println(destinations.get(indexOfDestination));
						List<Object> destinationSquare = (List<Object>) destinations.get(indexOfDestination);
						int destRow = (int) destinationSquare.get(0);
						int destCol = (int) destinationSquare.get(1);
						movePiece(board, comppiece, comppiece.row,comppiece.col,destRow,destCol);
					}
				} else if (compPieceName.contains("king")) {
					King compking = (King) comppiece;
					ArrayList<Object> destinations = compking.kingMovement(board, comppiece.row, comppiece.col); 
					if (destinations.isEmpty()) {
						System.out.println("try another piece"); 
					} else if (destinations.size() == 1) {
						System.out.println(destinations.get(0));
						List<Object> destinationSquare = (List<Object>) destinations.get(0);
						int destRow = (int) destinationSquare.get(0);
						int destCol = (int) destinationSquare.get(1);
						if (destinationSquare.contains(50)) {
							capture(board, comppiece, comppiece.row, comppiece.col, destRow, destCol);
						} else {
						movePiece(board, comppiece, comppiece.row,comppiece.col,destRow,destCol);
						}
					} else {
						Random destinationGenerator = new Random();
						int indexOfDestination = destinationGenerator.nextInt(destinations.size()-1);
						System.out.println(destinations.get(indexOfDestination));
						List<Object> destinationSquare = (List<Object>) destinations.get(indexOfDestination);
						int destRow = (int) destinationSquare.get(0);
						int destCol = (int) destinationSquare.get(1);
						if (destinationSquare.contains(50)) {
							capture(board, comppiece, comppiece.row, comppiece.col, destRow, destCol);
						} else {
						movePiece(board, comppiece, comppiece.row,comppiece.col,destRow,destCol);
						}
					}
				}else if (compPieceName.contains("knight")) {
					Knight compknight = (Knight) comppiece;
					ArrayList<Object> destinations = compknight.knightMovement(board, comppiece.row, comppiece.col); 
					if (destinations.isEmpty()) {
						System.out.println("try another piece"); 
					} else if (destinations.size() == 1) {
						System.out.println(destinations.get(0));
						List<Object> destinationSquare = (List<Object>) destinations.get(0);
						int destRow = (int) destinationSquare.get(0);
						int destCol = (int) destinationSquare.get(1);
						if (destinationSquare.contains(50)) {
							capture(board, comppiece, comppiece.row, comppiece.col, destRow, destCol);
						} else {
						movePiece(board, comppiece, comppiece.row,comppiece.col,destRow,destCol);
						}
					} else {
						Random destinationGenerator = new Random();
						int indexOfDestination = destinationGenerator.nextInt(destinations.size()-1);
						System.out.println(destinations.get(indexOfDestination));
						List<Object> destinationSquare = (List<Object>) destinations.get(indexOfDestination);
						int destRow = (int) destinationSquare.get(0);
						int destCol = (int) destinationSquare.get(1);
						if (destinationSquare.contains(50)) {
							capture(board, comppiece, comppiece.row, comppiece.col, destRow, destCol);
						} else {
						movePiece(board, comppiece, comppiece.row,comppiece.col,destRow,destCol);
						}
					}
				}else if (compPieceName.contains("rook")) {
					Rook comprook = (Rook) comppiece;
					ArrayList<Object> destinations = comprook.rookMovement(board, comppiece.row, comppiece.col); 
					if (destinations.isEmpty()) {
						System.out.println("try another piece"); 
					} else if (destinations.size() == 1) {
						System.out.println(destinations.get(0));
						List<Object> destinationSquare = (List<Object>) destinations.get(0);
						int destRow = (int) destinationSquare.get(0);
						int destCol = (int) destinationSquare.get(1);
						if (destinationSquare.contains(50)) {
							capture(board, comppiece, comppiece.row, comppiece.col, destRow, destCol);
						} else {
						movePiece(board, comppiece, comppiece.row,comppiece.col,destRow,destCol);
						}
					} else {
						Random destinationGenerator = new Random();
						int indexOfDestination = destinationGenerator.nextInt(destinations.size()-1);
						System.out.println(destinations.get(indexOfDestination));
						List<Object> destinationSquare = (List<Object>) destinations.get(indexOfDestination);
						int destRow = (int) destinationSquare.get(0);
						int destCol = (int) destinationSquare.get(1);
						if (destinationSquare.contains(50)) {
							capture(board, comppiece, comppiece.row, comppiece.col, destRow, destCol);
						} else {
						movePiece(board, comppiece, comppiece.row,comppiece.col,destRow,destCol);
						}
					}
				}else if (compPieceName.contains("bishop")) {
					Bishop compbishop = (Bishop) comppiece;
					ArrayList<Object> destinations = compbishop.bishopMovement(board, comppiece.row, comppiece.col); 
					if (destinations.isEmpty()) {
						System.out.println("try another piece"); 
					} else if (destinations.size() == 1) {
						System.out.println(destinations.get(0));
						List<Object> destinationSquare = (List<Object>) destinations.get(0);
						int destRow = (int) destinationSquare.get(0);
						int destCol = (int) destinationSquare.get(1);
						if (destinationSquare.contains(50)) {
							capture(board, comppiece, comppiece.row, comppiece.col, destRow, destCol);
						} else {
						movePiece(board, comppiece, comppiece.row,comppiece.col,destRow,destCol);
						}
					} else {
						Random destinationGenerator = new Random();
						int indexOfDestination = destinationGenerator.nextInt(destinations.size()-1);
						System.out.println(destinations.get(indexOfDestination));
						List<Object> destinationSquare = (List<Object>) destinations.get(indexOfDestination);
						int destRow = (int) destinationSquare.get(0);
						int destCol = (int) destinationSquare.get(1);
						if (destinationSquare.contains(50)) {
							capture(board, comppiece, comppiece.row, comppiece.col, destRow, destCol);
						} else {
						movePiece(board, comppiece, comppiece.row,comppiece.col,destRow,destCol);
						}
					}
				}else if (compPieceName.contains("queen")) {
					Queen compqueen = (Queen) comppiece;
					ArrayList<Object> destinations = compqueen.queenMovement(board, comppiece.row, comppiece.col); 
					if (destinations.isEmpty()) {
						System.out.println("try another piece"); 
					} else if (destinations.size() == 1) {
						System.out.println(destinations.get(0));
						List<Object> destinationSquare = (List<Object>) destinations.get(0);
						int destRow = (int) destinationSquare.get(0);
						int destCol = (int) destinationSquare.get(1);
						if (destinationSquare.contains(50)) {
							capture(board, comppiece, comppiece.row, comppiece.col, destRow, destCol);
						} else {
						movePiece(board, comppiece, comppiece.row,comppiece.col,destRow,destCol);
						}
					} else {
						Random destinationGenerator = new Random();
						int indexOfDestination = destinationGenerator.nextInt(destinations.size()-1);
						System.out.println(destinations.get(indexOfDestination));
						List<Object> destinationSquare = (List<Object>) destinations.get(indexOfDestination);
						int destRow = (int) destinationSquare.get(0);
						int destCol = (int) destinationSquare.get(1);
						if (destinationSquare.contains(50)) {
							capture(board, comppiece, comppiece.row, comppiece.col, destRow, destCol);
						} else {
						movePiece(board, comppiece, comppiece.row,comppiece.col,destRow,destCol);
						}
					}
				}else{
					System.out.println("I can't move that");
				}
				turn = 0;
			}
		}
		userInput.close();
		System.out.println("game over");
	}

}

