 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if (!p && !q) return true;
        else if (p && q)
        {
            if (p -> val != q -> val) return false;
            return XXX(p -> left, q -> left) && XXX(p -> right, q -> right);
        }
        return false;
    }
};

