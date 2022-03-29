 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root==nullptr)
        return false;
        return Aux_XXX(root,sum);
    }

    bool Aux_XXX(TreeNode* node,int sum )
    {
        if(node==nullptr)
          return false;
        if(node->left==nullptr && node->right==nullptr && sum==node->val)
          return true;
        bool left=Aux_XXX(node->left,sum-node->val);
        bool right=Aux_XXX(node->right,sum-node->val);
        return left || right;       
    }
};

