 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();
        int length=nums.length;
        for(int i=0;i<length-2;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int a=nums[i];
            int j=i+1;
            int k=length-1;
            while(j<k){
                int b=nums[j];
                int c=nums[k];
                if(a+b+c>0){
                    k--;
                }else if(a+b+c<0){
                    j++;
                }else {
                    ArrayList<Integer> temp=new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            set.add(temp);
                    j++;
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
``
去重交给Set
