 class Solution {
public:
    bool equal(TreeNode* L,TreeNode* R){
        if(L==nullptr&&R ==nullptr)//都为空,相等
            return true;
        else if(L==nullptr||R==nullptr){//有一个不为空,不相等
            return false;
        }else if(L->val!=R->val){//都不为空,但是值不相等
            return false;
        }else {
            return equal(L->left,R->right)&&(equal(L->right,R->left));//递归比较 左孩子的左孩子==右孩子的右孩子&&左孩子的右孩子==右孩子的左孩子;
        }
    }
    bool XXX(TreeNode* root) {
        if(root==nullptr){//只有一个根节点,当然对称
            return true;
        }
        else return equal(root->left,root->right);
    }
};

