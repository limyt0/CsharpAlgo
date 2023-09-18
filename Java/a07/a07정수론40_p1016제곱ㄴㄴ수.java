package a07;

import java.util.*;

public class a07정수론40_p1016제곱ㄴㄴ수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long min = sc.nextLong();
		long max = sc.nextLong();
		boolean[] check = new boolean[(int) (max - min +1)];
		for(long i = 2; i*i<max; i++) {
			long pow = i*i;
			long start_index = min/ pow;
			if(min % pow  != 0) {
				start_index++;
			}
			for(long j = start_index; pow*j<= max; j++) {
				check[(int) ((j*pow) - min)] = true;
			}
		}
		int count = 0;
		for(int i = 0; i<=max - min; i++) {
			if(!check[i]) {				
				count++;
			}
		}
		System.out.println(count);
		
	}

}
