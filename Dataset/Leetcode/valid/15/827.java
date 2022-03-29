     class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int ds=0;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                ds=nums[i]+nums[j];
                for (int k = j+1; k < nums.length; k++) {
                    if(-ds==nums[k]){
                        if(panduan(nums[i],nums[j],nums[k],list)) {
                            list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        }
                    }
                }
            }
        }
        return list;
    }

    boolean panduan(int a, int b, int c, List<List<Integer>> list){
       if(list.contains(Arrays.asList(a,b,c))||list.contains(Arrays.asList(a,c,b))||
               list.contains(Arrays.asList(b,a,c))||list.contains(Arrays.asList(b,c,a))||
               list.contains(Arrays.asList(c,a,b))||list.contains(Arrays.asList(c,b,a))){
           return false;
       }else{
           return true;
       }
    }
}

