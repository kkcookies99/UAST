 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(!strs.size()) return string();
        string prefix = strs[0];
        for (int i = 1; i < strs.size(); ++i)
            if (strs[i].length() < prefix.length())
                prefix = strs[i];   //先找出长度最小的串，前缀一定是长度最小的串的某个前缀
        for (int i = 0; i < prefix.length(); ++i)   //检查长度最下的串的每个字符
        {
            bool flag = true;   //falg=false，表示当前第i个字符不是某个字符串的第i个字符
            for (int j = 0; j < strs.size(); ++j)   //检查所有字符串的第i个字符
                if (strs[j][i] != prefix[i])
                {
                    flag = false;
                    break;
                }
            if (!flag && i == 0) return string();   //如果第一个字符就不匹配，返回空串
            if (!flag && i) return prefix.substr(0, i); //第i个字符开始不匹配，返回长度为i的前缀
        }
        return prefix; //所有字符都匹配，返回整个串
    }
};

