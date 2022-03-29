 class Solution {
    public String XXX(String s, int numRows) {
        //注意点
        //(numRows- 1) * 2步幅为一个竖提循环，此循环末尾不到顶
        //第一行和最后一行为(numRows- 1) * 2步幅一循环，中间为双循环，当步幅为0则代表为(numRows- 1) * 2
        //中间第一次步幅：(numRows- 1) * 2 - (行数*2)步幅一循环
        //中间第二次步幅：(numRows- 1) * 2 - 第一次步幅
        //下个循环的第三次步幅则(numRows- 1) * 2 - 第二次步幅即可
        StringBuilder rs = new StringBuilder();
        char[] chars = s.toCharArray();
        int loopNum = (numRows - 1) * 2;            //循环跨度步幅
        if ((s.length() < numRows) || numRows == 1) {
            rs.append(s);
        } else {
            for (int i = 0; i < numRows; i++) {
                rs.append(chars[i]);
                int strideDiff = (loopNum - 2 * i) == 0 ? loopNum : (loopNum - 2 * i);    //执行步幅
                int end = i;           //当前位置
                while (end + strideDiff < chars.length) {
                    rs.append(chars[end + strideDiff]);
                    end = end + strideDiff;             //更新位置
                    strideDiff = (loopNum - strideDiff) == 0 ? loopNum : (loopNum - strideDiff);     //更新步幅
                }
            }
        }
        return rs.toString();
    }
}

