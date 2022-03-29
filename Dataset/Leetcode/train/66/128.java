 class Solution {
    public int[] XXX(int[] digits) {
        List<Integer> res = new ArrayList<>();
        int c = 1;
        for(int i = digits.length-1;i>=0;i--){
            int temp = digits[i]+c;
            if(temp>9){
                c = 1;
                temp = 0;
            }else
                c = 0;
            res.add(temp);
        }
        if(c == 1)
            res.add(1);
        int[] ans = new int[digits.length+c];
        int j = 0;
        for(int i = res.size()-1;i>=0;i--)
            ans[i] = res.get(j++);
        return ans;
    }
}

