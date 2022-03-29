 class Solution {
    public String XXX(String s) {
        int length = s.length();
        if (null == s || "".equals(s)) return "";
        String sub = s.substring(0, 1);
        StringBuffer buffer = new StringBuffer(s).reverse();
        if (s.equals(buffer.toString())) return s;
        for (int i = length; i > 0; i--) { //截取的字符长度
            for (int j = length; j >=0; j--) {//遍历字符
                if (j + i > length) continue;
                sub = s.substring(j , j + i );
                if (buffer.toString().contains(new StringBuffer(sub))) {
                    return sub;
                }
            }
        }
        return sub;
    }
}

