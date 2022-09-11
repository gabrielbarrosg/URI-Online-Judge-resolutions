package iniciante;

import java.util.Scanner;

public class Uri1151 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Array = new int[N];
        for(int i=0; i<N; i++){
        	if(i==0 || i==1) {
        		Array[i] = i;
        	}else {
        		Array[i] = Array[i-1] + Array[i-2];
        	}
    		System.out.print(Array[i] + " ");
        }
        sc.close();
	}
}
