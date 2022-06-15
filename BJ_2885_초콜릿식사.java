package BJ;

import java.util.Scanner;

public class BJ_2885_초콜릿식사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int size = 1;
		int ans = 0;
		
		while(size < K) {
			size *= 2;
		}
		
		System.out.print(size+" ");
		
		while(K>0) {
			if(K>=size) K-=size;
			else {
				size /= 2;
				ans++;
			}
		}
		System.out.print(ans);
	}
}
