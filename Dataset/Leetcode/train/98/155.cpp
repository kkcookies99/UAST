 class Solution {
public:
    bool XXX(TreeNode* root) {
        return helper(root,NULL,NULL);
    }
    //返回该结点是否在指定区间内。
    bool helper(TreeNode *node, TreeNode *min, TreeNode *max){
        if(!node) return true;
        if((min && node->val <= min->val) || (max && node->val >= max->val)) return false;
        //左子节点的值不能比当前结点的值大，右节点的值不能不当前结点小。
        return helper(node->left, min, node) && helper(node->right, node, max);
    }
};

