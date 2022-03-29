 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows==1 || numRows>=s.length())
            return s;
        string res = s;
        int T = 2*(numRows-1), k = 0;           //T就是一个周期的长度
        for(int i = 0; i<numRows; ++i){         //逐层写入
            for(int j = 0; j<s.length(); ++j){  //看情况，每个周期中各层写一个或两个
                if(j*T+i < s.length())          //小心越界
                    res[k++] = s[j*T+i];
                else 
                    break;
                if(i>0 && i<numRows-1)  
                    if((j+1)*T-i < s.length())  //小心越界
                        res[k++] = s[(j+1)*T-i];
                    else
                        break; 
            }
        }
        return res;
    }
};

