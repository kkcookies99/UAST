class Solution {
    public int XXX(int[] height) {
        int min = 0; //存放最小值
        int sum = 0; //计算结果
        int left = 0; //左指针
        int right = height.length - 1; //右指针
        while (left < right){
            //当左边的值 小于等于 右边的值时，取两者较小的值，计算容量。容量 = 较小值 *（右下标-左下标）。然后移动左指针
            if (height[left] <= height[right]){
                min = height[left];
                sum = Math.max(sum,min * (right-left));
                left++;
            }else { //左边的值 大于 右边的值
                min = height[right];
                sum = Math.max(sum,min * (right-left));
                right--;
            }

        }
        //返回结果
        return sum;
    }
}

