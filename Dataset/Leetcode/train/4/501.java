 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int count = nums1.length + nums2.length;
        //如果两个数组都为空，直接返回0
        if(count == 0){
            return 0.0;
        }
        //如果任意一个数组为空 直接返回中位数
        else if(nums1.length == 0){
             return nums2.length % 2 == 0 ? (double) (nums2[nums2.length / 2 - 1] + nums2[nums2.length / 2]) / 2 : nums2[(int) Math.floor(nums2.length / 2)];
        }
        else if(nums2.length == 0){
            return nums1.length % 2 == 0 ? (double) (nums1[nums1.length / 2 - 1] + nums1[nums1.length / 2]) / 2 : nums1[(int) Math.floor(nums1.length / 2)];
        }
        //储存中位数的位置
        List<Integer> pick = new ArrayList<>();
        if(count % 2 == 0){
            pick.add(count / 2 - 1);
            pick.add(count / 2);
        }
        else {
            pick.add((int) Math.floor(count / 2));
        }
        //当前最小值
        int currMoreSmall = 0;
        //当前计数，等于pick.get(0)时返回
        int currCount = -1;
        //两个数组的索引
        int i = 0,j = 0;
        while(currCount != pick.get(0)){
            //当数组二没超出索引时
            if(j <= nums2.length - 1){
                //且数组一没超出索引
                if(i <= nums1.length - 1){
                    //返回较小的，并且索引值加一
                    if (nums1[i] <= nums2[j]) {
                        currMoreSmall = nums1[i];
                        i++;
                    } else {
                        currMoreSmall = nums2[j];
                        j++;
                    }
                }
                //如果数组一超出了说明没数了，直接返回数组二的值
                else {
                    currMoreSmall = nums2[j];
                    j++;
                }
            }
            //数组二超出时，直接返回数组一的值
            else {
                currMoreSmall = nums1[i];
                i++;
            }
            currCount++;
        }
        if(pick.size() == 1){
            return currMoreSmall;
        }
        else {
            int numsVal = i > nums1.length - 1 ? nums2[j] : nums1[i];
            int nums2Val = j > nums2.length - 1 ? nums1[i] : nums2[j];
            int realNext = Math.min(numsVal, nums2Val);
            return ((double) (realNext + currMoreSmall) / 2);
        }
    }
}

