package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_2178_미로탐색 {
	public static int N, M;
	public static int[][] map;
	public static boolean[][] visited;
	public static int[] dr = {-1, 1, 0, 0};
	public static int[] dc = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			String line = br.readLine();
			for(int j=0;j<M;j++) {
				 map[i][j] = line.charAt(j)-'0';
			}
		}
		visited[0][0] = true;
		bfs(0, 0);
		
		System.out.println(map[N-1][M-1]);
	}
	
	public static void bfs(int r, int c) {
		Queue<int[]> queue = new LinkedList<>();
		
		queue.add(new int[] {r, c});
		
		while(!queue.isEmpty()) {
			int[] cur=queue.poll();
			int curR = cur[0];
			int curC = cur[1];
			
			for(int d=0;d<4;d++) {
				int nr = curR+dr[d];
				int nc = curC+dc[d];
				
				if(nr>=0 && nr<N && nc>=0 && nc<M && !visited[nr][nc] && map[nr][nc]!=0) {
					queue.offer(new int[] {nr, nc});
					map[nr][nc] = map[curR][curC] + 1;
					visited[nr][nc]=true;
				}
			}
		}
	}
}
