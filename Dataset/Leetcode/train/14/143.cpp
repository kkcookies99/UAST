 class Solution {
public:
    string XXX(vector<string>& strs) {
        string strtemp=strs[0];
        string tmp="";
        for(int i = 1 ; i< strs.size();i++){//字符串元素索引指针
            for(int j = 0;j<strtemp.size();j++){//字符索引指针
                if(strs[i][j]==strtemp[j]) 
                    tmp.push_back(strs[i][j]);
                else break; //遇到不匹配就终止循环
            }
            strtemp = tmp;
            tmp = "";
        }
        return strtemp;
    }
};

