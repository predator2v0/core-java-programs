package array;

import java.util.*;
public class arrayDs{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //single dimensional array.
        // int ar[] = new int[5]; //dynamic initialization
        int ar[] = {1,2,3,4,5}; //static initialization
        // custom array input in loop
        // for(int i = 0;i<5;++i){
        //     System.out.print("ar["+i+"]: ");
        //     ar[i] = s.nextInt();
        // }
        System.out.println();
        for(int j = 0;j<5;++j){
            System.out.println("ar["+j+"]: "+ar[j]);
        }
        //multi dimensional array (2D).
        System.out.println();
        // int [][] arr = new int[3][2]; //dynamic initialization
        int arr[][] = {{1,2},{3,4},{5,6}}; //static initialization
        //custom 2d array input in loop
        // for(int k = 0;k<3;++k){
        //     for(int l = 0; l<2;++l){
        //         System.out.print("arr["+k+"]["+l+"]: ");
        //         arr[k][l] = s.nextInt();
        //     }
        // }
        System.out.println();
        for(int m = 0; m<3;++m){
            for(int n = 0; n<2;++n){
                // System.out.print("arr["+m+"]["+n+"]: "+arr[m][n]);
                System.out.print(arr[m][n]+" ");
            }
            System.out.println();
        }
        //jagged array( column size varies for every row).
        // int [][] arra = new int [3][];
        // arra[0] = new int[2];
        // arra[1] = new int[1];
        // arra[2] = new int[3];
        int arra[][] = {{1,2,3},{2,4},{1,2,4,5}}; //static initialization of jagged values
        //dynamic input of array values.
        // for(int o = 0;o<3;++o){
        //     for(int p = 0;p<arra[o].length; ++p){
        //         arra[o][p] = s.nextInt();
        //     }
        // }
        System.out.println();
        for(int q = 0; q<3;++q){
            for(int r = 0;r<arra[q].length;++r){
                System.out.print(arra[q][r]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}