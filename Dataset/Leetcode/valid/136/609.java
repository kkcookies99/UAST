 class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int numsSum=0;
        int setSum=0;
        Set s=new HashSet();

        for(int i=0;i<n;i++){
            numsSum+=nums[i];
            s.add(nums[i]);
        }

        List list=new ArrayList(s);
        for(int i=0;i<list.size();i++){
            setSum+=(int)list.get(i);
        }

        return 2*setSum-numsSum;
    }
}

