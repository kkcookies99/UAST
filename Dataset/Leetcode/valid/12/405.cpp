 class Solution {
public:
    string XXX(int num) {
        string romans[13] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int integers[13] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int pos = 0;
        string ret;
        while(num != 0){
            while(num - integers[pos] < 0) pos++;
            ret += romans[pos];
            num -= integers[pos];
        }
        return ret;
    }
};

