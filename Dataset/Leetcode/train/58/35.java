 class Solution {
    public int XXX(String s) {
        char[] cs = s.toCharArray();
        int i = cs.length - 1;
        //排除空格
        while(i >= 0 && cs[i] == ' '){
            i--;
        }
        //记录最后一个不为空格的下标
        int j = i;
        //为空格时退出
        while(i >= 0 && cs[i] != ' '){
            i--;
        }
        return j - i;
    }
}

