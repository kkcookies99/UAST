 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> out;
        if(root == NULL) return out;
        vector<int> left = XXX(root->left);
        vector<int> right = XXX(root->right);
        out.insert(out.end(),left.begin(),left.end()); 
        out.push_back(root->val);
        out.insert(out.end(),right.begin(),right.end());
        return out;
    }
};

