class Solution {
public:
    int dfs(TreeNode* node,int level){
        if(node==nullptr)
            return level;
        level++;
        int a=dfs(node->left,level),b=dfs(node->right,level);
        if(abs(a-b)>1)
            return INT_MAX;
        else
            return max(a,b);
    }
    bool XXX(TreeNode* root) {
        if(dfs(root,0)==INT_MAX)
            return false;
        return true;
    }
};

