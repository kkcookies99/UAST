 class Solution {
public:
    bool XXX(TreeNode* root) {
        bool flag = true;
        XXX(root, flag);
        return flag;
    }
    int XXX(TreeNode* root, bool& flag){
        if(root != NULL && flag) {
            int left = XXX(root->left, flag) + 1;
            int right = XXX(root->right, flag) + 1;
            if(abs(left - right) >= 2)
                flag = false;
            return std::max(left, right);
        }
        return 0;
    }
};

