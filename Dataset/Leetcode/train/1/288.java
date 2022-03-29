 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(map.get(x)!=null){
                arr[1]=i;
                arr[0]=map.get(nums[i]);
                return arr;
            }else{
                map.put((target-x), i);
            }
        }
        return null;
    }
}

