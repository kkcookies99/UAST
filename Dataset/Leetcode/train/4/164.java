 public double XXX(int[] nums1, int[] nums2) {
        int s1Len = nums1.length, s2Len = nums2.length;
        int n1 = 0, n2 = 0;
        int val = 0;
        int[] nums = new int[s1Len + s2Len];
        while(n1 < s1Len || n2 < s2Len){
            if(n1 == s1Len){
                val = nums2[n2++];
            }else if(n2 == s2Len){
                val = nums1[n1++];
            }else if(nums1[n1] < nums2[n2]){
                val = nums1[n1++];
            }else{
                val = nums2[n2++];
            }
            nums[n1 + n2 - 1] = val;
        }
        
        int y = (nums.length - 1) % 2;
        int mid = (nums.length - 1) / 2;
        if(y == 1){
            return (double)(nums[mid] + nums[mid + 1]) / 2;
        }else{
            return nums[mid];
        }
    }

