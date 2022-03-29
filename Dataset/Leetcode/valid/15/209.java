 class Solution {
    private List<List<Integer>> list=new LinkedList<>();

    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> tmp=new LinkedList<>();
        int length=nums.length;

        Arrays.sort(nums);
        for(int i=0;i<length-2;i++){
            tmp=XXX(nums,-(nums[i]),i+1);
            // System.out.println(tmp);
            if(tmp.size()==0)   continue;
            for(List<Integer> a:tmp){
                a.add(nums[i]);
                list.add(a);
            }
            while(i<length-2 && nums[i]==nums[i+1]) i++;
        }
        return list;


    }

    //计算两数之和
    private List<List<Integer>> XXX(int[] nums,int target,int start){
        int length=nums.length;
        int end=length-1;
        List<List<Integer>> ans=new LinkedList<>();
        while(start<end){
            int tmp_start=nums[start];
            int tmp_end=nums[end];
            if((nums[start]+nums[end])==target){
                List<Integer> tmp=new LinkedList<>();
                tmp.add(nums[start]);
                tmp.add(nums[end]);
                // System.out.println("start: "+start+"end: "+end);
                ans.add(tmp);
                while(start<end && nums[start]==tmp_start)    start++;
                while(start<end && nums[end]==tmp_end)    end--;
            }
            else if((nums[start]+nums[end])<target){
                while(start<end && nums[start]==tmp_start)  start++;
            }
            else{
                while(start<end && nums[end]==tmp_end)    end--;
            }
        }
        return ans;
    }
}

