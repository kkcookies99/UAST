 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        if(m == 0) {
            while(n > 0){
                nums1[n - 1] = nums2[n - 1];
                n--;
            }
            return;
        }
        
        //nums1的最后一个非0数下标
        int pos1 = m - 1;
        //nums2的最后一个数下标
        int pos2 = n - 1;
        //nums1的最右下标
        int i = nums1.length - 1;
        while(pos1 >= 0 && pos2 >= 0){
            //谁大谁往最右边放，下标左1位
            if(nums1[pos1] > nums2[pos2]) nums1[i--] = nums1[pos1--];
            else if(nums1[pos1] < nums2[pos2]) nums1[i--] = nums2[pos2--];
            //相等都往右放，下标左移2位
            else {
                nums1[i--] = nums1[pos1--];
                nums1[i--] = nums2[pos2--];
            }

        }
        //nums1如果有剩下，那么已经形成有效数组了所以不用判断。
        //只有nums2剩下来多的数，才需要移到nums1中。
        while(pos2 >= 0){
            nums1[i--] = nums2[pos2--];
        }
    }
}

