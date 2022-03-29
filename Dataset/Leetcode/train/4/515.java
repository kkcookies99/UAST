     public double XXX(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length + nums2.length];
        int t = 0;
        int i = 0,j = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] <= nums2[j]){
                temp[t++] = nums1[i++];
            }else{
                temp[t++] = nums2[j++];
            }
        }
        while(i<nums1.length){
            temp[t++] = nums1[i++];
        }
        while(j<nums2.length){
            temp[t++] = nums2[j++];
        }
        return temp.length%2 == 0 ? (double)(temp[temp.length/2]+temp[temp.length/2 - 1])/2 : (double)temp[temp.length/2];
    }

