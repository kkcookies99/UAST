class Solution {
public List<List<Integer>> XXX(int[] nums){
        int[] used=new int[nums.length];
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> list_total=new ArrayList<>();
        funcR(nums,used,list,list_total);
        return list_total;
    }
    private void funcR(int[] nums,int[] used,List<Integer> list_in,List<List<Integer>> list_total){
        if (list_in.size()==nums.length) {
            list_total.add(new ArrayList<>(list_in));
            return;
        }

        for(int i=0;i<nums.length;i++) {
            if(used[i]==0) {
                list_in.add(nums[i]);
                used[i]=1;
                funcR(nums,used,list_in,list_total);
                used[i]=0;
                list_in.remove(list_in.size()-1);
            }
        }

    }
}


