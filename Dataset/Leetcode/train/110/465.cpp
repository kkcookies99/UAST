class Solution {
public:
    bool XXX(TreeNode* root) {
        int flag=0;
        _height(root, flag);
        return flag == 0;
    }
    int _height(TreeNode* root, int &flag) {
        if(root == NULL) return 0;
        int left_height = _height(root->left, flag);
        int right_height = _height(root->right, flag);
        if (abs(left_height-right_height)>1) flag=1;
        return max(left_height, right_height)+1;
    }
};

