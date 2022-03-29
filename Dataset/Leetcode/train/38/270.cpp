class Solution {
public:
    string XXX(int n) {
        if(n == 1) return "1";
        string str = XXX(n - 1);
        string res = "";
        for(int i = 0; i < str.size(); ++i)
        {
            int j = i;
            while(j < str.size() && str[i] == str[j]) ++j;
            res += to_string(j - i) + str[i];
            i = j - 1;
        }
        return res;
    }
};