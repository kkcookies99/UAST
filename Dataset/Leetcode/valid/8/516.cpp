 class Solution {
public:
    int XXX(string s) {
        if(s=="") return 0;
        int num=0;//转换得到的数值
        s.erase(0,s.find_first_not_of(' '));//删除前导空格

        int flag=0;//0 +，1 -
        if(s[0]=='-'||s[0]=='+'){ //对正负号进行处理
           if(s[0]=='-') flag = 1;
            s.erase(0,1);
        }
        if(s[0]<'0'||s[0]>'9') return 0;
        
        s.erase(0,s.find_first_not_of('0'));//删除字符串数值部分最前面的零元素
        int i=0;
        while(i<s.size()){
            if(s[i]<'0'||s[i]>'9') break;
            if(num>INT_MAX/10||(num==INT_MAX/10&&(s[i]-'0'>7))) {
                if(flag==1) {
                    num=INT_MIN;
                }
                else{
                    num=INT_MAX;
                }
                return num;
            } 
            num = num*10+(s[i]-'0');
            i++;
        }
        return flag==0?num:-num;
    }
};

