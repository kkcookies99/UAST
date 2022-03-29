 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(!needle.size()) return 0;
        haystack=" "+haystack,needle=" "+needle;
        int m=haystack.size(),n=needle.size();
        vector<int> ne(n);

        for(int i=2,j=0;i<n;i++){
            while(j&&needle[i]!=needle[j+1]) j=ne[j];
            if(needle[i]==needle[j+1]) j++;
            ne[i]=j;
        }

        for(int i=1,j=0;i<m;i++){
            while(j&&haystack[i]!=needle[j+1]) j=ne[j];
            if(haystack[i]==needle[j+1]) j++;
            if(j==n-1){
                j=ne[j];
                return i-n+1;
            }
        }

        return -1;
    }
};

