 class Solution {
public:
    string XXX(string s) {
        int len=1;
        int rl=0;
        for(int i=0;i<s.size();i++){
            int low=i,high=i;
            // 单向扩散
            while(high<s.size()-1 && s[high+1]==s[low]) high++;
            // 双向扩散
            while(low>0 && high < s.size()-1 && s[low-1]==s[high+1]){
                low--,high++;
            }
            if(len<high-low+1){
                rl=low;
                len=high-low+1;
            }
        }
        return s.substr(rl,len);
    }
};

