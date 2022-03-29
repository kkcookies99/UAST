 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle.length() == 0){
            return 0;
        }
        int *next = new int[needle.length() + 1];
        Next(needle,next);
        int len = 0;
        for(int i = 0; i < haystack.length(); i++){
            while(len > 0 && needle[len] != haystack[i]){//匹配不成功
                len = next[len];
            }
            if(needle[len] == haystack[i]){//匹配成功
                len++;
            }
            if(len == needle.length()){
                return i + 1 - needle.length();
            }
        }
        return -1;
    }
    
    void Next(string needle, int *next){
        int len = 0;//既是自身真后缀又是自身最长前缀的字符串长度
        next[1] = 0;//只有一个字符匹配
        for(int i = 2; i <= needle.length(); i++){
            while(len > 0 && needle[len] != needle[i-1]){//最后一个不匹配时，回溯，保证找到最长的前缀
                len = next[len];
            }
            if(needle[len] == needle[i-1]){//匹配成功，长度加一
                len++;
            }
            next[i] = len;
        }
    }
};

