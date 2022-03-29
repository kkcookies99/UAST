class Solution {
public:
    //自底向上
    int fin(TreeNode* t)
    {
        if(t==nullptr) return 0;
        int left=fin(t->left);
        int right=fin(t->right);
        if(left==-1||right==-1||fabs(left-right)>=2)//只要有一个不满足，每次都返回-1
            return -1;
        return 1+max(left,right);//返回每个节点的深度
    }
    bool XXX(TreeNode* root) {
        return fin(root)>=0;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


