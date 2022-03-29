 class Solution {
public:
    string XXX(string s) {
        int count=0, start=0;
        for(int i=0;i<s.length();i++){
            int left=i, right=i;
            while(right<s.length() && s[left]==s[right]){
                right++;
            }
            while(left>0 && right<s.length() && s[left-1]==s[right]){
                left--;
                right++;
            }
            if((right-left)>count){
                count = right-left;
                start = left;
            }
        }
        return s.substr(start, count);
    }
};

