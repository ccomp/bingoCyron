import java.util.Arrays;

public class Bingo {
	
	public static boolean bingo(int[][] board, int[] drawn) {
		Arrays.sort(drawn);

		int placeholder = 0;
		int boardholder = 0;
		int extra = board.length;

		for (int i = 0; i<drawn.length; i++) {
			for (int c = 0; c<board.length; c++) {
				placeholder = drawn[i];
				boardholder = board[i][c];
				if (boardholder == placeholder) {
					return true;
				}
				if (boardholder != extra) {
					return false;
				}
			}
		}

		return false;
	}

}
