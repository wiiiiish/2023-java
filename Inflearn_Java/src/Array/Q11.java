package Array;

import java.util.Scanner;

public class Q11 {
	
	public int solution (int n, int[][] arr) {
		
		int ans = 0; // 결과
		int max = 0; // 같은 반 최댓값
		int cnt = 0; // count
		
		for (int i=0; i<n; i++) {
			cnt = 0;
			for (int j=0; j<n; j++) {
				if (i!=j) {
					for (int k=0; k<5; k++) {
						if (arr[i][k] == arr[j][k]) {
							cnt++;
						}
					}
				}
			}
			if (max < cnt) {
				max = cnt;
				ans = i+1; // 학생 번호
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Q11 T = new Q11();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 입력받은 학생수
		int[][] arr = new int[n][5];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(T.solution(n, arr));

	}
}