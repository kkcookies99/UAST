 class Solution {
public:
    int XXX(string s) {
    /*
    本题使用滑动窗口的思路来实现，时间复杂度为O(n)

    1、定义一个 map 数据结构存储 (k, v)，其中 key 值为字符，value 值为字符位置 +1，加 1 表示从字符位置后一个才开始不重复。

    2.我们定义不重复子串的开始位置为 start，结束位置为 end。随着 end 不断遍历向后，会遇到与 [start, end] 区间内字符相同的情况，此时将字符作为 key 值，获取其 value 值，并更新 start，此时 [start, end] 区间内不存在重复字符。

    3.无论是否更新 start，都会更新其 map 数据结构和结果 ans。
    */
    int length = s.length();
    int ans = 0;
    unordered_map<char,int> m;
    for(int low = 0,high = 0;high<length;high++){
        char c = s.at(high);
        if(m.find(c)!=m.end()){
            low = max(low, m.find(c)->second);
        }
        ans = max(ans, high - low + 1);
        m.insert(pair<char,int>(c, high + 1));
    }
  
    return ans;
    }
};

