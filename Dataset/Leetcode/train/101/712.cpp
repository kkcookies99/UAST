 class Solution {
public:
    bool XXX(TreeNode* root) {
        return helper(root, root);
    }

    bool helper(TreeNode* node1, TreeNode* node2){
        if(!node1 && !node2)
            return true;
        if(!node1 || !node2)
            return false;
        if(node1->val != node2->val)
            return false;
        return helper(node1->left, node2->right) && helper(node1->right, node2->left);
    }
};

