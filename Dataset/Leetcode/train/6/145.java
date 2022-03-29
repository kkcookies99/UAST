 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1)
            return s;
        char[] sCharArray = s.toCharArray();
        StringBuilder result = new StringBuilder();
        StringBuilder[] sbs = new StringBuilder[numRows];
        for(int i = 0; i < numRows; ++i)
            sbs[i] = new StringBuilder();
        int pos = 0;
        boolean forward = true;
        for(int i = 0; i < sCharArray.length; ++i) {
            sbs[pos].append(sCharArray[i]);
            if(forward) {
                if(pos == numRows - 1) {
                    forward = false;
                    pos--;
                } else
                    pos++;
            } else {
                if(pos == 0) {
                    forward = true;
                    pos++;
                } else
                    pos--;
            }
        }
        for(StringBuilder sb : sbs)
            result.append(sb);
        return result.toString();
    }
}

