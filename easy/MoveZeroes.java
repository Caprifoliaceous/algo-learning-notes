/*
https://leetcode.cn/problems/move-zeroes
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
请注意 ，必须在不复制数组的情况下原地对数组进行操作。
*/
class MoveZeroes {
    public void solution(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[nums.length - j + i - 1] == 0) {
                result[j] = 0;
                j--;
            } else {
                result[i] = nums[nums.length - j + i - 1];
                i++;
            }
        }
        System.arraycopy(result,0,nums,0,nums.length);
    }
}
