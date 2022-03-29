 class Solution {
    public int XXX(String s) {
        int end=s.length()-1;
        while(end>=0&&s.charAt(end)==' ') end--;//跳过空格
        int start=end;
        while(start>=0&&s.charAt(start)!=' ') start--;//从后往前直到空格即为单词长度
        return end-start;
    }
}```

