 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle.size()==0) return 0;
        int n = 0;
        int tmp=0;
        for(int i = 0; i < haystack.size(); i++){
            tmp=0;
            if (haystack[i]==needle[0]){
                for(int j = 1; j < needle.size(); j++){
                    if(needle[j]!=haystack[i+j]){
                        tmp=1;
                        break;
                    }
                }
                if(tmp==0)  return i;
            }
        }
        return -1;
    }
};

