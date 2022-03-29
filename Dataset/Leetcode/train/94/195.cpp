 class Solution {
public:
    vector<int> midorder;
    void midOrder(TreeNode* root){//左根右
        if(!root){
            return;
        }
        midOrder(root->left);
        midorder.push_back(root->val);
        midOrder(root->right);
    }
    
    vector<int> XXX(TreeNode* root) {
        midOrder(root);
        return midorder;
    }
};

