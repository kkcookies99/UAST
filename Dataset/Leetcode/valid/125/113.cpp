 class Solution {
public:
    bool XXX(string s) {
        if (s.empty()) return true;

        auto left = s.cbegin();
        auto right = s.cend() - 1;

        while (left < right)
        {
            while (left < right && !isalnum(*left))
                left++;

            while (left < right && !isalnum(*right))
                right--;

            if (tolower(*left) != tolower(*right))
                return false;
            else
            {
                left++;
                right--;
            }
        }
        
		return true;
    }
};

