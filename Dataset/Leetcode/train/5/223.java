 class Solution {
    // 中心扩展法：
    // 每一个位置的字母都有可能是回文串的中心轴， 有三种可能：单轴/双轴左部/双轴右部
    // 例如：
    // aba   此时的 b 就是作为单轴
    // cbbc  此时的 bb 就是作为双轴, 对每一个 b 细分， 就是第一个 b 就是双轴左部，第二个 b 就是双轴右部了
    // 综合考虑一下, 发现双轴左/右只需要考虑到一个就可以
    // 所以这里只考虑了作为单轴和作为双轴右部
    private String max = "";
    public String XXX(String s) {
        for(int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            find(s, i - 1, i + 1);
            if(i != 0 && c == s.charAt(i - 1)) { // 第一个字符不作为双轴右部
                find(s, i - 2, i + 1);
            }
        }
        
        return max;
    }
    
    private void find(String s, int i, int j) {
        for(; i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j); i-- , j ++);
        if(j - i - 1 > max.length()) max = s.substring(i + 1, j);
    }
}

