 class Solution {
public:
    map<int,string> myhash{
        {1000,"M"},{900,"CM"},{500,"D"},{400,"CD"},
        {100,"C"},{90,"XC"},{50,"L"},
        {40,"XL"},{10,"X"},{9,"IX"},{5,"V"},{4,"IV"},{1,"I"}
    };
    
    string XXX(int num) {
        string result="";
        for(auto iter=myhash.rbegin();iter!=myhash.rend();++iter){
            while(num/iter->first>0){
                result+=iter->second;
                num-=iter->first;
            }
        }
        return result;
    }
};

