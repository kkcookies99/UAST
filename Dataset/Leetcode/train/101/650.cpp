 class Solution {
public:
    bool XXX(TreeNode* root) {
        if ( !root ) {
            return true;
        }
        return isMirror(root->left, root->right);
    }

    bool isMirror(TreeNode *left, TreeNode *right) {
        if ( !left && !right ) {    // 左右都空，对称
            return true;
        }
        if ( !left || !right ) {    // 有一个为空，不对成
            return false;
        }
        if ( left -> val == right -> val ) {
            return isMirror(left->left, right->right) && isMirror(left->right, right->left);
        }
        return false;
    }
};

