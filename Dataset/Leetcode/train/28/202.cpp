 class Solution {
public:
    int XXX(string haystack, string needle) {
        int len=needle.length();
        int hlen=haystack.length();
        if(len==0) return 0;
        for(int i=0;i<hlen&&hlen-i>=len;i++){
            for(int j=0;haystack[i+j]==needle[j];j++){
                if(j==len-1) return i;
            }
        }
        return -1;
    }
};

