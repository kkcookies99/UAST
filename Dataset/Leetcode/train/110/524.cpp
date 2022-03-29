class Solution {
public:
    bool XXX(TreeNode* root) {
        help(root);
        return res;
    }
private:
    bool res=true;
    int help(TreeNode *root){
        if(root==nullptr||!res){
            return 0;
        }
        int left=help(root->left)+1;
        int right=help(root->right)+1;
        if(abs(left-right)>1) res=false;
        return max(left,right);
    }
};

