import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int painting[][] = new int[n][n];
        for (int r = 0; r < n; r++){
            for (int c = 0; c < n; c++){
                painting[r][c] = sc.nextInt();
            }
        }
        int check[][] = {{-1, -1}, {-1, 0}, {-1, 1}, {1, -1}, {1, 0}, {1, 1}, {0, -1}, {0, 1}};
        int count = 0;
        for (int r = 0; r < n; r++){
            for (int c = 0; c < n; c++){
                boolean checkAll = true;
                for (int i = 0; i < 8; i++){
                    int x = check[i][0], y = check[i][1];
                    int cRow = c + x, rRow = r + y;
                    if (!(cRow < 0 || cRow == n) && !(rRow < 0 || rRow == n)){
                        int original = painting[r][c];
                        int compare = painting[rRow][cRow];
                        if ((original + k) >= compare && (original - k) <= compare){
                            //System.out.println("" + original + ", " + compare);
                        } else {
                            checkAll = false;
                            //System.out.println("" + original + ", " + compare);
                        }
                    }
                }
                if (checkAll){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
