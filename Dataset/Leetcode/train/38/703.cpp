 class Solution {
public:
    string XXX(int n) {
        std::vector<int> _cnt = {1};
        while (--n > 0) {
            std::vector<int> cnt;
            size_t _i = 0;
            size_t i =0;
            for (; i<_cnt.size(); ++i) {
                if (_cnt[_i] == _cnt[i]) {
                    continue;
                }
                cnt.push_back(i - _i);
                cnt.push_back(_cnt[_i]);
                _i = i;
            }
            cnt.push_back(i - _i);
            cnt.push_back(_cnt[_i]);

            _cnt = cnt;
        }

        std::string ret;
        for (auto n: _cnt) {
            ret += std::to_string(n);
        }

        return ret;
    }
};

