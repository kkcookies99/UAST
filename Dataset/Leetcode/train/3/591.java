 class Solution {
    public int XXX(String s) {
        int begin = 0;
        int end = 0;
        int maxLength = 0;
        int tmp = 0;
        char[] charArr = s.toCharArray();
        for (;end < s.length();) {
            int repeatIndex = lastRepeatIndex(charArr,begin,end);
            // 与前面存在重复
            if (repeatIndex != -1) {
                begin++;
                tmp = end - begin;
            }else{
                tmp++;
                end++;
            }
            maxLength = maxLength > tmp ? maxLength : tmp;
        }
        return maxLength;
    }

    /** 返回最后一个字符与前面有重复的索引 */
    int lastRepeatIndex(char []charArr,int start, int end) {
        char c = charArr[end];
        for (int i = start; i < end; i++) {
            if (charArr[i] == c)
                return i;
        }
        return -1;
    }
}

