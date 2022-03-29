class Solution {
public:
    string XXX(string a, string b) {
        string c;
        int len=max(a.length(),b.length()),len1=a.length(),len2=b.length();
        if(a.length()!=len)                         //若a短，补成与b等长
            for(int i=0;i<len-len1;i++)
                a='0'+a;
        if(b.length()!=len)                         //若b短，补成与a等长
            for(int i=0;i<len-len2;i++)
                b='0'+b;
        int j=0;                                    //进位
        for(int i=len-1;i>=0;i--){
            int temp=(a[i]-'0')+(b[i]-'0')+j;       //取数相加
            if(temp>=2){                            //大于2则要进位
                c=to_string(temp-2)+c;
                j=1;
            }
            else{                                   
                c=to_string(temp)+c;
                j=0;
            }
        }
        if(j==1) c='1'+c;
        return c;

    }
};

