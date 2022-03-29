 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)
            return true;
        return CheckBalance(root)>=0;
    }
    int CheckBalance(TreeNode* root){
        if(!root)return 0; //空结点，说明到达底部，返回高度0
        int Lh=CheckBalance(root->left);//检查左子树高度
        if(Lh<0)//高度是否满足，负数相当于false，继续返回
            return Lh;
        int Rh=CheckBalance(root->right);//检查右子树高度
        if(Rh<0)//负数为false，直接返回
            return Rh;
        //左右子树都满足高度合法，检查当前根节点是否满足
        if(abs(Lh-Rh)<2)
            return max(Lh,Rh)+1;//满足，返回新的高度
        else
            return -1;//不满足，返回负数相当于false
    }
};

