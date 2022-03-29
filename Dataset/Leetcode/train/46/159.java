class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        find(list,nums, 0, nums.length - 1);
        return list;
    }
    public List<Integer> set(int[] nums){
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        return list;
    }
    public void swap(int[] nums,int L,int R){
        int tmp=nums[L];
        nums[L]=nums[R];
        nums[R]=tmp;
        return;
    }
     public void find(List<List<Integer>> list,int[] nums,int L,int R){
        if(L==R){//只有一位的时候，直接set
            list.add(set(nums));
        }else{
            for (int i = L; i <= R; i++) {
                swap(nums,L, i);//将第i个数放到第一位固定，然后去排后面的，这样就不用使用hash表来保存使用了多少数字，以及哪些数字没有使用了
                int[] nums_tmp=nums.clone();
                find(list,nums_tmp, L + 1, R);
            }
        }
         return;
    }
}

