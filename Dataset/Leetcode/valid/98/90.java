 class Solution {
    TreeNode *last=NULL;
public:
    bool XXX(TreeNode* root) {
        if(root==NULL) return true;
        if(!XXX(root->left)) return false;
        if(last && last!=root && last->val>=root->val) return false;
        last=root;
        if(!XXX(root->right)) return false;
        return true;
    }
};

