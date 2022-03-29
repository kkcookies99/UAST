 class Solution {
public:
    int XXX(string s) {
        int i=0;//下标
        long res=0;//结果
        bool flag=true;//用flag表示正负号
        //去除前置的空格
        while(i<=s.size()-1){
            if(s[i]==' ')i++;
            else break;
            if(i>s.size()-1)return 0;
        }
        //判断下一个是否为正负号
        if(s[i]=='+'){flag=true;i++;}
        else if(s[i]=='-'){flag=false;i++;}
        if(i>s.size()-1)return 0;
        while(i<=s.size()-1){
            int t=static_cast<int>(s[i])-48;
            if(t>=0&&t<=9){
                //判断是否溢出
                if(flag==true){
                    if((res>214748364)||(res==214748364&&t>7))return 2147483647;
                }
                if(flag==false){
                    if((res>214748364)||(res==214748364&&t>8))return -2147483648;
                }
                res=res*10+t;
                if(i>=s.size()-1)break;
                i++;
            }
            else{
                break;//不是数字就直接break
            }
        }
        if(!flag)res*=-1;
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


