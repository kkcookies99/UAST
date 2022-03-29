 class Solution {
public:
    bool XXX(string s) {
        if (s.empty()) {
            return true;
        }
        const char* begin = s.c_str();
        auto end = begin + s.size();
        auto valid_char = [](const char ch) {
            return std::isalpha(ch) || std::isdigit(ch);
        };
        while (begin < end) {
            while ((begin < end) && !valid_char(*begin)) {
                ++begin;
            }
            while((begin < end) && !valid_char(*(end - 1))) {
                --end;
            }
            if (begin < end) {
                if (std::tolower(*begin) != std::tolower(*(end - 1))) {
                    return false;
                }
                ++begin, --end;
            }
        }
        return true;
    }
};

