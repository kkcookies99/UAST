 class Solution {
public:
    bool XXX(string s) {
        string dst;
        for(auto ch : s)
        {
            if((ch >= 48 && ch <= 57) || (ch >= 97 && ch <= 122))
                dst.push_back(ch);
            else if(ch >= 65 && ch <= 90)
                dst.push_back(ch + 32);
            else
                continue;
        }

        int i = 0, j = dst.length() - 1;
        while(i < j)
        {
            if(dst[i] == dst[j])
            {
                i++; j--;
                continue;
            }
            return false;
        }
        return true;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


