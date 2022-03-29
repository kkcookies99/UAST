 class Solution {
public:
    bool XXX(TreeNode* root) {
        return check(root,LONG_MIN,LONG_MAX);
    }
    bool check(TreeNode* root,long long l,long long r){
        if(root == nullptr) return true;
        if(root->val > l && root->val < r){
            return check(root->left,l,root->val) && check(root->right,root->val,r);
        }
        return false;
    }
};

