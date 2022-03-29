 class Solution {
public:
    string XXX(string s) {
        if (s.size() <= 1)
            return s;
        //dp，判断[i,j]是否是回文串
        vector<vector<bool>> dp(s.size(), vector<bool>(s.size(), false));
       //单字符串必为回文串
        for (int i = 0;i < s.size();i++) 
            dp[i][i] = true;
        //begin定义为回文串起始下标，len为回文串长度
        int begin = 0, len = 1;
        //i为需要判断的回文串长度，最长为整个串，最小为2，j为需要遍历的
        //回文串下表。
        for (int i = 2; i < s.size()+1; i++) {
            for (int j = 0; i+j-1 < s.size(); j++) {//[j,j+i)
                if (i == 2)
                    //长度为2，判断两个字符是否相同
                    dp[j][j+i-1] = (s[j] == s[j+i-1]);
                else {
                   //否则判断两头是否相同，中间是否是回文串
                    dp[j][j+i-1] = (s[j] == s[j+i-1]) && dp[j+1][j+i-2];
                }
              //如果dp[i][j+i-1]是回文串，则记录长度和下标，注意，
             //i是从小到大增长的，所以，最后一次执行这个if必然是最长的
                if (dp[j][j+i-1]) {
                    begin = j;
                    len = i;
                }
            }
        }
        //通过substr截取，整个函数值截取了一次，其他都是通过记录长度和下标不断迭代。
        return s.substr(begin, len);
    }
};

