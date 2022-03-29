 class Solution {
public:
    vector<int> v;
    void postorder(TreeNode* root){
        if(!root) return;
        postorder(root->left);
        v.emplace_back(root->val);
        postorder(root->right);
    }
    vector<int> XXX(TreeNode* root) {
        postorder(root);
        return v;
    }
};

