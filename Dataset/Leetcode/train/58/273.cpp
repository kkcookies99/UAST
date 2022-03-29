 class Solution {
public:
    int XXX(string s) {
        int n = s.size();
        if(n == 0){
            return 0;
        }
        reverse(s.begin(),s.end());
        int i=0;
        while(i<n){
            if(s[i] == ' '){
                i++;
            }
            else{
                break;
            }
        }
        int len = 0;
        while(i<n && s[i] != ' '){
            i++;
            len++;
        }
        return len;
    }
};

