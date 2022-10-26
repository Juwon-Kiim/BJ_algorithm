package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2644 {
    static int n, m;
    static int p1, p2;
    static int start, end;
    static int[][] arr;
    static int ans;
    static boolean[][] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        p1 = Integer.parseInt(st.nextToken());
        p2 = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());

        arr = new int[n+1][n+1];
        check = new boolean[n+1][n+1];

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            arr[start][end] = 1;
            arr[end][start] = 1;
        }

        ans = -1;

        dfs(p1, 0);

        System.out.println(ans);
    }
    static void dfs(int num, int cnt){
        // 종료
        if(num==p2) {
            ans = cnt;
        }

        for(int i=1;i<=n;i++){
            if(num == i) continue;
            if(arr[num][i] == 1){
                if(!check[num][i]) {
                    check[num][i] = true;
                    check[i][num] = true;
                    cnt++;
                    dfs(i, cnt);
                    cnt--;
                }
            }
        }
    }
}
