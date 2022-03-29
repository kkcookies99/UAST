 class Solution {
public:
    bool XXX(string s)
    {
        string a = "";
        for(char c: s)
            if(isdigit(c) || isalpha(c))
                a += (c | ' ');
        
        string b = a;
        reverse(b.begin(), b.end());
        return a == b;
    }
};

