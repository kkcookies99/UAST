 class Solution {
public:
    int XXX(vector<int>& nums) {
        int prefix_sum = 0, max_seq = INT_MIN;
        for (const auto &i : nums) {
            prefix_sum += i;
            max_seq = max(max_seq, prefix_sum);
            prefix_sum = max(prefix_sum, 0);
        }
        return max_seq;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


