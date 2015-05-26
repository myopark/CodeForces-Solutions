import java.util.Scanner;

public class Taxi{
	public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			int numGroups = s.nextInt();
			int[] freqs = new int[5];
			while(s.hasNext()){
				freqs[s.nextInt()]++;
			}
			int count = 0;
			while(freqs[3] > 0 ){
				freqs[3]--;
				if(freqs[1] > 0)
					freqs[1]--;
				count++;
			}
			while(freqs[2] > 0){
				freqs[2]--;
				if(freqs[1] > 0)				
						freqs[1]-=2;
				else if(freqs[2] > 0)
					freqs[2]--;
				count++;
			}
			count+=freqs[4];
			if( freqs[1] > 0){
				int temp = freqs[1] % 4;
				if(temp > 0){
					count+=freqs[1] / 4 + 1;
				}
				else{
					count+=freqs[1] / 4;
				}
			}

			System.out.print(count);
	}
}