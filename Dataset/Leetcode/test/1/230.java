 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] sortnums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortnums);
        int l=0;
        int r= nums.length-1;
        boolean find =false;
        while(l<r){
            int sum = sortnums[l] + sortnums[r];
            if(sum == target){
                find =true;
                break;
            }else if(sum <target){
                l = binarySearch(sortnums, l+1, r, target-sortnums[r]);
            }else{
                r = binarySearch(sortnums, l, r-1, target-sortnums[l]);
            }
        }

        if(!find){
            return new int[0];
        }

        int[] res = new int[2];
        boolean f1=false,f2=false;
        for(int i =0 ; i<nums.length;i++){
           if(f1 && f2){
              break;   
            }
            if(!f1 && sortnums[l] == nums[i]){
                res[0]=i;
                f1=true;
                continue;
            }
            if(!f2 && sortnums[r] == nums[i]){
                res[1]=i;
                f2=true;
            }
            
        }
        return res;       
    }


    private int binarySearch(int[] arr, int low, int high, int target) {
        while(low < high) {
            int center = (low + high) / 2;
            if(target == arr[center]) {
                return center;
            }
            else if(target < arr[center]) {
                high = center - 1;
            }
            else {
                low = center + 1;
            }
        }
        return low;
    }
}

