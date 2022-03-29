 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
       List<List<Integer>> a = new ArrayList<List<Integer>>();
       List<String> c = new ArrayList();
        for(int i = 0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        Integer XXX = i+k+j;
                        if(!c.contains(XXX.toString())){
                            c.add(XXX.toString());
                             List<Integer> b = new ArrayList();
                                b.add(nums[i]);
                                b.add(nums[j]);
                                b.add(nums[k]);
                                a.add(b);
                        }
                       
                    }
                }
            }
        }
        return a;
    }
}

