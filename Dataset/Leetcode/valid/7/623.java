 class Solution {
    public int XXX(int x) {
        if(x == 0) return 0;
        char[] c = String.valueOf(x).toCharArray();
        StringBuilder ans = new StringBuilder();
        //记录最后一个值是否为负号,如果是，忽略最后一个负号
        int count = 0;
        if(c[0] == '-') count = 1;
        for(int i = c.length-1;i >= count;i--){
            if(c[i] == '0' && ans.length() == 0) continue;
            ans.append(String.valueOf(c[i]));
        }
        //判断结果是否大于Integer的最大值，小于最小值
        long strs = Long.valueOf(ans.toString());
        if(strs > Integer.MAX_VALUE || strs < Integer.MIN_VALUE){
            return 0;
        }
        return count == 1 ? 0-(int)strs : (int)strs;
    }
}

