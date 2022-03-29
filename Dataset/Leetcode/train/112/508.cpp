 class Solution {
public:
int boolen = false;
    bool XXX(TreeNode* root, int sum) {
        if(!root) return boolen;
        sum-=root->val;
        if(sum == 0 && !root->left && !root->right) boolen = true;       
        XXX(root->left,sum);    
        XXX(root->right,sum);      
        return boolen;
    }
};

