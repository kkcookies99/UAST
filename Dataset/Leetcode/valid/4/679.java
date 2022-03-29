 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int mid = (nums1.length+nums2.length)/2;

        int left1 = 0;
        int left2 = 0;
        int count = 0;
        int midNum = 0;

        while(left1 < nums1.length && left2 < nums2.length){
            while(left1 < nums1.length && left2 < nums2.length && nums1[left1] <= nums2[left2]){
                //长度偶数
                if(count == mid - 1 && (nums1.length+nums2.length)%2 == 0){
                    midNum = nums1[left1];
                } 
                if(count == mid && (nums1.length+nums2.length)%2 == 0 ){
                    return (midNum + nums1[left1])/2.0;
                }
                //长度奇数
                if(count == mid && (nums1.length+nums2.length)%2 != 0 ){
                    return nums1[left1];
                }
                left1++;
                count++;
            }
            while(left1 < nums1.length && left2 < nums2.length && nums1[left1] > nums2[left2]){
                //长度偶数
                if(count == mid - 1 && (nums1.length+nums2.length)%2 == 0){
                    midNum = nums2[left2];
                }
                if(count == mid && (nums1.length+nums2.length)%2 == 0 ){
                    return (midNum + nums2[left2])/2.0;
                }
                //长度奇数
                if(count == mid && (nums1.length+nums2.length)%2 != 0 ){
                    return nums2[left2];
                }
                left2++;
                count++;
            }
        }
        //存在其中一个数组没有遍历完
        if(left1 >= nums1.length){
            while(left2 < nums2.length){
                //长度偶数
                if(count == mid - 1 && (nums1.length+nums2.length)%2 == 0){
                    midNum = nums2[left2];
                }
                if(count == mid && (nums1.length+nums2.length)%2 == 0 ){
                    return (midNum + nums2[left2])/2.0;
                }
                //长度奇数
                if(count == mid && (nums1.length+nums2.length)%2 != 0 ){
                    return nums2[left2];
                }
                left2++;
                count++;
            }
        }
        if(left2 >= nums2.length){
            while(left1 < nums1.length){
                //长度偶数
                if(count == mid - 1 && (nums1.length+nums2.length)%2 == 0){
                    midNum = nums1[left1];
                }
                if(count == mid && (nums1.length+nums2.length)%2 == 0 ){
                    return (midNum + nums1[left1])/2.0;
                }
                //长度奇数
                if(count == mid && (nums1.length+nums2.length)%2 != 0 ){
                    return nums1[left1];
                }
                left1++;
                count++;
            }
        }
        return -1;
    }
}

