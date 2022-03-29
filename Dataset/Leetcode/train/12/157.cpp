 class Solution {
public:
    string XXX(int num) {
    map<int,string> m{{1,"I"},{4,"IV"},{5,"V"},{9,"IX"},{10,"X"},{40,"XL"},{50,"L"},{90,"XC"},{100,"C"},{400,"CD"},{500,"D"},       {900,"CM"},{1000,"M"}};
    string result;

    auto fun = [&](int &value,int n)
    {
        string s;
        if(value <n)
        {
            return s;
        }

        int count = value/n;
        for(int i =0;i<count;++i)
        {
            s.append(m[n]);
        }
        value = value%n;
        return s;
    };

    for(auto it = m.rbegin();it!=m.rend();++it)
    {
        result.append(fun(num,it->first));
    }

    return result;
    }
};

