 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res ;
        if(root==NULL){
            return res;
        }
        if(root->left!=NULL)
        {
            vector<int> left=XXX(root->left);
            res.insert(res.end(),left.begin(),left.end());
        }


        res.push_back(root->val);

        if(root->right!=NULL)
        {
        vector<int> right=XXX(root->right);
        res.insert(res.end(),right.begin(),right.end());
        }
        return res;
    }
};

