 class Solution {
public:
    bool XXX(string s) {
        //主要思路：先遍历字符串做处理->去掉非数字、非字母，并将大写字母转化为小写字母，然后双指针
        //头尾遍历同步比较，即可判断是否为回文串
        string tmp;
        for (auto c : s) {
            if (islower(c) || isdigit(c))  tmp += c;//遇到小写字母或者数字直接copy
            else if (isupper(c)) tmp += (c + 32);//遇到大写字母，现将其转化为小写字母
        }//空格项直接跳过
        int i = 0, j = tmp.size() - 1;
        while (i < j) {
            if (tmp[i] != tmp[j]) return false;
            i++;
            j--;
        }
        return true;
    }
};

