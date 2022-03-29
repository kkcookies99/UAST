 class Solution {
public:
    bool XXX(string s) {
        if(!s.size())
            return true;
        for(int i = 0; i < s.size(); i++)
        {
            if((!isalnum(s[i])))
                s.erase(i--, 1);
        }
        int i  = 0, j = s.size() - 1;
        while(i < s.size() && j >= 0)
        {
            if(s[i] != toupper(s[j]) && s[i] != tolower(s[j]) && s[i] != s[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


