 class Solution {
public:
    int XXX(string haystack, string needle) {
        int n1 = haystack.size();
        int n2 = needle.size();
        if(n2 == 0) return 0;
        if(n1 == 0) return -1;
        int p1 = 0 , p2 = 0;
        bool isdiff = false;
        while(p1<n1){
            if((n1-p1)<n2) return -1;
            if(haystack[p1]!=needle[p2]){
                p1++;
                continue;
            }
            int old_p1 = p1;
            while(p2<n2){
            if(haystack[p1]!=needle[p2]) {
                isdiff = true;
                break;
            }
            p1++;
            p2++;
            }
            if(isdiff){
                p1 = old_p1+1;
                p2 =0;
                isdiff = false;
            }
            else{
                return old_p1;
            }  
        }
        return -1;

    }
};

