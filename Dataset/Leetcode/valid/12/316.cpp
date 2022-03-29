 class Solution {
public:
    // void caseDigit(string &s, int dig, const char* Ones, const char Tens, const char Fives)
    // {
        
    // }
    string XXX(int num) {
        // num = 1 ~ 3999
        vector<int> v = {1000, 100, 10, 1}, dig(4, 0);
        string res;
        string M = "MMM", C= "CCC", X = "XXX", I = "III";
        vector<string> Ones = {M, C, X, I};
        char Tens[] = {'\0', 'M', 'C', 'X'};
        char Fives[] = {'\0', 'D', 'L', 'V'};
        auto len = v.size();
        int rem;
        for (size_t i = 0; i < len; ++i)
        {
            dig[i] = num / v[i];
            num -= dig[i] * v[i];
            // printf("%d\n", dig[i]);
            // caseDigit(res, dig[i], Ones[i], Tens[i], Fives[i]);
            // cout<<res<<endl;

            int rem;
            switch (dig[i])
            {
            case 0:
                break;
            case 9:
                res.push_back(Ones[i][0]);
                res.push_back(Tens[i]);
                break;
            case 4:
                res.push_back(Ones[i][0]);
                res.push_back(Fives[i]);
                break;
            default:
                if(dig[i] >= 5)
                {
                    rem = dig[i] - 5;
                    res.push_back(Fives[i]);
                } else{
                    rem = dig[i];
                }
                res.append(Ones[i].begin(), Ones[i].begin() + rem) ;
                break;
            }
        }
        
        return res;
    }
    
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


