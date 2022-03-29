 class Solution {
public:
    string XXX(int num) {
        vector<int> n{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        vector<string> ch{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int p = 0;
        string ret = "";

        while(num > 0){
            while(num / n[p] < 1) p++;
            num -= n[p];
            ret += ch[p];
        }

        return ret;
    }
};

