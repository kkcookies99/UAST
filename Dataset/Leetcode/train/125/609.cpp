 class Solution {
public:
    bool XXX(string s) {
        string ans = "";
        // 去掉其他符号，大写转化为小写
        for(auto& iter:s)
        {
          if(iter>64 && iter<91) iter+=32;
          if((iter>96 && iter<123) || isdigit(iter))
           ans+=iter;
        }

        // 双指针判别
        for(int i = 0, j = ans.length()-1; i<j; ++i,--j)
            if(ans[i] != ans[j]) return false;
        return true;

    }
};

