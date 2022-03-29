 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows==1)
            return s;
        string ret;
        int size = s.size();
        for(int i=0;i<numRows;++i){
            for(int j=0;j*(2*numRows-2)-i<size;++j){
                int t1=j*(2*numRows-2)-i;//第一个数 
                int t2=j*(2*numRows-2)+i;//第二个数
                if(i==0&&t1<size)//第一行只有一个数
                {
                    ret+=s[t1];
                    continue;
                }
                if(t1>0)//第一列的-i不添加
                    ret+=s[t1];
                
                if(t2<size&&i!=numRows-1)//最后一行不需要重复添加
                    ret+=s[t2];
            }
        }
        return ret;
    }
};

