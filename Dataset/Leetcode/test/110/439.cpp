class Solution {
public:
    bool XXX(TreeNode* root) {
        return dfs(root)>=0;
    }
    int dfs(TreeNode* node){
        if(node==NULL) return 0;
        int left = dfs(node->left);
        int right = dfs(node->right);
        if(left<0||right<0) return -1;
        if(abs(left-right)>1) return -1;
        else return max(left,right)+1;
    }
};

