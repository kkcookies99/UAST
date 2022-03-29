class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length<2) return true;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0 && i != nums.length-1) list.add(i);
        }
        for(int i : list){
            int j = i-1;
            boolean flag = true;
            while(j>=0){
                if(nums[j] > i-j){
                    flag = false;
                    break;
                }
                j--;
            }
            if(flag) return false;
        }
        return true;
    }
}

