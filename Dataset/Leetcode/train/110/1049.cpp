 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == NULL)
            return true;
        if(abs(NodeHeight(root->left) - NodeHeight(root->right)) > 1)
            return false;
        else
            return XXX(root->left) && XXX(root->right);
    }
    
    int NodeHeight(TreeNode* node){
        if(node == NULL)
            return -1;
        return max(NodeHeight(node->left), NodeHeight(node->right)) + 1;
    }
};

