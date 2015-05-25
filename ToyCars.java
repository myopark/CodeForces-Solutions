import java.util.Scanner;
    public class ToyCars{
        public static void main(String args[]){
            Scanner s = new Scanner(System.in);
            int numCars = s.nextInt();
            int[][] matrix = new int[numCars][numCars];
            for(int i = 0; i < numCars; i++ ){
                for(int j = 0; j < numCars; j++){
                    matrix[i][j] = s.nextInt();
                }
            }
            String carsOkay = "";
            int count = 0;
            for(int i = 0; i < numCars; i++){
                if(isGood(i, matrix, numCars)){
                    carsOkay += (i + 1) + " ";
                    count++;
                }
            }
            System.out.println(count);
            System.out.print(carsOkay);
            
        }

        public static boolean isGood(int i, int[][] matrix, int numCars){
            int column = 0;
            while(column < numCars){
                if(matrix[i][column] == 1 || matrix[i][column] == 3){
                    return false;
                }
                column++;
            }
            return true;
        }
    }