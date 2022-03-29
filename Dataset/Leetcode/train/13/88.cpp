class Solution {
public:
    int XXX(string s) {

        string roman[13] = {
                "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"
        };
        int nums[13] = {
                1000,900,500,400,100,90,50,40,10,9,5,4,1
        };
        int res = 0;
        int i = 0;
        int j = 0;
        while (j < 13 && i < s.size()){
            while ( s.substr(i, 1)== roman[j] || s.substr(i, 2) == roman[j]){
                if (s.substr(i, 1) == roman[j])
                    i++;
                else if (s.substr(i, 2) == roman[j])
                    i += 2;
                res += nums[j];
            }
            j++;
        }
        return res;
    }
};

