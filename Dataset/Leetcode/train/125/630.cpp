 class Solution {
public:
    bool XXX(string s) {
        string temp;
        for (auto& i : s) {
            if ((i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z')) temp += tolower(i);
            if (i >= '0' && i <= '9') temp += i;
        }
        int left = 0, right = temp.size() - 1;
        while (left < right) {
            if (temp[left++] != temp[right--]) return false;
        }
        return true;
    }
};

