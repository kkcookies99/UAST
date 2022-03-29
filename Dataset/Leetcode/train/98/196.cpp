 class Solution {
public:
    bool XXX(TreeNode* root) {
        if( root ){
            bool bl = XXX(root->left);
            cur = root;
            if( pre && cur && pre->val >= cur->val )
                return false;
            pre = cur;
            bool br = XXX(root->right);
            return bl && br;
        }
        return true;       
    }

    TreeNode* pre = nullptr;
    TreeNode* cur = nullptr;
};

