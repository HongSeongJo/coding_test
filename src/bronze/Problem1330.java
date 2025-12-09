package bronze;

import java.util.*;
import java.io.*;

public class Problem1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int A = Integer.parseInt(st[0]);
        int B = Integer.parseInt(st[1]);

        if (A > B)
            System.out.println(">");
        else if (A < B) {
            System.out.println("<");
        }
        else
            System.out.println("==");
    }
}
