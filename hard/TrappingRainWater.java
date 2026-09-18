class TrappingRainWater {
/*
https://leetcode.cn/problems/trapping-rain-water
给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
*/
    public int solution(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int h = 0;
        int[] water = new int[height.length];
        while (l < r - 1) {
            h = Math.max(h, Math.min(height[l], height[r]));
            if (height[l] <= height[r]) {
                l++;
                water[l] = Math.max(0, h - height[l]);
            } else if (height[l] > height[r]) {
                r--;
                water[r] = Math.max(0, h - height[r]);
            }
        }
        int res = 0;
        for (int x : water) {
            res += x;
        }
        return res;
    }
}
