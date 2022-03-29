 class Solution {
public:
    int XXX(string haystack, string needle) {
        int len1 = haystack.size();
        int len2 = needle.size();
        int index = 0;
        while(index<=len1-len2){
            bool flag = true;
            for(int i=0;i<len2;i++){
                if(haystack[index+i]!=needle[i]){
                    flag = false;
                    break;
                }
            }
            if(flag) return index;
            else index++;
        }
        return -1;
    }
};

