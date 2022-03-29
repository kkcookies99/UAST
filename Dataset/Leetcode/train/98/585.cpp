 class Solution {
public:
    bool XXX(TreeNode* root) {   
        return DFS(root,(long)INT_MIN-1,(long)INT_MAX+1);
    }
    bool DFS(TreeNode* root,long minval,long maxval)
    {
        if(root==nullptr) return true;
        if(minval>=root->val||maxval<=root->val) return false;
        return DFS(root->right,root->val,maxval)&&DFS(root->left,minval,root->val);
    }
};

