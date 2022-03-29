 class Solution {
public:

    bool compaire(TreeNode* node1, TreeNode* node2){
        if(node1==nullptr && node2==nullptr) return 1;
        if(node1==nullptr || node2==nullptr) return 0;
        if(node1->val != node2->val) return 0;
        if(node1->val == node2->val) return 1;
        return compaire(node1->left, node2->right) && compaire(node1->right, node2->left);
    }

    bool XXX(TreeNode* root) {
        if(root==nullptr) return 1;
        return compaire(root->left,root->right);
    }
};

