 class Solution {
public:
    bool flag = false;
    void dfs(TreeNode* root, int sum, int temp){
        
        if(root->left == nullptr && root->right == nullptr){
            if(temp == sum)
                flag = true;
            return;
        }

        if(root->left) dfs(root->left, sum, temp + root->left->val);
        if(root->right) dfs(root->right, sum, temp + root->right->val);

    }
    bool XXX(TreeNode* root, int sum) {
        if(root == nullptr)
            return flag;
        dfs(root, sum, root->val);
        return flag;
    }
};

