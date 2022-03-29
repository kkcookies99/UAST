 class Solution {
public:
    void dfs(TreeNode* root,int sum,int cursum,bool& flag){
        if(!root->left&&!root->right){
            if(cursum==sum){
                flag=true;
                return;
            }
        }
        if(root->left)dfs(root->left,sum,cursum+root->left->val,flag);
        if(root->right)dfs(root->right,sum,cursum+root->right->val,flag);
    }

    bool XXX(TreeNode* root, int sum) {
        bool flag=false;
        if(!root)return flag;
        dfs(root,sum,root->val,flag);
        return flag;
    }
};

