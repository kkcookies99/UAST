 class Solution {
public:
    string XXX(string a, string b) {
        string res="";
        int la=a.length(),lb=b.length(),lm=max(la,lb);
        //加前导零对齐
        for(int i=la;i<lm;i++) a="0"+a;
        for(int i=lb;i<lm;i++) b="0"+b;
        //进位
        int carry=0;
        //模拟全加器，分别计算结果和进位值
        for(int i=lm-1;i>=0;i--){
            /*两位是a,b,上一位进位是c0,这一位进位是c,结果是s
            **s=a^b^c0
            **c=a&b|(c0&(a^b))
            */
            char temp=(a[i]-'0')^(b[i]-'0')^(carry)+'0';
            carry=((a[i]-'0')&(b[i]-'0'))|(carry&((a[i]-'0')^(b[i]-'0')));
            res=temp+res;
        }
        //如果算完还有进位，需要补个1
        if(carry==1)
            res="1"+res;
        return res;
    }
};

