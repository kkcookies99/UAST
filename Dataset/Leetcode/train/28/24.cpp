 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle == "") return 0;
        int i = 0;
        int j = 0;
        while(i<haystack.size() && j<needle.size()){
            if(haystack[i]==needle[j]) i++,j++;
            else i=i-j+1,j=0;

        }
        if(j==needle.size()) return i-needle.size();
        else return -1;
    }
};

