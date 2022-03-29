class Solution {
public:
    int XXX(string s) {
        int len = 0;
        while(s[s.size()-1]==' ')
            s.erase(s.size()-1);
        for(int i = 0 ; i < s.size(); i++)
        {
            if(s[i]==' ')   len = 0;
            else   len++;
        }
        return len;
    }
};

