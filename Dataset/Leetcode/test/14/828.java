 class Solution {
    public String XXX(String[] strs) {
        //排序后，比较第一个和最后一个
        int n = strs.length;
        Arrays.sort(strs);
        String s = strs[n-1];
        //如果第一个不以最后一个为前缀，那么最后一个长度减一
        while(!strs[0].startsWith(s)){
            s=s.substring(0,s.length()-1);
        }
        return s;
    }
}

