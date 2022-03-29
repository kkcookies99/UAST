 class Solution {
public:
    int XXX(string haystack, string needle) {
    if(needle.size()==0) return 0;
    int res=haystack.find(needle,0);        //string类有find方法，从第一个字符开始，寻找haystack中包含needle的位置，并返回索引值
    return res;
    }
};

