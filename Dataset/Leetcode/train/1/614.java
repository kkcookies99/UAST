 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
       int left=0;
       int right=nums.length-1;
       int centerL=nums.length/2;
       int centerR=nums.length/2+1;
       while(left<=centerL){
           int lt0=nums[left];
           int rt0=nums[right];
           
           int lt1=target-lt0;
           int rt1=target-rt0;

            if(centerR<right){
                int ctl0=nums[centerL];
                int ctr0=nums[centerR];
                int ctl1=target-ctl0;
                int ctr1=target-ctr0;

                if(map.containsKey(ctr1)){
                    return new int[] {map.get(ctr1),centerR};

                }else {
                    map.put(nums[centerR],centerR++);
                }
                if(map.containsKey(ctl1)){
                    return new int[] {map.get(ctl1),centerL};
                }else {
                    map.put(nums[centerL],centerL--);
                }

            }
           
           if(map.containsKey(lt1)){
               return new int[] {map.get(lt1),left};

           }else {
               map.put(nums[left],left++);
           }
           if(map.containsKey(rt1)){
               return new int[] {map.get(rt1),right};
           }else {
               map.put(nums[right],right--);
           }

           
       }
       return new int[] {};
    }
}

