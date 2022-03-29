 class Solution {
public:
    bool XXX(TreeNode* root) {
        return check(root);
    }
private:
    optional<int> prev {};
    bool check(TreeNode const * const root) {
        if (root) {
            if (!check(root -> left)) return false;

            if (prev && root -> val <= prev) 
                return false;
            prev = root -> val;
            
            if (!check(root -> right)) return false;
        }
        return true;
    }
};

