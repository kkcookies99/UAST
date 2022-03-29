class Solution {
public:
    string toString(int num) {//c++有整形转字符型的代码么，不知道只能自己写呜呜呜
        if (num < 0)return "-" + toString(-num);
        if (num == 0)return "0";
        string res;
        char c;
        while (num != 0) {
            c = num % 10 + '0';
            num /= 10;
            res = c + res;
        }
        return res;
    }
    string process(string s){//递归过程函数
        string res;
        int num=1;
        for(int i=0;i<s.size()-1;i++){//扫描字符串
            if(s[i]==s[i+1])num++;//如果相同，次数加一
            else {
                res+=toString(num);//如果不同，打印输出
                res+=s[i];
                num=1;
            }
        }
        res+=toString(num);//打印输出末尾的字符个数，因为for循环最后有一个没输出
        res+=s[s.size()-1];
        return res;
    }
    string XXX(int n) {
        if(n==1)return "1";
        else return process(XXX(n-1));//递归，其实可以把上面的放在下面，但是我偏不嘿嘿嘿
    }
};

