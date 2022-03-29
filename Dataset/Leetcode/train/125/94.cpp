 class Solution {
public:
    bool XXX(string s) {
        string t;
        for(auto i:s){
            if(isdigit(i)) t.push_back(i);
            else if(isupper(i)) t.push_back(i);
            else if(islower(i)) t.push_back(i-'a'+'A');
        }
        s=t;
        reverse(s.begin(),s.end());
        return s==t;
    }
};

