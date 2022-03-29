 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle==""){
            return 0;
        }
        if(haystack=="" || haystack.size() < needle.size()){
            return -1;
        }
        int s = -1;
        for(int i=0; i<=haystack.size()-needle.size(); ++i){
            int k=0;
            for(int j=0; j<needle.size(); ++j){
                
                if(haystack[i+j] == needle[j]){
                    k++;
                }
                
            }
            if(k==needle.size()){
                s=i;
                break;
            }
        }
        return s;
    }
};

