 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle=="")
            return 0;
        if(size(haystack)<size(needle)){
            return -1;
        }
        for(int i=0;i<size(haystack)-size(needle)+1;i++){
            int q=size(needle);
            int flag=0;
            for(int j=0;j<size(needle);j++){
                if(needle[j]!=haystack[i+j]){
                    flag=1;
                    break;
                } 
                else
                   q--;
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }
};

