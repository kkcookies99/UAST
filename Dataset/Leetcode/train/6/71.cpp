 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows==1)return s;//边界条件
        string res;
        int index=0,gap=2*numRows-2,len=s.size();
        while(index<len){//读取第一行
            res+=s[index];
            index+=gap;
        }
        for(int i=1;i<numRows-1;i++){//读取中间的行（如果有）
            index=i;
            while(index<len){
                res+=s[index];
                index+=(gap-2*i);
                if(index<len){
                    res+=s[index];
                    index+=2*i;
                }
            }
        }
        index=numRows-1;//读取最后一行
        while(index<len){
            res+=s[index];
            index+=gap;
        }
        return res;
    }
};

