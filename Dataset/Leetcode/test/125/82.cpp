 class Solution {
public:
    bool XXX(string s) {
        if(s.length()<2) return true;
        int l=0,r=s.length()-1,n=s.length();
        while(l<r){
            while(l<r&&!((s[l]>='A'&&s[l]<='Z')||(s[l]>='a'&&s[l]<='z')||(s[l]>='0'&&s[l]<='9'))){
                ++l;
            }
            while(l<r&&!((s[r]>='A'&&s[r]<='Z')||(s[r]>='a'&&s[r]<='z')||(s[r]>='0'&&s[r]<='9'))){
                --r;
            }
            if(s[l]>='A'&&s[l]<='Z'){
                s[l]+=32;
            }
            if(s[r]>='A'&&s[r]<='Z'){
                s[r]+=32;
            }
            if(s[l]!=s[r]) return false;
            ++l;
            --r;
        }
        return true;
    }
};

