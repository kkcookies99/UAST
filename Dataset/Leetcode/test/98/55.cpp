 class Solution {
public:
    bool XXX(TreeNode* root) {
        return validHelper(root, NULL, NULL);
        //如何理解根节点的TreeNode Min/Max == NULL？
        //可以给root节点脑补一个父节点father。root节点可以是父节点的左孩子，因此TreeNode max == father，但father是我们想象出来的，实际上对root->val没有限制作用，因此TreeNode max == NULL。
        //同理，TreeNode min == NULL
    }

    bool validHelper(TreeNode* root, TreeNode* min, TreeNode* max){
        if(root == NULL)return true;
        //root->val应当处在父节点、祖先节点的限制之中
        if(min != NULL && root->val <= min->val)return false;
        if(max != NULL && root->val >= max->val)return false;
        return validHelper(root->left, min, root) && validHelper(root->right, root, max);
    }
};

