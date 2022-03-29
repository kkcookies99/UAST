 class Solution {
public:
    int XXX(string haystack, string needle) {
        int m=haystack.size(),n=needle.size(),right=0;
        if(needle.empty()) return 0;
        if(haystack.empty()||n>m) return -1;
        for(int left=0;left<m;++left){
            if(haystack[left]==needle[0]){
                right=left+1;
                int j=1;
                while(right-left<=n&&haystack[right]==needle[j]&&right<m&&j<n){
                    right++;
                    j++;
                }
                if(j==n){
                    return left;
                }
            }
        }
        return -1;
    }
};```

