 class Solution {
public:
    vector<int> res;
    vector<int> XXX(TreeNode* root) {
    if(root!=NULL){
        XXX(root->left);
        res.push_back(root->val);
        XXX(root->right);
    }    
    return res;
    }
};

