 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i=0;i<nums.length-2;i++){
            if(i==0||nums[i]!=nums[i-1]) //去除重复
            for (int j=i+1;j<nums.length-1;j++){
                if(j==i+1||nums[j]!=nums[j-1]) //去除重复
                for (int k=j+1;k<nums.length;k++){
                    if (nums[i]+nums[j]+nums[k]==0){
                        ArrayList<Integer> integers = new ArrayList<>();
                        integers.add(nums[i]);
                        integers.add(nums[j]);
                        integers.add(nums[k]);
                        lists.add(integers);
                        break;
                    }
                }
            }
        }
        return lists;
    }
}

