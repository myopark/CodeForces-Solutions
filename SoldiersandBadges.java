import java.util.Scanner;
import java.util.Arrays;

    public class SoldiersandBadges{
        public static void main(String args[]){
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            int[] badges = new int[num];
            for(int i = 0; i < num; i++){
                badges[i] = s.nextInt();
            }
            int numCoins = 0;
            Arrays.sort(badges);
            for(int i = 0; i < num - 1; i++){
                if(badges[i] >= badges[i+1]){
                    numCoins += badges[i] - badges[i+1] + 1;
                    badges[i+1] = badges[i+ 1] + (badges[i] - badges[i+1] + 1);
                }
            }
            System.out.print(numCoins);
        }
    }