 class Solution {
public:
    vector<int> res;
    vector<int> XXX(TreeNode* root) {
        order(root);
        return res;
    }
    void order(TreeNode* root){
        if(root==NULL)return;
        order(root->left);
        res.push_back(root->val);
        order(root->right);

    }
};

