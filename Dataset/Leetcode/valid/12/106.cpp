 class Solution {
public:
    string XXX(int num) {
        map<int,string> change={
            {1,"I"},{5,"V"},{10,"X"},{50,"L"},{100,"C"},{500,"D"},{1000,"M"},
            {4,"IV"},{9,"IX"},{40,"XL"},{90,"XC"},{400,"CD"},{900,"CM"}
            };
        string aim;
        while(num>0){
            auto beg = change.upper_bound(num);
            beg--;
            aim+=beg->second;
            num-=beg->first;
        }
        return aim;
    }
};

