 class Solution {
public:
    int XXX(string haystack, string needle) {
        int i = 0;
        int j = 0;
        int x = 0;
        if(needle.size() == 0)
            return 0;

            for(; j<haystack.size();){
                if(haystack[j] != needle[0])
                    j++;
                else{
                    x = j;
                    while(haystack[x] == needle[i] && haystack[x] != '\0' && needle[i] != '\0'){
                        i++;
                        x++;
                    }
                    if(i == needle.size()){
                        return x-i;
                    }
                    else{ 
                        i = 0;
                        j++;
                    }
                }
            }
            return -1;
    }
};