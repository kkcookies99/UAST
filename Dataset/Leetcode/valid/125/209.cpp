 class Solution {
public:
     
     //大写字母转成小写字母
     void convertToLowercase(char& c) {
        if('A' <= c &&  c <='Z')
        {
            c = c + 32;
        }
     }
     
     bool XXX(string s) {
        int i = 0;
        int endIndex = s.length()-1;
        while(i < s.length() && endIndex >= 0)
        {

            convertToLowercase(s[i]);
            convertToLowercase(s[endIndex]);

            if(('a' <= s[i] &&  s[i] <='z') || ('0' <= s[i] &&  s[i] <='9'))
            {
                if(('a' <= s[endIndex] &&  s[endIndex] <='z') || ('0' <= s[endIndex] &&  s[endIndex] <='9'))
                {
                    if(s[i] != s[endIndex])
                    {
                        return false;
                    }

                    endIndex--;
                    i++;
                }
                else
                {
                    endIndex--;
                }
            } else {  
                i++;
            }
        }
        return true;
    }
};

