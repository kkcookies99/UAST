 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int n = 1 << nums.length;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            List<Integer> t = new ArrayList<Integer>();
            int j=0;
            for(int k=0;k<n;k++)temp[k]=0;
            int x = i;
            while(x>0){
                temp[j++] = x % 2;
                x /= 2;
            }
            for(int k=0;k<n;k++)
                if(temp[k] > 0)t.add(nums[k]);
            result.add(t);
        }
        return result;
    }
}

