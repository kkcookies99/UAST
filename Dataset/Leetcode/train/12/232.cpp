 class Solution {
public:

    string XXX(int num) {
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        string alpha[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        string res = "";
        for (int i = 0; i < 13; i++)
        {
            for (int j = 0; j < num / values[i]; ++j)
            {
                res += alpha[i];
            }
            num %= values[i];
        }
        return res;
    }
};

