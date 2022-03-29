 class Solution {
public:
    TreeNode *preNode = NULL;
    bool inOrder(TreeNode *root){
        if(root == NULL) return true;
        bool left = inOrder(root -> left);
        if(preNode != NULL){
            if(root -> val <= preNode -> val){
                return false;
            }
        }
        preNode = root;
        bool right = inOrder(root -> right);
        return left && right;
    }
    bool XXX(TreeNode* root) {
        return inOrder(root);
    }
};

