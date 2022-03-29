 class Solution {
public:
//求该节点下的最大深度
    int Maxfunc(TreeNode* root){
        if(root == NULL)
            return 0;
        
        return max(Maxfunc(root->left), Maxfunc(root->right)) + 1; 
        
    }
    
    bool XXX(TreeNode* root) {
// 递归的终止条件，如果该节点为空说明该节点满足要求返回true，否则判断该节点左右子树高度差是否大于一，
// 如果大于一说明该节点不符合要求，直接返回false， 否则继续判断该节点左右子孩子是否满足题目要求。
        if(root == NULL)
            return true;
        //printf("Maxfunc(root) = %d\n", Maxfunc(root->left));
        //printf("Maxfunc(root) = %d\n", Maxfunc(root->right));
        if(abs(Maxfunc(root->left) - Maxfunc(root->right)) > 1)
            return false;
        // 递归的过程
        return XXX(root->left) && XXX(root->right);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


