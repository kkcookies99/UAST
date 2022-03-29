 public String XXX(String s) {
    int n = s.length() ,start = 0, end = 0 ,  i = 0, j = i + 1;
    int ans = 0;
    if (n == 0)
        return s;
    while (i < n && j < n) {
        if (s.charAt(i) == (s.charAt(j))) {     //如果字串是回文
            if (ans < j - i) {
                ans = j - i;
                start = i;
                end = j;
            }
            if (i != 0) {     //如果没有两遍没有到头，继续向两边移一位
                i--;
                j++;
            } else {          //如果到头，则下一轮
                int[] all = nextRound(i,j);
                i = all[0];
                j = all[1];
            }
        } else {              //如果不是回文字符串，则下一轮
            int[] all = nextRound(i,j);
            i = all[0];
            j = all[1];
        }

    }
    return s.substring(start,end + 1);
}

/**
 *    如果起始 j = i + 1  那么以 i 不变 , j = i + 2 开始检测
 *    如果起始 j = i + 2  那么i右移一位，继续从j = i + 1 开始检测;
 */
 public int[] nextRound(int i,int j){
    int x = j - i;
    if (x % 2 == 1) {
        i = (i + j + 1) / 2 - 1;
        j = i + 2;
    } else {
        i = (i + j) / 2;
        j = i + 1;
    }
    return new int[]{i,j};
 }
