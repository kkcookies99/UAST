 class Solution {
public:
    int XXX(string s) {
        int right = 0, left = 0;
        int n = 0, largest = 0;
        unordered_set<int> mSet;
        while (right != s.size()) {
            if (mSet.find(s[right]) == mSet.end()) {
                mSet.insert(s[right]);
                right++;
                n++;
            } else {
                mSet.erase(s[left]);
                left++;
                n--;
            }
            if (n > largest)
                largest = n;
        } 
        return largest;
    }
};

