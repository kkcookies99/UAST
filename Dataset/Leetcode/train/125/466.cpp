 class Solution {
public:
    static char op(char ch)
    {
        if(ch>='A'&&ch<='Z')
            return ch+32;
        else
            return ch;
    }
    bool XXX(string s) {
        string s1;
        for(auto c : s){
            if(isalnum(c)){//isalnum使用:判断是否为数字或字母
                s1 += c;
            }
        }
        string first(s1.size(),' '),second(s1.size(),' ');//string构造方法
        // first.resize(s1.size());//resize使用:缩减或增加字符串长度
        // second.resize(s1.size());
        transform(s1.begin(),s1.end(),first.begin(),op);//transform的使用:利用op函数,将s1的字符转换为小写,传给first
        transform(s1.rbegin(),s1.rend(),second.begin(),op);//同理
        return first==second;
    }
};

