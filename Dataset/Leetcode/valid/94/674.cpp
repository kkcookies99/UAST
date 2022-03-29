 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> num;
        XXX(root,num);
        return num;
    }

    void XXX(TreeNode *root ,vector<int> & num){
        if(!root)
            return;
        XXX(root->left,num);
        num.push_back(root->val);
        XXX(root->right,num);
    }
};

