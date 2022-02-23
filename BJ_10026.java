package hw0223;

import java.util.Scanner;

public class BJ_10026 {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int N, ans1, ans2;
	static char[][] map;
	static boolean[][] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		map = new char[N][N];
		visited = new boolean[N][N];
		
		for(int i=0;i<N;i++) {
			map[i] = sc.next().toCharArray();
		}
		
		ans1=0;
		ans2=0;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!visited[i][j]) {
					dfs(i, j);
					ans1++;
				}
			}
		}
				
		
		visited = new boolean[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j]=='G') {
					map[i][j]='R';
				}
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!visited[i][j]) {
					dfs(i, j);
					ans2++;
				}
			}
		}
		System.out.print(ans1+" "+ans2);
	}
	public static void dfs(int x, int y) {
		
		visited[x][y] = true;
		char color = map[x][y];
		for(int i=0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=0&&ny>=0&&nx<N&&ny<N&&!visited[nx][ny]&&map[nx][ny]==color) {
				dfs(nx, ny);
			}
		}
	}
}
