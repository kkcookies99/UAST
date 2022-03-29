 class Solution {
public:
    int XXX(string s) {
        int i=s.size()-1;
        while(s[i] == ' ')
        {
            i--;
        }
        int index=i;
        while(s[i]!=' ')
        {
            if(i-1>=0)
                i--;
            else
            {
                i--;
                break;
            }
        }
        return index-i;
    }
};

