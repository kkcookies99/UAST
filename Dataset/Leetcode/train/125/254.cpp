 class Solution {
public:
    bool fin(char& ch)
    {
        bool flag=false;
         
        if(ch>='A'&&ch<='Z')
            ch=ch+32;
        if((ch>=48&&ch<=57)||(ch>='a'&&ch<='z'))
            flag=true;
        return flag;
    }
    bool XXX(string s) {
        int len=s.size();
        int left=0,right=len-1;
         
        while(left<=right)
        {
            if(!fin(s[left]))
            {
                left++;
                continue;
            }
            if(!fin(s[right]))
            {
                right--;
                continue;
            }
            if(s[left]==s[right])
            {
                left++;
                right--;
            }
            else
                return false;
        }
        return true;
    }
};

