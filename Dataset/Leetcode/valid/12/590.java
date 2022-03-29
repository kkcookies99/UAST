 class Solution {
    public String XXX(int num) {
       int[] roNum = {1000,500,100,50,10,5,1};
        StringBuffer stringBuffer = new StringBuffer();
        int[] countList = new int[7];
        for (int i = 0; i < roNum.length; i++) {
            countList[i] = num / roNum[i];
            num %= roNum[i];
        }
        // 倒序找规律，循环查找
        appendData(stringBuffer, new int[]{countList[5],countList[6]}, new String[]{"X", "V", "I"});
        appendData(stringBuffer, new int[]{countList[3],countList[4]}, new String[]{"C", "L", "X"});
        appendData(stringBuffer, new int[]{countList[1],countList[2]}, new String[]{"M", "D", "C"});
        // 最后M得个数
        appendChar(stringBuffer,countList[0],"M");
        return stringBuffer.reverse().toString();
    }
    /**
     * 每次大于4个时，则移动规则判断
     */
    private void appendData(StringBuffer stringBuffer, int[] counts, String[] resultChars){
        if (counts[1] == 4 && counts[0]== 1) {
            stringBuffer.append(resultChars[0]+resultChars[2]);
        } else if (counts[1] == 4) {
            stringBuffer.append(resultChars[1]+resultChars[2]);
        }else{
            appendChar(stringBuffer,counts[1],resultChars[2]);
            appendChar(stringBuffer,counts[0],resultChars[1]);
        }
    }
    /**
     * 填充自然数
     */
    private void appendChar(StringBuffer sb,int num,String charStr){
        while (num>0){
            sb.append(charStr);
            num--;
        }
    }
}

