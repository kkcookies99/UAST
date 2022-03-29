 class Solution {
    public String XXX(String s) {
        // 最长回文子串 : 马拉车算法
        if(s.length() < 2) return s;
        // 字符串预处理，加入前后缀、分隔符
        StringBuilder sb = new StringBuilder();
        sb.append("$"); // 前缀，防止索引越界
        for (char letter : s.toCharArray()) {
            sb.append("#").append(letter);
        }
        sb.append("#@"); // 后缀，防止索引越界
        char[] chars = sb.toString().toCharArray();
        int n = chars.length;
        int[] len = new int[n]; // 辅助数组，用于记录以当前索引元素为中心的最大回文半径
        int index = 0, right = -1; // 最右回文串的中心索引，右边界
        int maxIndex = 0, maxLength = -1; // 最长回文串的中心索引，长度 length = len[i] - 1
        for (int i = 1; i < n - 1; i++) {
            // 根据回文串的对称性，设置回文半径的初始值
            if(i < right) len[i] = Math.min(right - i, len[2 * index - i]);
            else len[i] = 1;
            // 在当前的基础上继续向两边扩充回文半径
            while (chars[i + len[i]] == chars[i - len[i]]) {
                len[i]++;
            }
            // 更新最右边界
            if(i + len[i] > right){
                index = i;
                right = i + len[i];
            }
            // 更新最长回文串
            if(len[i] - 1 > maxLength){
                maxIndex = i;
                maxLength = len[i] - 1;
            }
        }
        // 获取最长回文子串在原字符串上的起点
        int startIndex = (maxIndex - len[maxIndex]) / 2;
        return s.substring(startIndex, startIndex + maxLength);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

