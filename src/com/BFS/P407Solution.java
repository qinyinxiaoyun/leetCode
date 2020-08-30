package com.BFS;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Given an m x n matrix of positive integers representing the height of each unit cell in a 2D elevation map,
 * compute the volume of water it is able to trap after raining
 */
public class P407Solution {
    public int trapRainWater(int[][] heightMap) {
        int ans = 0;
        if (heightMap.length<3||heightMap[0].length<3)return 0;
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        int[][] mask = new int[heightMap.length][heightMap[0].length];
        for (int i = 0;i<heightMap[0].length;i++){
            queue.offer(new int[]{0,i,heightMap[0][i]});
            queue.offer(new int[]{heightMap.length-1,i,heightMap[heightMap.length-1][i]});
            mask[0][i] = 1;
            mask[heightMap.length-1][i] = 1;
        }
        for (int i = 1;i<heightMap.length-1;i++){
            queue.offer(new int[]{i,0,heightMap[i][0]});
            queue.offer(new int[]{i,heightMap[0].length-1,heightMap[i][heightMap[0].length-1]});
            mask[i][0] = 1;
            mask[i][heightMap[0].length-1] = 1;
        }
        int[][] d = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while (!queue.isEmpty()){
            int[] a = queue.poll();
            for (int[] item:d){
                int x = a[0]+item[0];
                int y = a[1]+ item[1];
                if (x>0&&x<heightMap.length && y>0 && y<heightMap[0].length && mask[x][y]==0){
                    mask[x][y] = 1;
                    queue.offer(new int[]{x,y,Math.max(a[2],heightMap[x][y])});
                    if (a[2]>heightMap[x][y])ans += (a[2]-heightMap[x][y]);
                }
            }
        }
        return ans;
    }
}
