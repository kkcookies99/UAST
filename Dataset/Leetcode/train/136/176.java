 class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> Hashset=new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            Hashset.add(nums[i]);
        }
        for(int i: Hashset ){
            count+=i;
        }
        count*=2;
        for(int i=0;i<nums.length;i++)
        {
            count-=nums[i];
        }
        return count;
    }
}

