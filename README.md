# Algorithm
여기는 백준 문제!

1. BJ_2961.java 백준2961번 도영이가 만든 맛있는 음식(실버1)
- 부분집합과 재귀를 사용하여 문제를 해결하였다.

2. Prob_7.java 백준15815번 천재 수학자 성필(실버4)
- 스택과 스위치문을 사용하여 문제를 해결하였다.

3. BJ_1244.java 백준1244번 스위치 켜고 끄기(실버3)
- 간단한 구현 문제였다. 하지만 각 위치의 스위치 값을 비교하여 같으면 스위치 상태를 변경하고 다르면 반복문을 탈출하는 라인(60~73)에서 런타임에러(ArrayIndexOutOfBounds)라는 결과가 떠서 이를 해결하는데 시간이 좀 들었다.

4. BJ_11724.java 백준11724번 연결 요소의 개수(실버2)
- dfs에 대해서 이해를 하고 문제를 몇 개 풀어본 후 dfs와 함께 배웠던 bfs에 대해서도 구현을 해보고 싶어 문제를 풀었고, dfs와 다르게 bfs는 큐를 이용해서 인접한 노드들을 큐에 넣고 하나씩 빼며, 빼낸 노드의 인접한 노드를 다시 넣고를 반복하는 작업을 통해 문제를 해결해 나가는 방법이었다. 이 문제에서는 연결 요소의 개수를 구하는 문제였기 때문에 첫 번째 노드부터 들어가서 인접한 노드들을 모두 큐에 넣고 방문처리를 해주고 모두 빼준다. 그렇게 해서 bfs메서드가 끝나게 되면 연결 요소의 개수를 1 증가시켜주고 다음 노드를 주며 bfs를 반복하는 방법을 통해 문제를 풀었다. 아직 완전히 이해하지 못했고, 추가적인 문제들을 풀어야한다.

5. BJ_1260.java 백준1260번 DFS와 BFS(실버2)
- 이때까지 배우고 공부했던 dfs와 bfs에 대해서 확인해보는 문제였다. 좋은 복습 문제였고, bfs는 조금 더 공부해서 마스터하자.

6. BJ_1759.java 백준1759번 암호 만들기(골드5)
- 이번 문제는 조합을 사용하여 풀었다. 기본 조합과 비슷한 로직을 구현했고 추가적인 조건(최소 한개의 모음, 최소 두개의 자음)을 설정해주었는데 입력받은 배열에서 모음을 찾으면 count1을 1올려주고, 자음을 찾으면 count2를 1올려준다. 그렇게 해서 count1이 1 이상이고 count2가 2 이상이면 출력되게 코드를 작성하였다.

7. BJ_10026.java 백준10026번 적록색약(골드5)
- dfs를 사용하여 해당하는 연결되어 있는 색의 지역을 모두 방문 후 지역 수를 1 올려주었다. 적록색약인 상태에서 봤을 때는 Red와 Green이 같은 색으로 보이기 때문에 Green을 Red로 만들어준후 다시 dfs를 돌려 지역 수를 찾아주었다.

8. BJ_1789.java 백준1789번 수들의 합(실버5)
- 그리디 알고리즘으로 분류된 문제이다. 서로 다른 N개의 자연수의 합이 S인데 S가 주어졌을 때 자연수 N의 최대값을 구하는 문제이다. 그리디 알고리즘은 머릿속으로 문제를 직관적으로 해결할 때와 흡사하다. 1부터 숫자들을 더해가면서 마지막에 숫자를 더했을 때 S보다 커진다면 마지막 숫자를 빼고 S에 맞는 숫자를 더해주면 된다. 간단하게 해결한 문제이다.

9. BJ_2217.java 백준2217번 로프(실버4)
- 그리디 알고리즘으로 해결할 수 있는 문제이다. 로프의 개수를 받고 N개의 로프로 물건을 든다 했을 때 N개의 로프 중 들 수 있는 최소 무게를 N개 로프만큼 곱하면 들 수 있는 최대의 무게가 된다. 이를 이용하여 for문을 사용하여 N개의 로프를 선택했을 때 들 수 있는 무게의 최대값을 갱신시킨 후 최대값을 출력한다.

10. BJ_11720.java 백준11720번 숫자의 합(브론즈2)
- 이 때까지 풀었던 문제들을 보다가 풀지 못한 문제들을 살펴보다가 왜 틀렸지 하는 마음에 다시 풀어보았다. 난이도를 보니 학교다닐때 풀어본 문제 같은데 왜 틀렸나 싶은 마음이 든다. N개의 숫자를 공백없이 입력받는 거에서 String으로 받아서 for문을 돌며 charAt()으로 하나씩 빼내서 sum변수에다가 더해주면 해결되는 문제이다.

11. BJ_5525.java 백준5525번 IOIOI(실버2)
- 패턴 반복 횟수 N번 붙여서 하나의 패턴 문자열로 만들어서 전체 문자열과 비교하며 패턴 문자열과 일치하면 카운트해주는 코드를 작성했지만 50점이었다. 스터디원이 푼 방법을 보고 설명을 들어보니 문자열 비교는 패턴 문자열이 길어질수록 시간이 많이 걸린다고 했다. 그래서 IOI만으로 비교하면서 IOI가 일치할 때마다 카운트해주고 카운트가 N이 된다면 전체를 하나로 보고 결과값을 1올려주는 방식으로 코딩하여 해결하는 문제이다.

12. BJ_1012.java 백준 1012번 유기농 배추(실버2)
- 완전탐색(dfs, bfs)을 완벽하게 짤 수 있도록 하기 위해 기초부터 다시 시작하기 위해 풀었다. 배추흰지렁이는 인근에 있는 모든 배추의 해충을 잡아먹을 수 있다. bfs를 이용하여 인근 배추를 확인하고 count++시킨다. 모든 배열을 확인하고 결과를 출력하게 했다.

13. BJ_2178_미로탐색.java (실버1)
- bfs를 이용하여 4방 탐색을 통해 갈 수 있는 곳(1 & false)이라면 갈 수 있는 곳에 현재의 칸에 수에 +1을 하여 도착지에 도달하면 최소의 칸 수를 출력하게 했다.

14. BJ_7576_토마토.java (골드5)
- bfs 4방 탐색을 이용한 문제이다. for문을 돌려 box내에 익은 토마토의 위치 모두를 queue에 넣는다. 그리고 queue가 빌 때까지 4방 탐색을 하며 익지 않은 토마토가 있다면 그 방향으로 +1씩 더한 값들을 넣는다. bfs탐색이 끝나고 box에 익지 않은 토마토가 남아있다면 -1을 모두 익었다면 box 배열에서의 최대값을 출력한다.

15. BJ_10974_모든순열.java (실버3)
- 순열 구하기 문제이다. 기본을 잊어버리지 않기 위해 풀었다. 재귀함수를 통해 문제를 풀었다.

16. BJ_1018_체스판다시칠하기.java (실버4)
- 브루트포스 알고리즘 문제이다. 체스판의 크기에서 8x8을 떼어내서 체스판이 올바르게 색칠되기 위한 최소 개수를 구하는 문제이다. 체스판의 색이 흰색이면 true, 검은색이면 false로 정하고 0번 index에서부터 8 크기 만큼 색칠한다. 시작 위치의 색을 저장하고 다음 칸으로 이동하면서 색을 바꾸면서 카운트를 센다. 그 결과를 min 값과 비교하여 최소값을 출력한다.

17. BJ_2583_영역구하기.java (실버1)
- bfs 4방 탐색을 이용하여 문제를 풀었다. 전체 map에 K개의 직사각형에 대한 좌표를 받고 1로 저장한다. 그 후 bfs를 통해 visited되지 않았고 1이 아닌 map을 탐색하고 탐색이 끝나면 map에서의 사각형 개수를 +1 해주고 cnt함수에 해당 사각형의 영역을 저장한다. 탐색이 끝나면 오름차순 정렬을 하고 출력한다.

18. BJ_2885_초콜릿식사.java (실버2)
- 그리디 알고리즘 문제이다. 초콜릿은 2의 제곱 형태이고 항상 반으로 쪼개진다. 이를 이용하여 K개의 정사각형이 되도록 초콜릿을 쪼갤 때 최소 크기를 구하고 쪼개가면서 K개가 될 때 최소 크기와 쪼갠 횟수를 출력한다. 그리디는 생각해내는 것이 어렵지만 코드를 작성해보면 생각보다 간단한 것을 확인할 수 있다.

19. BJ_7795_먹을것인가먹힐것인가 (실버3)
- 브루트포스 방식으로 풀어보니 시간 초과가 발생하였다. A, B 배열을 오름차순 정렬시키고 A배열 각 원소에 대해 B 배열을 가장 큰 수부터 비교하여 A배열의 원소가 더 크다면 그 이하의 B배열의 모든 원소보다 크다는 것을 의미하기 때문에 해당 원소 개수를 더하고 A배열의 다음 원소로 간다.(이하 나머지 원소에 대해서는 비교 생략) 이를 통해 시간을 줄일 수 있었다.

20. BJ_1927_최소힙 (실버2)
- 우선순위 큐를 사용하여 간단하게 해결할 수 있었다. Scanner를 사용하여 시간초과가 나서 BufferedReader로 교체하였고 해결할 수 있었다.

21. BJ_11279_최대힙 (실버2)
- 위 최소힙과 마찬가지였고, 대신 우선순위 큐를 뒤집어야 했다. 그래서 Comparator를 사용하여 해결하였다.

22. BJ_4485_녹색옷입은애가젤다지 (골드4)
- 최단경로문제(다익스트라). 기본적인 베이스는 bfs이지만 경로에 가중치가 있기 때문에 추가적으로 distance라는 배열을 만들어 해당 위치로 이동할 때의 최소값을 저장해준다. 여기서 우선순위 큐를 사용하는 이유는 속도에 이점이 있기 때문이다. 큐를 사용했을 경우 크기 관계없이 FIFO가 되기 때문에 이전에 계산한 작업이 무의미한 값이 되는 경우가 많다. 따라서 우선순위 큐를 사용함으로써 갱신 횟수가 현저히 적어지는 이점이 있다.

23. BJ_11286_절댓값힙 (실버1)
- 20번, 21번 문제와 마찬가지로 우선순위 큐를 사용하여 풀 수 있다. 중요한 것은 Comparator를 사용하여 절댓값이 같을 때 더 작은 수가 먼저 나오게 조건문을 걸어주어 해결하였다.

24. BJ_2352_반도체설계 (골드2)
- LIS + DP 문제이다. LIS란 어떤 수열이 주어졌을 때 그 수열의 부분 수열 중에서 가장 길이가 긴 수열을 의미한다. 이 문제에서 연결이 꼬이지 않으려면 A 왼쪽 < B 왼쪽일 때 A 오른쪽 < B 오른쪽이어야 한다. 배열의 인덱스는 증가수열의 길이, 값은 증가수열에서 가장 큰 값을 의미한다. 배열을 돌며 겹치지 않는 최대 연결 개수를 찾아 출력한다

25. BJ_2644_촌수계산 (실버2)
- dfs문제이다. 두 사람 A, B의 촌수 관계를 파악하기 위해 인접행렬을 사용하여 주어진 부모 자식 관계를 가진 두 사람의 인덱스에 1을 주었다. A와 1부터 9까지 모든 사람과의 부모 자식 관계를 비교하여 맞다면 촌수를 1 더하고 A의 부모에서 다시 시작하는 사이클이다.

26. BJ_1926_그림 (실버1)
- bfs문제이다. 큰 도화지에 상하좌우에 1이 있어야 그림이 이어져있다고 정의되어 있기 때문에 4방 탐색과 큐를 통해 연결된 그림 그룹을 찾는다. 그룹을 찾으면서 각 그룹별 그림의 개수까지 구한다.

27. BJ_11047_동전0 (실버4)
- greedy문제이다. greedy란 매 선택에서 최적의 해를 찾는 방식이다. 이 문제를 대입해보자면, 주어진 동전들로 K라는 숫자를 만들어야 할 때 그리디하게 K보다 크지 않은 최고의 수부터 선택하게 된다. 그렇게 선택하면서 K라는 숫자가 만들어지면 그것이 바로 그리디의 해가 되는 것이다.

28. Main1439 (실버5)
- 문자열 문제이다. 처음엔 1에서 0으로 바뀔때, 0에서 1로 바뀔때 각 1, 0을 하나씩 더하는 식으로 구현을 했다. 테스트 케이스도 다 맞고 한데 채점 결과는 틀렸다고 하여 당황했지만 더 많은 테케를 넣다가 잘못된 부분을 발견하게 되었다. 원래는 마지막 바로 전과 마지막 인덱스를 비교해서 다르면 해당 숫자를 하나 올리는 식이었는데 마지막 바로 전과 마지막 인덱스가 같고 마지막 바로 전의 전과 마지막 바로 전이 다르다면 마지막 바뀐 부분이 체크가 안되고 있었다. 전혀 다른 방식으로 접근하여 StringTokenizer를 사용하여 각각 0과 1로 분리시키고 그 분리된 토큰들의 개수를 비교하여 최소값을 출력하도록 하였다.







