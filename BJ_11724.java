package BJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_11724 {
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정점의 개수
		int N = sc.nextInt();
		
		// 간선의 개수
		int M = sc.nextInt();
		
		count = 0;
		
		// 그래프를 배열로 표현
		int[][] arr = new int[N+1][N+1];
		
		boolean[] selected = new boolean[N+1];
		
		for(int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b]=1;
			arr[b][a]=1;
		}
		for(int i=1;i<=N;i++) {
			if(!selected[i]) {
				bfs(i, arr, selected, N, M);
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	public static void bfs(int idx, int[][] arr, boolean[] selected, int N, int M) {
		
		Queue<Integer> queue = new LinkedList<>();
		selected[idx]=true;
		queue.add(idx);
		
		while(!queue.isEmpty()) {
			int curIdx = queue.poll();
			for(int i=1;i<=N;i++) {
				if (!selected[i] && arr[curIdx][i] == 1) {
					selected[i] = true;
					queue.add(i);
				}
			}
		}
	}
}
