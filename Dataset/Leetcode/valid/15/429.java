 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> arr = new ArrayList<>();
        for(int i:nums)
            arr.add(i);
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum = nums[i] + nums[j];
                if(arr.contains(-sum)&&arr.lastIndexOf(-sum)>j)
                {
                    if(map.get(nums[i])!=null&&map.get(nums[i])==nums[j])
                    {
                        break;
                    }         
                    else
                    {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(-sum);
                        ans.add(temp);
                        map.put(nums[i],nums[j]);
                    }              
                }
            }
        }
        return ans;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


