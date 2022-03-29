 class Solution {
public:
    bool hasPath(TreeNode* root, int sum) {
        if(!root->left&&!root->right) return sum-root->val==0;
        else if(!root->left&&root->right) return hasPath(root->right,sum-root->val);
        else if(root->left&&!root->right) return hasPath(root->left,sum-root->val);
        else return hasPath(root->left,sum-root->val)||XXX(root->right,sum-root->val);
    }
    bool XXX(TreeNode* root, int sum) {
        if(!root) return 0;
        else return hasPath(root,sum);
    }
};

