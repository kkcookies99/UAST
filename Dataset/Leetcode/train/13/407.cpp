 class Solution {
public:
    int XXX(string s) {
        string table[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int num[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int TABLE_LEN = 13;
        int strpos = 0;
        int result = 0;
        for(auto i = 0; i < TABLE_LEN && strpos<s.length(); i++)
        { 
            int len = table[i].length();
            while(strpos<s.length()&&s.substr(strpos,len)==table[i])
            {
                result += num[i];
                strpos+=len;
            }
        }
        return result;
    }
};

