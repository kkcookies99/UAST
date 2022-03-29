class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == nullptr) return 0;
        else if(root->left != nullptr && root->right != nullptr){
            return min(XXX(root->left), XXX(root->right)) + 1;
        }
        else if(root->left != nullptr && root->right == nullptr) return XXX(root->left) + 1;
        else if(root->right != nullptr && root->left == nullptr) return XXX(root->right) + 1;
        else if(root->left == nullptr && root->right == nullptr) return 1;
        return 0;
    }
};

