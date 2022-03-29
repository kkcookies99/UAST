 class Solution {
public:
    bool is_reverse_string(string s){
        int n=s.size();
        for(int i=0;i<n/2;i++){
            if(s[i]!=s[n-i-1])
                return false;
        }
        return true;
    }
    bool XXX(string s) {
        string t;
        for(auto x:s){
            if((x>='a'&&x<='z')||(x>='0'&&x<='9')||(x>='A'&&x<='Z'))
                if(x>='A'&&x<='Z')
                    t+=(x+'a'-'A');
                else
                    t+=x;
        }
        return is_reverse_string(t);
    }
};

