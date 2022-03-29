 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        boolean odd = true;
        if(length % 2 == 0){
            odd = false;
        }
        int[] array = new int[length/2 + 1];

        int i=0,j=0,index=0;
        for(index=0; index<length/2 + 1; index++){
            if(i==nums1.length){
                array[index] = nums2[j++];
            }else if(j==nums2.length){
                array[index] = nums1[i++];
            }else if(nums1[i]<nums2[j]){
                array[index] = nums1[i++];
            }else{
                array[index] = nums2[j++];
            }
        }

        if(odd){
            return array[--index];
        }else{
            return (array[--index] + array[--index])/2.0;
        }

    }
}

