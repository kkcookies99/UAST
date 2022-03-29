 class Solution {
public:
    string XXX(string a, string b) {
        //将a、b字符串在前面用0补齐
        int n=a.length(),m=b.length();
        if(n>m)b.insert(0,n-m,'0');
        else if(n<m)a.insert(0,m-n,'0');
        //求和
        string res="";
        n=a.length();
        int carry=0;//表示进位
        for(int i=n-1;i>=0;i--){
            int temp=(int)a[i]+(int)b[i]-48*2+carry;
            if(temp>1){
                carry=1;
                res.insert(0,1,(char)(temp-2+48));
            }else{
                carry=0;
                res.insert(0,1,(char)(temp+48));
            }
        }
        //如果最后还有进位，就要在最前面插入1
        if(carry==1){
            res.insert(0,1,'1');
        }
        return res;
    }
};

