 class Solution {
public:
    bool XXX(string s) {
        int len = s.size();
        string buf;
        for(int i = 0; i < len; i++)
        {
            int ascii = (int)s[i];
            if(ascii >= 48 && ascii <= 57) buf.push_back(s[i]);
            else if(ascii >= 97 && ascii <= 122) buf.push_back(s[i]);
            else if(ascii >= 65 && ascii <= 90) buf.push_back((char)(ascii + 32));
        }
        len = buf.size();
        for(int l = 0, r = len - 1; l <= r; l++, r--)
        {
            if(buf[l] != buf[r]) return false;
        }
        return true;
    }
};

