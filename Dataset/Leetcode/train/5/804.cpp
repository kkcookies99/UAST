 class Solution {
public:
    int findPalindromeLength(string &s, int lowPos, int& Len, int &index)
    {
        int highPos = lowPos + 1;
        while(highPos < s.length() && s[lowPos] == s[highPos])
            ++highPos;
        int nextPos = highPos - 1;
        lowPos -= 1;
        while(lowPos >= 0 && highPos < s.length() && s[lowPos] == s[highPos])
        {
            --lowPos;
            ++highPos;
        }
        if(Len < (highPos - lowPos - 1))
        {
            index = lowPos + 1;
            Len = highPos - lowPos - 1;
        }
        return nextPos;
    }
    
    string XXX(string s) {
        if(s.length() <= 1) return s;

        int Len = 1, index = 0;
        for(int i = 0; i < s.length(); ++i)
        {
            i = findPalindromeLength(s, i, Len, index);
        }
        return s.substr(index, Len);
    }
};

