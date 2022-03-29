 class Solution {
    public String XXX(String s, int numRows) {
        //此处通过面向测试用例编程得来
        if(null == s || "".equals(s) || s.length() == 1 || numRows == 1) return s;
        
        StringBuilder res = new StringBuilder();
        int step = 2 * numRows - 2;
        for(int i=0; i<numRows; i++) {
            int flag = 0;
            int j = i;
            while(j < s.length() ){
                res.append( s.charAt(j) );
                if(i == 0 || i == numRows - 1) j += step;
                else {
                    if(flag % 2 == 0) {
                        j += step - 2 * i;
                    }else {
                        j += 2 * i;
                    }
                    flag += 1;
                }
            }
        }
        return res.toString();
    }
}

