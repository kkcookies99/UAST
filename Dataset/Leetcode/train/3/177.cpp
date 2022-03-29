 class Solution {
public:
    int XXX(string s) {
        unordered_map<char, int> heap;
        int res = 0;
        for (int i = 0, j = 0; i < s.size(); i++)
        {
            heap[s[i]]++;
            while (heap[s[i]] > 1) heap[s[j++]] --;
            res = max(res, i - j + 1);
        }
        return res;
    }
};

