class Solution {
public:
    bool XXX(TreeNode* root) {
        return check(root) != unbalanced;
    }
private:
    constexpr static int unbalanced = -1;
    int check(TreeNode * root) {
        if (root) {
            int left = check(root -> left);
            if (left == unbalanced) return unbalanced;
            int right = check(root -> right);
            if (right == unbalanced) return unbalanced;

            if (abs(left - right) <= 1) 
                return (max(left, right) + 1);
            else 
                return unbalanced;
        }
        else return 0;
    }
};

