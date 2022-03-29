 class Solution {
public:
    vector<int> ans;
    vector<int> XXX(TreeNode* root) {
       if(root==nullptr) return ans;

       if(root->left!=nullptr) {
           XXX(root->left);
       }
       
       ans.push_back(root->val);

       if(root->right!=nullptr) {
           XXX(root->right);
       }
       
    return ans;
    }
};

