 class Solution {
    public String XXX(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows <= 1) {
            //只有一行的情况特殊处理
            return s;
        }
        StringBuilder builder = new StringBuilder();
        //遍历的步长
        int step = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            //首尾两个位置只有一个方向的遍历，需要特殊处理
            if (i == 0 || i == numRows - 1) {
                recordChars(s, i, s.length(), step, builder);
            } else {
                //中间位置有两个方向的遍历，两个方向的起始位置不同，但是步长是一样的
                //根据规律可得
                //第一个方向的位置是 i，i+step，i+step*2 ...
                //第二个方向的位置是 2n-i-2，2n-i-2+step，2n-i-2+step*2 ...
                recordChars(s, i, 2 * numRows - i - 2, step, builder);
            }
        }
        return builder.toString();
    }
    //这个方法用来记录，从起始位置按照指定的步长遍历完字符串得到的字符，由于 firstIndex 永远小于 secondIndex，所以能得到正确顺序
    private void recordChars(String s, int firstIndex, int secondIndex, int step, StringBuilder builder) {
        while (firstIndex < s.length() || secondIndex < s.length()) {
            if (firstIndex < s.length()) {
                builder.append(s.charAt(firstIndex));
                firstIndex += step;
            }
            if (secondIndex < s.length()) {
                builder.append(s.charAt(secondIndex));
                secondIndex += step;
            }
        }
    }
}```

