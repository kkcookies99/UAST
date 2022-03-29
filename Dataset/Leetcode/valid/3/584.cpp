 class Solution {
public:
    int XXX(string s) {
        bool arr[128] = {false};
        // unordered_set<char> pre;
        int left = 0;
        int right = 0;
        int length = s.length();
        int max = 0;
        while(right < length){
            while(right < length && !arr[s[right]]){
                arr[s[right]] = true;
                max = ::max(max,right - left + 1);
                ++right;
            }
            if(right < length){
                arr[s[left]] = false;
                left++;
            }
        }
        return max;
    }
};

