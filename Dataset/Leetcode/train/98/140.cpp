 class Solution {
public:
    bool XXX(TreeNode* root, long long min, long long max){
        if(root== nullptr)return true;
        if(root->val > min && root->val < max){
            return XXX(root->left, min, root->val) && XXX(root->right, root->val, max);
        }
        else{
            return false;
        }
    }

    bool XXX(TreeNode* root) {
        return XXX(root, LLONG_MIN, LLONG_MAX);
    }
};```

