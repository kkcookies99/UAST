class Solution {
public:
    // 递归定义:判断以当前节点为根节点的树时候是平衡二叉树 
    bool XXX(TreeNode* root) {
        // 空树是平衡二叉树
        if(root==nullptr) return true;
        // 首先判断左右子树是否是平衡二叉树
        if(XXX(root->left) && XXX(root->right)){
            // 再判断根节点的树是否是平衡二叉树
            if(abs(getHigh(root->left)-getHigh(root->right))<=1)
                return true;
        }
        return false;
    }
    // 计算树的高度
    int getHigh(TreeNode* root){
        if(root==nullptr) return 0;
        return max(getHigh(root->left),getHigh(root->right))+1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


