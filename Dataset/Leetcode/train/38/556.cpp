 class Solution {
public:
    string f(string s){
        int k = 1;
        string s1;
        for(int i = 0; i<s.length(); i++){
            if(s[i+1] == s[i])
                k++;
            else{
                s1 = s1 + to_string(k) + s[i];
                k = 1;
            }
        }
        return s1;
    }
    string XXX(int n) {
        string s = "1";
        for(int i = 1; i<n; i++){
            s = f(s);
        }
        return s;
    }
};

