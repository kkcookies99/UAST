 class Solution {
public:
    string XXX(string s, int numRows) {
        string res;
        int firstPoint=0;
        int lastPoint=numRows-1;
        int length = s.size();
        if(numRows==1) return s;//边界条件
        while(firstPoint<length){//第一行的变换
            res+=s[firstPoint];
            firstPoint+=2*(numRows-1);
        }
        for(int i=1;i<numRows-1;i++){//第二行至倒数第二行
            int count=0;int spoint=i;//
            while(spoint<length){
              //  res+=s[spoint];
                if(count%2==1){
                    res+=s[spoint];
                    spoint +=2*i;
                    count++;   
                }else{
                    res+=s[spoint];
                    spoint += 2*(numRows-i-1);
                    count++;  
                }
            }
        }
        while(lastPoint<length){//最后一行的变换
            res+=s[lastPoint];
            lastPoint+=2*(numRows-1);
        }
        return res;
    }
};

