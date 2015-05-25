import java.util.Scanner;

public class SoldiersandBananas{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int cost = s.nextInt();
        int money = s.nextInt();
        int want = s.nextInt();
        int sum = want * (want + 1) / 2;
        int total = sum * cost; 
        if(total > money){
            System.out.print(total - money);
        }
        else{
            System.out.print(0);
        }
    }
}