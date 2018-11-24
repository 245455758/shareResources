package com.trouble.shareresources.test;

public class alg {

    public static int[][] nums = new int[6][];

    public static void main(String[] args) {
        for (int i=0;i<6;i++){
            nums[i] = new int[6];
        }

        for (int i = 0; i < 6 ; i++) {
            
        }
        
    }

    public boolean judge(int[][] nums){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (nums[i][j] == nums[5-i][5-j])  return false;
            }
        }
        return true;

    }

}
