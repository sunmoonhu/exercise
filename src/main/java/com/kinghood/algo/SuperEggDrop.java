package com.kinghood.algo;

// https://leetcode.com/problems/super-egg-drop/description/
public class SuperEggDrop {
    public int getDrops(int K, int N) {
        int[] dpPre = new int[K+1];
        int[] dpCur = new int[K+1];

        int drops = 0;
        while(true) {
            drops++;
            for (int k=1; k<=K; k++) {
                dpCur[k] = dpPre[k-1] + dpPre[k] + 1;
                if (dpCur[k] >= N) return drops;
            }

            int[] temp = dpPre;
            dpPre = dpCur;
            dpCur = temp;
        }
    }
}
