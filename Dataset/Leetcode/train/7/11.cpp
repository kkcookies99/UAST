class Solution {
public:
    int XXX(int x) {
        int res;
        // 转字符串
        string itos=to_string(x);
        // 字符串反转
        std::XXX(itos.begin(),itos.end());
        // 溢出捕获异常
        try{
            res=stoi(itos);
        }catch(...){
            res=0;
        }
        if(x<0){
            res=-1*res;
        }
        return res;  
    }
};

