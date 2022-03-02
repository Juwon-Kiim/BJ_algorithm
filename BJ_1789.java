package Algo_D0302;

import java.util.Scanner;

public class BJ_1789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long S = sc.nextLong();
		
		int cnt = 0;
		long num=1;
		while(true) {
			if(S-num>=0) {
				S-=num;
				cnt++;
				num++;
			}
			else {
				System.out.println(cnt);
				break;
			}
		}
	}
}
