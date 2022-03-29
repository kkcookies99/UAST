class Solution {
public:
    int XXX(string s) {
        int index=0,res=0;
        bool neg=false;
        while(s[index]==' ')index++;//去掉前导空格
        if(s[index]=='+')index++;//读取正负号
        else if(s[index]=='-'){
            neg=true;
            index++;
        }
        while(s[index]>='0'&&s[index]<='9'){//读取数字
            if(res<214748364){
                res=res*10+(s[index++]-'0');
            }else if(res==214748364){
                if(neg){
                    if(s[index]<'8')res=res*10+(s[index++]-'0');
                    else return INT_MIN;
                }else{
                    if(s[index]<'8')res=res*10+(s[index++]-'0');
                    else return INT_MAX;
                }
            }else return neg?INT_MIN:INT_MAX;
        }
        return neg?-res:res;
    }
};

