 class Solution {
public:
    string dfs(TreeNode* root){
        string res{};
        if(root){
            res+='0'+root->val;
            res+=dfs(root->left);
            res+=dfs(root->right);
            return res;
        }else
        return "n";
    }
    string dfs2(TreeNode* root){
        string res{};
        if(root){
            res+='0'+root->val;
            res+=dfs2(root->right);
            res+=dfs2(root->left);
            return res;
        }else
        return "n";
    }
    bool XXX(TreeNode* root) {
        if(!root) return true;
        string left=dfs(root->left);
        string right=dfs2(root->right);
        if(left==right)
            return true;
        else
            return false;

    }
};

