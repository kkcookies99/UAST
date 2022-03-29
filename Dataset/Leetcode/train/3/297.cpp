 class Solution {
public:
   int XXX(string s) {
       int res = 0;         // res记录最长无重复子串的长度
       size_t left = 0;    // left表示最左边的位置
       unordered_map<char, size_t> m;   // 无序的哈希表
       for (size_t i = 0; i < s.size(); i++)
       {
   	    left = max(left, size_t(m[s[i]]));
   	     m[s[i]] = i + 1;
   	     res = max(res, int(i - left + 1));    //  注意这里，如果在本地测试成功，
                                                                       //   在这里输出错误(很长的数)，很可能是类型转换的问题
        }

        return res;
   }
};

