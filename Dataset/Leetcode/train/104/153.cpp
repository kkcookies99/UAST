class Solution {
public:
    int XXX(TreeNode* root) {
        return deep(root,0);
    }
    int deep(TreeNode* root, int a){
        if(!root){
            return 0;
        }
        a++;
        return max(a,max(deep(root->left,a),deep(root->right,a)));
    }
};

