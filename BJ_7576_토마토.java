package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_7576_토마토 {
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	static int[][] box;
	static int N,M;
	static int day = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		box = new int[M][N];
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bfs();
		int max = 0;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(box[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				max = Math.max(max, box[i][j]);
			}
		}
		System.out.println(max-1);
	}
	public static void bfs() {
		Queue<int[]> queue = new LinkedList<>();
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(box[i][j] == 1) {
					queue.offer(new int[] {i, j});
				}
			}
		}
		
		while(!queue.isEmpty()) {
			int[] cur = queue.poll();
			int cr = cur[0];
			int cc = cur[1];
			
			for(int d=0;d<4;d++) {
				int nr = cr+dr[d];
				int nc = cc+dc[d];
				
				if(nr>=0 && nc>=0 && nr<M && nc<N && box[nr][nc]==0) {
					box[nr][nc] = box[cr][cc] + 1;
					queue.offer(new int[] {nr, nc});
				}
			}
		}
	}
}
