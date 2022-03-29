 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int flag = length % 2;
        int mix = length/2+1;
        double res = 0.0;
        int index1 = 0;
        int index2 = 0;
        int cache1 = 0;
        int cache2 = 0;
        for(int i = 0;i < mix;i++){
            cache1 = cache2;
            if(index1<nums1.length && index2<nums2.length){
                if(nums1[index1]<=nums2[index2]){
                    cache2 = nums1[index1];
                    index1++;
                }else{
                    cache2 = nums2[index2];
                    index2++;
                }
            }else if(index1<nums1.length){
                cache2 = nums1[index1];
                index1++;
            }else if(index2<nums2.length){
                cache2 = nums2[index2];
                index2++;
            }
        }
        if(flag == 1){
            res = cache2;
        }else {
            res = (cache1+cache2)/2.0;
        }

        return res;
    }
}

