package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int c = a * (b % 10);
        int d = a * (b / 10 % 10);
        int e = a * (b / 100);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a*b);
    }
}


/**
 * 1. 첫 번째 세 자리 수 입력 (1)
 * 2. 두 번째 세 자리 수 입력 (2)
 * 3. 두 번째의 일의 자리 수 부터 첫 번째 세 자리 수와 곱셈 (반복문) (3,4,5)
 * 4. 두 세 자리 수 곱셈 결과 값 (6)
 * 5. 3, 4, 5, 6 출력
 */
