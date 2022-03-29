 class Solution {
public:
    int XXX(string haystack, string needle) {
        if (needle == "") return 0;
        int m = haystack.size();
        int n = needle.size();
        for (int i=0,j=0; i<=m-n; i++){ // needle.size()长度不能直接拿进去比较，会出问题
            int t = i;
            while (haystack[i] == needle[j]){
                // 返回的位置不是i，要减去needle长度
                if (j == needle.size()-1) return i-needle.size()+1;
                i++,j++;
            }
            i = t;  // i和j 都要还原到正确的位置
            j = 0;
        }
        return -1;
    }
};

