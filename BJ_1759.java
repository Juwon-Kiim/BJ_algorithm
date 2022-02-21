package w0221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_1759 {
	static int L, C;
	static char[] alp;
	static char[] ans;
	static int count1, count2;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		alp=new char[C];
		ans=new char[L];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<C;i++) {
			alp[i] = st.nextToken().charAt(0);
		}
		
		
		Arrays.sort(alp);
		combi(0,0);
	}
	public static void combi(int cnt, int start) {
		count1=0;
		count2=0;
		if(cnt==L) {
			if(check()) {
				for (char c : ans) {
					System.out.print(c);
				}
				System.out.println();
			}
			return;
		}
		
		for(int i=start;i<C;i++) {
			ans[cnt]=alp[i];
			combi(cnt+1, i+1);
		}
		
	}
	public static boolean check() {
		for(char c: ans) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count1++;
			}
			else {
				count2++;
			}
		}
		if(count1>=1&&count2>=2)
			return true;
		return false;
	}
}
