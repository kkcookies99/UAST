 class Solution {
    private: long pre = LONG_MIN;
public:
    bool XXX(TreeNode* root) {
        // cout<<pre;
        if(root==NULL) return true;
        
        if(!XXX(root->left)) return false;
        if(pre>=root->val) return false;
        pre=root->val;
        if(!XXX(root->right)) return false;
        return true;
    }
    
};

