 /**
 * 我是个假的动态规划解法
 * dp[i]:以当前节点为终点的回文字符串
 * max：dp数组中最长的那个回文字符串
 */
public static String XXX(String s) {
    String dp[] = new String[s.length()];   //定义状态数组
    String max;                             //定义最优选项
    max = dp[0] = s.substring(0, 1);        //定义初值

    for (int i = 1; i <= s.length() - 1; i++) {
        //1. 求得当前节点为尾部的最长回文字符串
        for (int j = 0; j <= i; j++) {

            //1.1 接下来的循环里是求[j -> i]是否是回文串，如果是，就结束
            boolean isPalind = true;
            for (int k = 0; k <= (i - j) / 2; k++) {//折半比对下两端是否符合回文特征
                int start = j + k;
                int end = j + (i - j) - k;
                if (s.charAt(start) != s.charAt(end)) {
                    isPalind = false;
                    break;
                }
            }

            if (isPalind) {
                dp[i] = s.substring(j, i + 1);
            }
            if (dp[i] != null) break;

        }
        //2. 与前一个状态比较，保存当前状态
//            if(dp[i].length()<=dp[i-1].length()){
//                dp[i] = dp[i-1];
//            }
        //3. 更新max值
        max = dp[i].length() >= max.length() ? dp[i] : max;

    }
    return max;
}

