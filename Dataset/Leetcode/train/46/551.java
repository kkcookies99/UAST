 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>>list=new ArrayList();
        List<Integer>li=new ArrayList();
        if(nums.length==0)return list;
        Arrays.sort(nums);
        dfs(nums,list,0,li);
        return list;
    }
    public void dfs(int []nums,List<List<Integer>>list,int index
    ,List<Integer>li){
        if(index==nums.length){
            List<Integer>temp=new ArrayList();
            temp.addAll(li);
            list.add(temp);
        }
        else if(index<nums.length){
            for(int i=0;i<nums.length;i++)
            if(!li.contains(nums[i]))
            {
                li.add(nums[i]);
                dfs(nums,list,index+1,li);
                li.remove(li.size()-1);
            }
        }
    }
}

