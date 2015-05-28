import java.util.Scanner;



public class MikeandFun{
	public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			int Rows = s.nextInt();
			int Cols = s.nextInt();
			int Rounds = s.nextInt();
			int[][] field = new int[Rows][Cols];
			for(int r = 0; r < Rows; r++){
				for(int c = 0; c < Cols; c++){
					field[r][c] = s.nextInt();
				}
			}
			int[] rowScore =  new int[Rows];
			for(int i = 0; i < Rows; i++){
				int count = 0;
				for(int j = 0; j < Cols; j++){
					if(field[i][j] == 1){
						count++;
					}
					else{
						rowScore[i] = Math.max(rowScore[i], count);
						count = 0;
					}
				}
				rowScore[i] = Math.max(rowScore[i], count);
			}
			for(int round = 0; round < Rounds; round++){
				int changeRow = s.nextInt();
				int changeCol = s.nextInt();
				if(field[changeRow - 1][changeCol - 1] == 1){
					field[changeRow - 1][changeCol - 1] = 0;
				}
				else{
					field[changeRow - 1][changeCol - 1] = 1;
				}
				int count = 0;
				rowScore[changeRow-1] = 0;
				for(int column = 0; column < Cols; column++){
					if(field[changeRow-1][column] == 1){
						count++;
					}
					else{
						rowScore[changeRow-1] = Math.max(rowScore[changeRow-1], count);
						count = 0;
					}
				}
				rowScore[changeRow - 1] = Math.max(rowScore[changeRow-1], count);
				int max = 0;
				for(int index = 0; index < rowScore.length; index++ ){
					max = Math.max(rowScore[index], max);
				}
				System.out.println(max);
			}
		}
	}
