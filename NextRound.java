import java.util.Scanner;

public class NextRound{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int numPlayers = s.nextInt();
        int score = s.nextInt();
        s.nextLine();
        int[] players = new int[numPlayers];
        int index = 0;
        while(s.hasNext()){
            players[index] = s.nextInt();
            index++;
        }
        int k = players[score - 1];
        int count = 0;
        for(int i = 0; i < numPlayers; i++){
            if(players[i] >= k && players[i] != 0){
                count++;
            }
        }
        System.out.print(count);
    }
}