 class Solution {
public:
vector<int> vResult;
    vector<int> XXX(TreeNode* root) {  
   if (root != nullptr) {
        XXX(root->left);
        vResult.push_back(root->val);
        XXX(root->right);
    } else {
        return vResult;
    }
    }
};

