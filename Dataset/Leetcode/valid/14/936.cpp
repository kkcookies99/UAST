 class Solution {
public:
    string XXX(vector<string>& strs) {
        string res;
        if(strs.size()==0)
            return res;
        else if(strs.size()==1)
            return strs[0];
        for(int i=0;i<strs[0].size();i++){//将第一个字符串作为对照序列
            for(int j=1;j<strs.size();j++){//其他字符串逐字符和对照序列对比
                if(i>strs[j].size())//对照序列当前位数超过了该字符串的长度，直接返回res
                    return res;
                if(strs[j][i]!=strs[0][i])//如果strs[0]当前字符与现在这个字符串对应字符不同，直接返回res
                    return res;
            }
            res += strs[0][i];//其余字符串当前字符与strs[0]当前字符相同，则追加到res末尾
        }    
        return res;
    }
};

