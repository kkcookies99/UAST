 class Solution {
public:
    int XXX(string s) {
        unordered_set<char> substr;
        int l=0,r=0,m=0,n=s.size(); 
        while(r<n){
            while(r<n&&!substr.count(s[r])){
                substr.insert(s[r]);
                r++;        
            }
            m = max(m,r-l);
            substr.erase(s[l]);
            l++;
        }
        return m;     
    }
};

