 class Solution {
public:
    string XXX(string s) {
        if(s.size()<2) return s;
        int start=0,maxLen=0;
        for(int i=0;i<s.size()-1;i++){
            find(s,start,i,i,maxLen);
            find(s,start,i,i+1,maxLen);
        }
        return s.substr(start,maxLen);
    }
    void find(string &s,int& start,int left,int right,int& maxLen){
        while(s[left]==s[right]&&left>=0&&right<s.size()){
            right++;
            left--;
        }
        if(maxLen<right-left-1){
            start = left+1;
            maxLen = right-left-1;
        }
    }
};

