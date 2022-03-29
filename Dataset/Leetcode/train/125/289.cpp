 class Solution {
public:
    bool XXX(string s) {
        if(s.empty())
            return true;
        int i = 0, j = s.size() - 1;
        while(i < j)
        {
            while(i < j && !isalpha(s[i]) && !isdigit(s[i]))
                ++i;
            while(i < j && !isalpha(s[j]) && !isdigit(s[j]))
                --j;
            if(tolower(s[i]) != tolower(s[j]))
                return false;
            ++i;
            --j;
        }
        return true;
    }
};```

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


