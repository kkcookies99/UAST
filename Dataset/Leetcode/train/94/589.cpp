 class Solution {
public:

    vector<int> XXX(TreeNode* root){
        vector<int> res;
        if(!root) {return res;}
        while(root)
        {
            if(root->left)
            {
                TreeNode* node = root->left;
                while(node->right && node->right != root) {node = node->right;}
                if(!node->right)
                {
                    node->right = root;
                    root = root->left;
                }
                else
                {
                    res.push_back(root->val);
                    node->right = NULL;
                    root = root->right;
                }
            }
            else
            {
                res.push_back(root->val);
                root = root->right;                
            }
        }
        return res;
    }               
};

