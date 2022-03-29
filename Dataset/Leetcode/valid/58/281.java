 class Solution {
    public int XXX(String s) {
//首先去除尾部的空格，逆序遍历计数返回
        s=s.trim();
        int last = s.length()-1;
        int count=0;
        while(last>=0&&s.charAt(last)!=' '){
            count++;
            last--;            
        }
        return count;
    }
}```

