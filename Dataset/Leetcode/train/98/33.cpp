 class Solution {
public:
    int* last = NULL;
    bool XXX(TreeNode* root) {
        if (root){
            if(!XXX(root->left)) return false;
            if (last && *last>=root->val) return false;
            last = &root->val;
            if(!XXX(root->right)) return false;
            return true;
        }else return true;
    };
};

