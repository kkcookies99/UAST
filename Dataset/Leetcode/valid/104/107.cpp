class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == NULL){ //空节点的子节点深度为0
            return 0;
        }else{
            return (1 + max(XXX(root->left),XXX(root->right)));

        }

    }
};

