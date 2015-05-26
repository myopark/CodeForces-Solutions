import java.util.Scanner;
import java.util.Arrays;

public class Queue{
    public static void main(String args[]){
            Scanner s = new Scanner(System.in);
            int numPeople = s.nextInt();
            int[] line = new int[numPeople];
            int index = 0;
            while(s.hasNext()){
                line[index] = s.nextInt();
                index++;
            }
            Arrays.sort(line);
            index = 0;
            int count = 0;
            int time = 0;
            while(index < numPeople){
                if(time <= line[index]){
                    count++;
                    time+=line[index];
                }
                index++;
            }
            System.out.print(count);
    }
}