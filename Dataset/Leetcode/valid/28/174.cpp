 class Solution {
public:
    //KMP建立next
    void get_next(string needle, int next[]){
        int i=0,j=-1;
        next[0] = -1;
        while(i < needle.size()-1){
            if(j == -1 || needle[i] == needle[j]){
                i++;
                j++;
                next[i] = j;
            }
            else j = next[j];
        }
        adjust_next(needle, next);
    }
    
    //KMP修正next，参考严蔚敏《数据结构C语言版》
    /*
    匹配字符串:   a  a  a  a  b  a  a  a  a  c
    next:       -1  0  1  2  3  0  1  2  3  4
    修正next:   -1 -1 -1 -1  3  0  0  0  0  4
    */
    void adjust_next(string needle, int next[]){
        if(needle.size() <= 1) return;
        int i=1,j=0;
        while(i < needle.size()){
            if(needle[i] == needle[j]) next[i++] = next[j];
            else{
                ++i;
                j=i;
            }
        }
    }
    
    int XXX(string haystack, string needle) {
        if(needle == "") return 0;
        int next[needle.size()] = {0};
        get_next(needle, next);
        
        int i=0, j=0;
        while( (i < haystack.size()) && (j < static_cast<int>(needle.size())) ){
            if(j == -1 || haystack[i] == needle[j]){
                i++;
                j++;
            }
            else{
                j = next[j];
            }
        }
        if(j >= needle.size()) return i - needle.size();
        else return -1;
    } 
};

