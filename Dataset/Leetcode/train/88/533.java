 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        // 首先应该从nums1的空位置开始放置，这样应该放置顺序应该是从小到大进行放置
        // nums1和nums2各设置一个指向尾部的指针
        // 即将插入的位置就是nums1的最后一位
        int index1 = m - 1;
        int index2 = n - 1;
        int placeIndex = nums1.length - 1;
        while(placeIndex >= 0){
            // 当有一个到达末尾超限后，只需要隐式地提供Integer.MIN_VALUE即可
            int temp1 = index1 >= 0 ? nums1[index1] : Integer.MIN_VALUE;
            int temp2 = index2 >= 0 ? nums2[index2] : Integer.MIN_VALUE;
            if(temp1 < temp2){
                // 放置了temp2之后，只需要将index2向左移动一位，index1不需要进行移动
                nums1[placeIndex--] = temp2;
                index2--;
            }else{
                // 放置了temp1之后，只需要将index1向左移动一位，index2不需要进行移动
                nums1[placeIndex--] = temp1;
                index1--;
            }
        }
    }
}

