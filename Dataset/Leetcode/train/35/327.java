  public int XXX(int[] nums, int target) {
        int begin=0;
        int end=nums.length-1;
        int mid=0;
        while(begin<=end){
            mid=begin+(end-begin)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                begin=mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }
        }
        return end+1;
    }

