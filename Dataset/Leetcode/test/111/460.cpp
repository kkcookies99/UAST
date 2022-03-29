class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == NULL) return 0;
        int res = INT_MAX;
        _XXX(root, 1, res);
        return res;
    }
    void _XXX(TreeNode* root, int flag, int &res) {
        if(root==NULL) return;
        if(root->left==NULL && root->right==NULL) 
            res = flag<res?flag:res;
        _XXX(root->left, flag+1, res);
        _XXX(root->right, flag+1, res);
    }
};

