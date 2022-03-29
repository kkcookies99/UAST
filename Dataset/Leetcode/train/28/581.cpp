 class Solution {
public:
    int XXX(string haystack, string needle) {
        int m=haystack.size(),n=needle.size();
        if(needle.size()==0||needle.size()==0&&haystack.size()==0)
        return 0;
        string s="";
        for(int i=0;i<=m-n;i++){
            s=haystack.substr(i,n);
            if(s==needle)
            return i;
        }
        return -1;
    }
};

