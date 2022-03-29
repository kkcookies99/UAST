 class Solution {

    template<typename LB, typename UB>
    static bool isInRange(struct TreeNode* root, LB lower_bound, UB upper_bound){
        if(root == nullptr) {
            return true;
        } else {
            return (lower_bound < root->val) \
                && (upper_bound > root->val) \
                && isInRange(root->left, lower_bound, root->val) \
                && isInRange(root->right, root->val, upper_bound);
                // isInRange<LB, int> && isInRange<int, UB>
        }
    }

    struct PositiveInfinity { bool operator>(int) { return true; } }; // 正无穷不用比
    struct NegativeInfinity { bool operator<(int) { return true; } }; // 负无穷不用比
public:
    bool XXX(TreeNode* root) {
        // isInRange<NegativeInfinity, PositiveInfinity>
        return isInRange(root, NegativeInfinity(), PositiveInfinity());
    }
};

