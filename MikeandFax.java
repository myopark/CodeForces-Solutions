import java.util.Scanner;
import java.util.Arrays;

public class MikeandFax{
    public static void main(String args[]){
            Scanner s = new Scanner(System.in);
            String word = s.nextLine();
            int num = s.nextInt();
            if(isBackPack(word, num)){
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }   

    }
    public static boolean isBackPack(String word, int num){
        if(word.length() % num != 0){
            return false;
        }
        int length = word.length()/num;
        for(int i = 0; i < num; i++){
            int scale = i * length;
            for(int j = 0; j < length; j++){
                if(word.charAt(scale + j) != word.charAt(scale + length - j - 1)){
                    return false;
                }
            }
        }
        return true;
    }
}