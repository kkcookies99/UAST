class Solution {
public:
    int max=0;                      //存储最大层数
    int XXX(TreeNode* root) {
        if(root==nullptr) return 0; //空树返回0
        return XXX(root,0);
    }
    int XXX(TreeNode* root,int lev) {
        if(root==nullptr){          //递归出口
            if(lev>max)max=lev;     //与最大层数作比较
            return 0;
        }
        lev++;                      //层数加1
        XXX(root->left,lev);   //左子树递归
        XXX(root->right,lev);  //右子树递归
        return max;
    }
};

