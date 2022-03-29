 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int mid1 = (size1+size2)/2+1;
        int mid2 = ((size1+size2)&1)==0?mid1-1:mid1;
        int index = 0;
        int p1 = 0;
        int p2 = 0;
        int midNum1 = 0;
        int midNum2 = 0;
        double re = 0;
        while(p1<size1||p2<size2){
            int num;
            if(p1==size1){
                num = nums2[p2];
                ++p2;
            }else if(p2==size2){
                num = nums1[p1];
                ++p1;
            }else if(nums1[p1] < nums2[p2]){
                num = nums1[p1];
                ++p1;
            }else{
                num = nums2[p2];
                ++p2;
            }
             
            if(++index==mid2){
                midNum2 = num;
            }
            if(index==mid1){
                midNum1 = num;
                re = (midNum1+midNum2)/2.0;
                break;
            }
        }
        return re;
    }
}

