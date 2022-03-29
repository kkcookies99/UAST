         public int XXX(int[] nums, int target) {
        if(nums==null||nums.length==0)return 0;
        int n=nums.length;
        int l=0;
        int r=n-1;
        int mid=0;
        while(l<=r){
            mid=(r+l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return l;
    }

