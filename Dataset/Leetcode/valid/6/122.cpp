 class Solution {
public:
    string XXX(string s, int numRows) {
        if(s.size()<=numRows||numRows==1) return s; //直接返回s的情况
        vector<string> tmp(numRows);    //缓存字符串向量
        string res;                     //结果
        int n=0,flag=-1;                //行控制符和增减控制符
        for(int i=0;i<s.size();i++){    //Z字转换
            tmp[n]+=s[i]; 
            if(n==numRows-1||n==0) flag=-flag;
            n+=flag;
        }
        for(int i=0;i<numRows;i++){     //将Z字转换结果输入到res
            res+=tmp[i];
        }
        return res;
    }
};

