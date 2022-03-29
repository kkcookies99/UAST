 class Solution {
public:
    bool get(TreeNode*root,TreeNode*&pre){
        if(root==nullptr) return true;
        if (!get(root->left,pre)) return false;      
        
        if(pre!=nullptr&&pre->val>=root->val) return false;
        pre = root;
        if(!get(root->right,pre)) return false;
        return true;
    }
    bool XXX(TreeNode* root) {
        TreeNode*pre=nullptr;
        return get(root,pre);
    }
};

