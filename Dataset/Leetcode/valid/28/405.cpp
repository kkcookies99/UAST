 class Solution {
public:
    void getNext(string needle,vector<int> & next){
        int len = needle.length();
        if(len == 0) return;
        int index = 0;
        int nextIndex = -1;
        next[index] = nextIndex;
        while(index < len){
            if(nextIndex == -1 || needle[index] == needle[nextIndex]){
                index ++;
                nextIndex ++;
                next[index] = nextIndex;
            }else nextIndex = next[nextIndex];
        }
    }
    int KMP(string haystack,string needle,vector<int> & next){
        getNext(needle,next);
        int len1 = haystack.length();
        int len2 = needle.length();
        int index1 = 0;
        int index2 = 0;
        while(index1 < len1 && index2 < len2){
            if(index2 == -1 || haystack[index1] == needle[index2]){
                index1 ++;
                index2 ++;
            }else index2 = next[index2];
        }
        if(index2 == len2) return index1 - index2;
        return -1;
    }
    int XXX(string haystack, string needle) {
        int len2 = needle.length();
        if(len2 == 0) return 0;

        vector<int> next(len2+1);
        return KMP(haystack,needle,next);
    }
};

