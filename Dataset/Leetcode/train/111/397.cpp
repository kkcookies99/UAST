class Solution {
public:
    int XXX(TreeNode* root) {

        if(root == NULL) return 0;
        if(root->left ==NULL && root->right == NULL) return 1;
        if(root->left !=NULL && root->right == NULL) return XXX(root->left)+1;
        if(root->right!=NULL && root->left == NULL) return XXX(root->right)+1;
        if(root->right!=NULL && root->left != NULL) return min(XXX(root->left),XXX(root->right))+1;
    return 1;
//关于递归 一个评论老哥 这么说 你不用关心总的过程多么复杂，你只需要关注这一次的过程，和递归结束的条件---- 至于多么复杂的过程，计算机来完成
//时间开始于13.34 结束于13.43
//有两点需要注意：1 既然是int函数 最下面返回值； 2 这里注意要+1 因为算上root根结点
    }
};


