 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int tag1 = 0;
        int tag2 = 0;
        double center = 0.00000;
        while(tag1 < nums1.length || tag2 < nums2.length){
            int count = 0;
            if(tag1 >= nums1.length){
                count = nums2[tag2++];
            }else if(tag2 >= nums2.length){
                count = nums1[tag1++];
            }else{
                count = (nums1[tag1] <= nums2[tag2]?nums1[tag1++]:nums2[tag2++]);
            }
            if(tag1 + tag2 - 1 == (nums1.length + nums2.length - 1)/2){
                center += count;
            }
            if(tag1 + tag2 - 1 == (nums1.length + nums2.length)/2){
                center += count;
                break;
            }
        }
        return center/2.00000;
    }
}

