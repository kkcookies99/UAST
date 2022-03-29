class Solution {
public:
    int XXX(int x) {
        auto s=to_string(x);             //转为字符串
        std::XXX(s.begin(),s.end()); //反转
        try{
            return (x>=0)?stoi(s):-stoi(s); 
        }
        catch(...){  //抛出异常则表明反转后的数溢出，直接返回0即可
            return 0;
        }
    }
};

