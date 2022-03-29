 class Solution {
public:   
    bool XXX(TreeNode* root, int sum) {
        if(!root) return false;
        sum-=root->val;
        if(!root->left&&!root->right)  return !sum;
        return root->left&&XXX(root->left,sum)||root->right&&XXX(root->right,sum);
    }
};

