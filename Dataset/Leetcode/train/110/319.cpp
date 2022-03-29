class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == nullptr)
            return true;
        return (abs(Depth(root->left) - Depth(root->right)) <= 1) && XXX(root->left) && XXX(root->right);
    }

    int Depth(TreeNode* node){
        return node? max(Depth(node->left), Depth(node->right)) + 1 : 0;
    }
};

