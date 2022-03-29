 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int N=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        for(int a=0;a<N-2;++a){
            if(a>0&&nums[a]==nums[a-1])
                continue;
            int target=-nums[a];
            for(int b=a+1;b<N-1;++b){
                if(b>a+1&&nums[b]==nums[b-1])
                    continue;
                int c=N-1;
                while(b<c&&nums[b]+nums[c]>target)
                    --c;
                if(b==c)
                    break;
                if(nums[b]+nums[c]==target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[a]);
                    list.add(nums[b]);
                    list.add(nums[c]);
                    res.add(list);

                }

            }
        }
        return res;

    }
}

