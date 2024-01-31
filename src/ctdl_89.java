import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ctdl_89 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    if(n>1 && n < 9) {
                        int[] x = new int[n + 1];
                        for (int i = 1; i <= n; i++) {
                            x[i] = sc.nextInt();
                        }
                        Arrays.sort(x);

                        while (true) {
                            for (int i = 1; i <= n; i++) {
                                System.out.print(x[i] + " ");
                            }
                            System.out.println();
                            int j = n - 1;
                            int k = n;
                            while (x[j] > x[j + 1] && j > 0) j--;
                            if (j == 0) break;
                            else {
                                while (x[k] < x[j]) k--;
                                int tmp = x[j];
                                x[j] = x[k];
                                x[k] = tmp;
                                int l = j + 1, r = n;
                                while (l < r) {
                                    tmp = x[l];
                                    x[l] = x[r];
                                    x[r] = tmp;
                                    l++;
                                    r--;
                                }
                            }

                        }
                    }
        }

    }

