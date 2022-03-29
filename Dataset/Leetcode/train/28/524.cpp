 class Solution {
public:
    int next[32888];
    int XXX(string haystack, string needle) {
        if(needle=="") return 0;
        int i = 0,j=-1;
        next[i] = j;
        while(i<needle.size()-1){
            if(j==-1||needle[i]==needle[j]){
                i++;j++;
                if(needle[i]!=needle[j])
                    next[i] = j;
                else    
                    next[i] = next[j];
            }else{
                j = next[j];
            }
        }
        i = 0;j = 0;
        while(i<haystack.size()){
            if(j==-1||haystack[i]==needle[j]){
                i++;j++;
            }else{
                j = next[j];
            }
            if(j==needle.size()) return i-j;
        }
        return -1;
    }
};

