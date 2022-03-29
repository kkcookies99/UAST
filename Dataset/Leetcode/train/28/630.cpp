 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(!needle.length()) return 0;
        if(!haystack.length()) return -1;
        int p1=0,p2=0;
        while(p1<haystack.length() && p2<needle.length()){
            if(haystack[p1]==needle[p2]){
                p1++;
                p2++;
            }
            else{
                p1=p1-p2+1;
                p2=0;
            }
        }
        if(p2==needle.length()){
            return p1-needle.length();
        }
        return -1;
    }
};

