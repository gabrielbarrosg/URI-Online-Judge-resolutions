package iniciante;

import java.util.Scanner;

public class Uri1099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int max, min;
            int sum = 0;
            if(X>Y){
                max = X;
                min = Y;
            }else{
                max = Y;
                min = X;
            }
            for(int k=min+1; k<max; k++){
                if(k%2 != 0){
                    sum+=k;
                }
            }
            System.out.println(sum);
        }
        sc.close();
	}

}
