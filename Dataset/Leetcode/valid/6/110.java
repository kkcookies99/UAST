 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        int space = (numRows - 1) * 2;
        
        char[] chars = s.toCharArray();
        char[] newchars = new char[chars.length];

        int i = 0;
        for(int row = 1; row <= numRows; row++) {
                int start = row - 1;
                int start2 = 2 * numRows - row - 1;
                while(start < chars.length) {
                    newchars[i] = chars[start];
                    start += space;
                    i++;
                    if(row != 1 && row != numRows) {
                        if(start2 < chars.length) {
                            newchars[i] = chars[start2];
                            start2 += space;
                            i++;
                        }
                    }
                }
        }
        return new String(newchars);
    }
}

