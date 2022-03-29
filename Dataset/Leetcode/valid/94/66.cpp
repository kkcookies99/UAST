 class Solution {
public:
    vector<int> ans; // 中序, 左中右

    vector<int> XXX(TreeNode* root) {
        if (!root) return ans;
        if (root->left) XXX(root->left);   // left
        ans.push_back(root->val);                       // root
        if (root->right) XXX(root->right); // left
            
        return ans;
    }
};

