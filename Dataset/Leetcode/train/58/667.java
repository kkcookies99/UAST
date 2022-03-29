 class Solution {
    public int XXX(String s) {
        int n = s.length() - 1;
        int result = 0;
        char ch;

        // 除去末尾的 ' '
        while (n >= 0 && (ch = s.charAt(n)) == ' ') {
            n--;
        }
        // 倒着遍历最后一个单词, 以碰到第一个 ' ' 或 n < 0 来判断是否停止
        while (n >= 0 && (ch = s.charAt(n)) != ' ') {
            result++;
            n--;
        }
        
        return result;
        
    }
} 

