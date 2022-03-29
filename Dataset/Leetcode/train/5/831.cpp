 class Solution {
public:

    string XXX(string s) {
        int n = s.length(), maxL = 0;
        string ans;
        for (int center = 0; center < n; ++center)  //枚举中心点的位置
        {
            //中心点是一个字符，即回文串的长度是奇数的情况，比如aba
            for (int len = 0; len < n; ++len)   //枚举回文串的半径
            {
                int l = center - len;   //计算在当前半径下，左边的字符
                int r = center + len;   //计算在当前半径下，右边的字符
                if (l >= 0 && r < n && s[l] == s[r])    //如果当前半径合法且字符相同，则可以继续扩展
                {
                    if (r - l + 1 > maxL)   //更新答案
                    {
                        maxL = r - l + 1;
                        ans = s.substr(l, maxL);
                    }
                }
                else break; //否则结束，即以当前中心能扩展的半径最长就这么长了
            }

            //中心点不是一个字符，即回文串的长度是偶数的情况，比如aa
            for (int len = 1; len < n; ++len)   //枚举回文串半径
            {
                int l = center - len;       //计算当前半径下，左边的字符
                int r = center + len - 1;   //计算当前半径下，右边的字符
                if (l >= 0 && r < n && s[l] == s[r])    //如果当前半径合法且字符相同，则可以继续扩展
                {
                    if (r - l + 1 > maxL)   //更新答案
                    {
                        maxL = r - l + 1;
                        ans = s.substr(l, maxL);
                    }
                }
                else break; //否则结束，即以当前中心能扩展的半径最长就这么长了
            }
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


