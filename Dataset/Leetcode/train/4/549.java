 class Solution {
        public double XXX(int[] nums1, int[] nums2) {
        int le;
        int num1Index=0;
        int num2Index=0;
        boolean flag=true;
        if(nums1==null && nums2==null){
            return 0;
        }
        if(nums1==null){
            if(nums2.length%2==0){
                return ((double) nums2[nums2.length/2]+(double) nums2[nums2.length/2+1])/2;
            }else{
                return nums2[nums2.length/2+1];
            }
        }
        if(nums2==null){
            if(nums1.length%2==0){
                return ((double) nums1[nums1.length/2]+(double) nums1[nums1.length/2+1])/2;
            }else{
                return nums1[nums1.length/2+1];
            }
        }
        if((nums1.length+nums2.length)%2!=0){
            flag=false;
        }
        le=(nums1.length+nums2.length)/2+1;
        int arr[]=new int[le];
        for (int i=0;i<le;i++){
         if((num2Index>=nums2.length) || (num1Index<nums1.length && nums1[num1Index]<nums2[num2Index])){
             arr[i]=nums1[num1Index];
             num1Index++;
         }else{
             arr[i]=nums2[num2Index];
             num2Index++;
         }
        }
        if(flag){
            return ((double) arr[le-1]+(double) arr[le-2])/2;
        }else {
            return arr[le-1];
        }

    }

    
}

