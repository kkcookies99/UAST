 class Solution {
public:
    bool XXX(string s) {
        if(s.empty())return true;

        int left=0,right=s.size()-1;

        while(left<right)
        {
            while(left<right&&!isValidStr(s[left]))left++;
            while(left<right&&!isValidStr(s[right]))right--;
           
           if(s[left]==s[right]||isValidAlph(s[left])&&isValidAlph(s[right])
           &&(s[left]-s[right]=='A'-'a'||s[left]-s[right]=='a'-'A'))
           {
               left++;
               right--;
           }
           else 
           return false;
            
        }
        return true;
    }

    bool isValidStr(char ch)
    {//判断是否是有效字符（数字和大小写字母）
        if(ch>='0'&&ch<='9'||
           ch>='a'&&ch<='z'||
           ch>='A'&&ch<='Z')
           return true;
        else
        return false;
    }
    
    bool isValidAlph(char ch)
    {//判断是否是大小写字母
         if(ch>='a'&&ch<='z'||
            ch>='A'&&ch<='Z')
           return true;
        else
        return false;
    }
};

