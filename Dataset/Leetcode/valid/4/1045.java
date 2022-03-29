 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int[] newArr = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,newArr,0,nums1.length);
        System.arraycopy(nums2,0,newArr,nums1.length,nums2.length);
        Arrays.sort(newArr);
        //System.out.println("newArr:"+Arrays.toString(newArr));
        int middle = newArr.length/2;
        if(newArr.length%2 != 0){
            return newArr[middle];
        }else{
            double res = (double)(newArr[middle] + newArr[middle-1])/2;
            return res;
        }
    }
}

