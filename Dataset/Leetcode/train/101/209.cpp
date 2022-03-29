 class Solution {
public:
    bool XXX(TreeNode* root) {
        return retFun(root, root);
    }

    bool retFun(TreeNode* &node1, TreeNode* &node2){
            if (!node1 || !node2) {
                return (node1 == node2)? true : false;
            }else if (node1->val != node2->val) {
                return false;
            } else {
                return retFun(node1->left, node2->right) &&
                    retFun(node1->right, node2->left);
            }
        }
};


