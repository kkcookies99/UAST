 class Solution {
public:
    bool XXX(string s) {
    int i = 0;
    while(i<s.length())
    {
        if(s[i+1]-s[i] == 1 || s[i+1]-s[i] ==2)
        {
           s.replace(i,2,"");
           if(i>0) i--;
        }
        else
        {
            i++;
        }        
    }
    if(s != "") return false;
    else return true;
    }
};