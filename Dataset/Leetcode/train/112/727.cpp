 class Solution {
public:
    bool flag = false;
    void dfs(TreeNode*root,int cnt,int sum){
        if(!root)return;
        if(!root->left && !root->right){if(cnt + root ->val == sum) flag =true; return;}
        dfs(root -> right ,cnt + root ->val ,sum);
        dfs(root -> left,  cnt + root ->val ,sum);
    }
    bool XXX(TreeNode* root, int sum) {
        if(!root)return false;
        dfs(root,0,sum);
        if(flag) return true;
        return false;
    }
};

