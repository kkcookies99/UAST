class Solution {
public:
    int XXX(TreeNode* root) {
        return getMinDepth(root);
    }

    int getMinDepth(TreeNode* node){
        if(node == NULL) return 0;
        if(node->left == NULL && node->right == NULL) return 1;
        int i = getMinDepth(node->left);
        int j = getMinDepth(node->right);
        if(i != 0 && j != 0){
            return i > j ? j+1 : i+1;
        }else{
            return i != 0 ? i+1 : j+1;
        }
    }
};

