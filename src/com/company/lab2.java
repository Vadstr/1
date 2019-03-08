package com.company;
import java.util.*;
public class lab2 {
    public static void main(String[] arg) {
        int n=3,m=3;
        int [][]A = new int[][]{
                {4,1,-6},
                {3,6,1},
                {2,1,3}
        };
                Func(A, n, m);

            }

            private static void Func(int[][] A, int n, int m) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
                for (int i = 0; i <n; i++){
                    for (int j=0;j<m;j++){
                        int L = B*A[i][j];
                        System.out.print(L +" ");

                    }
                    System.out.println();
                }
            }
        }


