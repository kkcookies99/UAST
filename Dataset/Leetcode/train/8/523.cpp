 class Solution {
public:
    int XXX(string s) {
        int n=s.size();
        int i=0,sign=0;
        while(i<n){             //去空格
            if(s[i]==' ') i++;
            else break;
        }
        if(s[i]=='-'){          //判断正负
            sign=1;
            i++;
        }else if(s[i]=='+'){
            i++;
        }
        while(i<n){             //去除前导0
            if(s[i]=='0') i++;
            else break;
        }
        if(!isdigit(s[i])) return 0;
        int k=i;
        while(i<n){
            if(isdigit(s[i])) i++;
            else break;
        }
        if(i-k>10 || i-k==10 && s[k]>'2'){
            if(sign==1) return -2147483648;
            else return 2147483647;
        }
        long a=(s[k]-'0')*pow(10,i-k-1);
        k++;
        long b=0;
        while(k<i){
            b+=(s[k]-'0')*pow(10,i-k-1);
            k++;
        }
        if(sign==1){
            if(a+b>=2147483648) return -2147483648;
            else return -a-b;
        }else{
            if(a+b>=2147483647) return 2147483647;
            else return a+b;
        }
    }
};

