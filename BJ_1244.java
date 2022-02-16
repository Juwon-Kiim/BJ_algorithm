package D0216;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1244 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 스위치의 개수
		int N = Integer.parseInt(br.readLine());
		
		// 스위치 상태를 저장할 배열
		int[] sw = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			sw[i] = Integer.parseInt(st.nextToken());
		}
		
		// 사람 수
		int p = Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<p;i++) {
			st = new StringTokenizer(br.readLine());
			
			// 남 or 여
			int sex = Integer.parseInt(st.nextToken());
			
			// 받은 수
			int number = Integer.parseInt(st.nextToken());
			
			// 남자
			if(sex==1) {
				for(int j=0;j<N;j++) {
					// 스위치가 받은 수의 배수이면
					if((j+1)%number==0) {
						
						// 해당 스위치 상태 변경
						if(sw[j]==1) {
							sw[j] = 0;
						}
						else {
							sw[j] = 1;
						}
					}
				}
			}
			// 여자
			else if(sex==2) {
				// 받은 수의 위치의 스위치 상태 변경
				if(sw[number-1]==0) sw[number-1]=1;
				else sw[number-1]=0;
				
				// 받은 수로부터 좌우로 한칸씩 늘리면서
				for(int j=1;j<N;j++) {
					// 범위를 벗어나면 break
					if(number-1-j<0||number-1+j>=N) break;
					
					// 각 위치의 스위치 값을 비교해서 같으면 스위치 상태 변경
					if(sw[number-1-j]==sw[number-1+j]) {
						if(sw[number-1-j]==1) sw[number-1-j]=0;
						else sw[number-1-j]=1;
						if(sw[number-1+j]==1) sw[number-1+j]=0;
						else sw[number-1+j]=1;
					}
					// 다르면 break
					else break;
				}
			}
		}
		// 출력
		for(int i=0;i<N;i++) {
			System.out.print(sw[i]+" ");
			// 21번째 스위치 값부터는 다음 줄로
			if((i+1)%20==0) {
				System.out.println();
			}
		}
	}
}