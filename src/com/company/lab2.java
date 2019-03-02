package com.company;

public class lab2 {
    public static void main(String[] arg) {
        double n=3,m=3;
        double [][]A = new double[][]{
                {4,1,-6},
                {3,6,1},
                {2,1,3}
        };
                Func(A, n, m);

            }

            private static void Func(double[][] A, double n, double m) {
                for (int i = 0; i <n; i++){
                    for (int j=0;j<m;j++){
                        double L =3*A[i][j];
                        System.out.print(L +" ");

                    }
                    System.out.println();
                }
            }
        }


