 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        quickSort(nums,0,nums.length-1);
        List<List<Integer>> ans = new ArrayList<>();
        int N = nums.length;
        if(nums==null||N<3) return ans;
        for(int i=0;i<N;){
            int p=i+1,q=N-1;
            while(p<q){
                if(nums[i]+nums[p]+nums[q]==0){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[p]);
                    list.add(nums[q]);
                    ans.add(list);
                    do{p++;}while(p<q&&nums[p]==nums[p-1]);
                    do{q--;}while(p<q&&nums[q]==nums[q+1]);
                    continue;
                }else if(nums[i]+nums[p]+nums[q]>0) 
                do{q--;}while(p<q&&nums[q]==nums[q+1]);
                else do{p++;}while(p<q&&nums[p]==nums[p-1]);
            }
            do{i++;}while(i<N&&nums[i]==nums[i-1]);
        }
        return ans;
    }

    public void quickSort(int[] nums,int lo,int hi){
        if(lo>=hi) return;
        int i=lo,j=hi;
        while(i<j){
            while(i<j&&nums[j]>=nums[lo]) j--;
            while(i<j&&nums[i]<nums[lo]) i++;
            exch(nums,i,j);
        }
        quickSort(nums,lo,i);
        quickSort(nums,i+1,hi);
    }

    public void exch(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

