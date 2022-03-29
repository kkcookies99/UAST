 class Solution {
public:
    string XXX(int num) {
        unordered_map<int,string> mp={{1,"I"},{4,"IV"},{5,"V"},{9,"IX"},{10,"X"},{40,"XL"},{50,"L"},{90,"XC"},{100,"C"},{400,"CD"},{500,"D"},{900,"CM"},{1000,"M"}};
        vector<int> table={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int p=12;
        string res;
        while(num>0){
            while(table[p]>num){
                p--;
            }
            num-=table[p];
            res+=mp[table[p]];
        }
        return res;
    }
};

