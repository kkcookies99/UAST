 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        char [] chrArr = s.toCharArray();
        int len = chrArr.length;
        char [] result = new char[len];
        int curPos = 0;
        for (int i = 0; i < numRows; i++) {
            int delta1=(numRows-i-1)*2,delta2=i*2;
            int pos = i;
            int curDeltaFlag = -1;
            while (true) {
                if(curPos >= len) {
                    break;
                }
                if (curDeltaFlag == -1) {
                    if(pos >= len) {
                        break;
                    }
                    result[curPos++] = chrArr[pos];
                    curDeltaFlag = 1;
                    continue;
                }
                int curDelta;
                if(curDeltaFlag == 1) {
                    if(delta1 != 0) {
                        curDelta = delta1;
                    } else {
                        curDelta = delta2;
                    }
                    curDeltaFlag = 2;
                    pos = pos + curDelta;
                    if(pos >= len) {
                        break;
                    }
                    result[curPos++] = chrArr[pos];
                    continue;
                }
                if(delta2 != 0) {
                    curDelta = delta2;
                } else {
                    curDelta = delta1;
                }
                curDeltaFlag = 1;
                pos = pos + curDelta;
                if(pos >= len) {
                    break;
                }
                result[curPos++] = chrArr[pos];
            }
        }
        return new String(result,0,curPos);
    }
}

