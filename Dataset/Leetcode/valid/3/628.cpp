 class Solution {
public:
    int XXX(string s) {
        map<int,int>pos;
        int maxLen=0,lo=0,hi=0;
        while(hi<s.size()){
            if(pos.count(s[hi])==0||pos[s[hi]]<lo){
                maxLen = max(maxLen,hi-lo+1);
                pos[s[hi]]=hi;
            }else{
                while(s[lo]!=s[hi]){
                    pos[s[lo]]=0;
                    lo++;
                }
                lo++;
                pos[s[hi]]=hi;
            }
            hi++;
        }
        return maxLen;
    }
};

