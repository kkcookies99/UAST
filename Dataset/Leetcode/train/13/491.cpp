 class Solution {
public:
    int XXX(const string& s) {
        unordered_map<char, int> unmap{{'M', 1000}, {'D', 500}, {'C', 100}, {'L', 50}, 
                                        {'X', 10}, {'V', 5}, {'I', 1}};
        int ans = 0;
        int prev = 1000;
        for (auto c : s)
        {
            int num = unmap[c];
            ans += num;
            if (prev < num) ans -= 2 * prev;
            prev = num;
        }

        return ans;
    }
};

