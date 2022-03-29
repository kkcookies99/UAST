 class Solution {
public:
    int XXX(string s) {
        int length = 0;
        for(int i = 0; i < s.size(); ++i)
        {
            char last;
            string str = "";
            for (int j = i; j < s.size() && s[j] != last; ++j)
            {
                if(str.find(s[j]) == -1)
                {
                    str = str + s[j];
                    last = s[j];
                }
                else
                    break;
            }
            if (str.size() > length)
                length = str.size();
        }
        
        return length;
    }
};

