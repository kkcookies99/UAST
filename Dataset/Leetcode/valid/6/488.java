 class Solution {
    public String XXX(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        if(numRows == 1) {
            return s;
        }
        
        //按行访问
        for (int i = 0;i < numRows; i++) {
            //以N字形中排成一列的字符（最具有标志性，不容易找错）来找规律，再找其旁边的字符
            for (int j = i; ; j += 2*numRows-2) {
                //这是当前列左边的字符，根据我们找的字符来改下标
                //第一行和最后一行没有相邻字符，所以不需要；每行第一个字符也没有相邻字符；同时再判断是否超出下标
                if (i != 0 && i != numRows-1 && j != i && j - i*2 < s.length()) {
                    sb.append(s.charAt(j - i*2));
                }
                //判断是否出界，否则加入当前列的字符
                if (j < s.length()) {
                    sb.append(s.charAt(j));
                } else {
                    break;
                }
            }
        }
        return sb.toString();
    }
}

