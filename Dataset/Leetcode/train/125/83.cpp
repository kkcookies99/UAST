 class Solution {
public:
    bool XXX(string s) {
        if(s.empty()) return true;
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            while(!((s[i]<='z'&&s[i]>='a')||(s[i]<='9'&&s[i]>='0')||(s[i]<='Z'&&s[i]>='A'))){
                i++;
                if(i==s.length()) 
                    break;
            }
            while(!((s[j]<='z'&&s[j]>='a')||(s[j]<='9'&&s[j]>='0')||(s[j]<='Z'&&s[j]>='A'))){
                j--;
                if(j==0)
                    break;
            }
            if(i>=j) break;
            if(!((s[i]==s[j])||((s[i]<='z'&&s[i]>='a')&&(s[i]-32==s[j]))||((s[i]<='Z'&&s[i]>='A')&&(s[i]+32==s[j]))))
               return false;
        }
        return true;
    }
};

