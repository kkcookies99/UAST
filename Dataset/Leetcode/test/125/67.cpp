 class Solution {
public:
    bool XXX(string s) {
        int i=0,j=s.size()-1;
        while(i<j)
        {
            while(i<s.size()-1 && !isalnum(s[i]))
                i++;
            while(j>0 && !isalnum(s[j]))
                j--;
            if(i>=j)
                break;
            if(tolower(s[i])!=tolower(s[j]))
                return false;
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


