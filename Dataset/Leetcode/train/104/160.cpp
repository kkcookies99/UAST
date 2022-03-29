class Solution {
public:
    int dfs(TreeNode* root,int pre){
        if(root==nullptr) return pre;
        pre += 1;
        return max( dfs(root->left,pre), dfs(root->right,pre));

    }

    int XXX(TreeNode* root) {
        return dfs(root,0);
        

    }
};

