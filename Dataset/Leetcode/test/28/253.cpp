 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle.size() == 0)return 0;
        if(haystack.size() == 0)return -1;
        for(int i = 0 ; i < haystack.size() ; i++ ){
            if(haystack.size() - i < needle.size())break;
            int j = 0;
            while(j < needle.size()){
                if(haystack[i + j] == needle[j])j++;
                else break;
            }
            if(j == needle.size()  )return i ;
        }
        return -1;
    }
};

