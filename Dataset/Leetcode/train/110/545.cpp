class Solution {
public:
    int search(TreeNode *node, bool &flag){
        if(!node){
            return 0 ;
        }
        int l = search(node->left, flag);
        int r = search(node->right, flag);
        if(abs(l - r) > 1){
            flag = false;
            return 0;
        }
        return max(l ,r) + 1;
    }
    bool XXX(TreeNode* root) {
        if(!root){
            return true;
        }
        bool result = true;
        search(root, result);
        return result;
    }
};

