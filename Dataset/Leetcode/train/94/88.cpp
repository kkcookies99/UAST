 class Solution {
public:
    void inorder(TreeNode*root,vector <int> & res) 
    {
        if (root!=nullptr) return;
        inorder (root->left,res);
        res.push_back(root->val);
       inorder(root->right,res);

    }
   vector<int> XXX(TreeNode* root) {
        vector <int> vec;
        inorder(root,vec);
        return vec;
    }
};

