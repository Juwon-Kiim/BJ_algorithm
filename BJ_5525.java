package Algo_D0307;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ_5525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[] S = sc.next().toCharArray();
		
		
		int p_cnt = 0;
		int ans = 0;
		
		for(int i=0;i<M-2;i++) {
			if(S[i]=='I' && S[i+1]=='O' && S[i+2]=='I') {
				p_cnt++;
				if(p_cnt==N) {
					p_cnt--;
					ans++;
				}
				i++;
			}
			else {
				p_cnt=0;
			}
		}
		
		System.out.println(ans);
	}
}
