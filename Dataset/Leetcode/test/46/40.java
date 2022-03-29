class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> l=new ArrayList();
        XXX(nums,0,nums.length,l);
        return l;
    }
    private static void XXX(int[] nums,int p,int q,List<List<Integer>> l){
        if(p+1==q){
            ArrayList<Integer> ll=new ArrayList();
            for(int i=0;i<q;i++)
                ll.add(nums[i]);
            l.add(ll);
        }
        for(int i=p;i<q;i++){
            swap(nums,p,i);
            XXX(nums,p+1,q,l);
            swap(nums,p,i);
        }
    }
    static void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}

