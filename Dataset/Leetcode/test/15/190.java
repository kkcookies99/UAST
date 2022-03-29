 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int len = nums.length;
        List<List<Integer>> list =new ArrayList<List<Integer>>();
        if(len<3) return list;
        Arrays.sort(nums);
        int f=0;
        while(f<len-2){
            if(nums[f]+nums[f+1]>0) break;
            int temp1=0-nums[f];
            int m = f+1;
            int k = len-1;
            int se = 0x7ffffff;
            while(m<k){
                if(se==nums[m]){
                    m++;
                    continue;
                }
                if(temp1<nums[m]+nums[k]){
                    k--;
                }
                else if(temp1>nums[m]+nums[k]){
                    m++;
                }
                else {
                    List<Integer> l =new ArrayList<Integer>();
                    l.add(nums[f]);
                    l.add(nums[m]);
                    l.add(nums[k]);
                    list.add(l);
                    se=nums[m];
                    m++;
                    k--;
                }
            }
            do{
                f++;
            }
            while(nums[f-1]>=nums[f]&&f<len-2);
        }
        return list;
    }
}


