 class Solution {
    public String XXX(String[] strs) {
        
        int len = strs.length;
        int minLen = 10000;
        char[][] t = new char[len][];
        for (int i = 0; i < len; i++) {
            t[i] = strs[i].toCharArray();
            if(strs[i].length() < minLen){
                minLen = strs[i].length();
            }
        }
        int i,j;
        
        loop:
        for (i = 0; i < minLen; i++) {//列
            for (j = 0; j < len-1; j++) {//行
                if(t[j][i] != t[j+1][i]){//固定列，每两行比较
                    break loop;
                }
            }
        }
        
        return strs[0].substring(0,i);
    }
}
/*
如：["flower","flow","flight"]
f l o w e r
f l o w
f l i g h t
*/

