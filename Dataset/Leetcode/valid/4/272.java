 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = n+m;
        if(totalLength != 0.0){
            int [] resultArr = combineArrays(nums1,nums2);
            if(totalLength % 2 ==0){
                return (resultArr[totalLength/2]+resultArr[totalLength/2-1])/2.0;
            }else{
                return resultArr[totalLength/2];
            }
        }
        return 0.0;
    }

    private int[] combineArrays(int[] nums1, int[] nums2){
        int [] newArr = new int[nums1.length+nums2.length];
        int index1=0,index2=0;
        int newIndex = 0;
        //合并数组
        while(index1<nums1.length && index2<nums2.length) {
            if(nums1[index1] < nums2[index2]){
                newArr[newIndex++] = nums1[index1++];
            }else{
                newArr[newIndex++] = nums2[index2++];
            }
        }
        //合并剩下的nums1
        if(index1 >= nums1.length){
            while(index2<nums2.length){
                newArr[newIndex++] = nums2[index2++];
            }
            // System.arraycopy(nums2, index2, newArr, newIndex, nums2.length-index2);
        }
        //合并剩下的nums2
        if(index2 >= nums2.length){
            while(index1<nums1.length){
                newArr[newIndex++] = nums1[index1++];
            }
            // System.arraycopy(nums1, index1, newArr, newIndex, nums1.length-index1);
        }
        return newArr;
    }
}

