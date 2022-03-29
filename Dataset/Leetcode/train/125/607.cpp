 class Solution {
public:
    bool XXX(string s) {
        int start = 0 , end = s.size() - 1;
        while(start < end){
            while(!(s[start] >= 'a' and s[start] <= 'z') and !(s[start] >= 'A' and s[start] <= 'Z') and !(s[start] >= '0' and s[start] <= '9')){
                start++;
                if(start >= s.size())   return true;
            }  
            if(s[start] >= 'A' and s[start] <= 'Z')     s[start] += 32;
            while(!(s[end] >= 'a' and s[end] <= 'z') and !(s[end] >= 'A' and s[end] <= 'Z') and !(s[end] >= '0' and s[end] <= '9')){
                end--;
                if(end < 0)     return true;
            }  
            if(s[end] >= 'A' and s[end] <= 'Z')     s[end] += 32;   
            if(s[start] != s[end])    return false;
            else{
                start++;
                end--;
            }
        }
        return true;
    }
};


