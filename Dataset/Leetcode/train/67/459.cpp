class Solution {
public:
    string XXX(string a, string b) {
        //  先补齐差位
        if(a.size()<b.size())
            a.insert(0,b.size()-a.size(),'0');
        else 
             b.insert(0,a.size()-b.size(),'0');
        string temp(a.size(),'0');
        int d=0;  // 进位表示符
        //  依次计算
        for(int i=a.size()-1;i>=0;i--)
        {
            temp.at(i) = (a.at(i)+b.at(i)-96+d) % 2 +'0';
            
           d= (a.at(i)+b.at(i)-96+d) /2;
               
        }
        //  若最后有进位，创建一个新的string，并将之前计算完成的temp插入其后
        if(d==1)
        {
            string returns("1");
            returns.insert(returns.end(),temp.begin(),temp.end());
            return returns;
        }
        //  若无进位，直接返回temp
        else
           return temp;
    }
};

