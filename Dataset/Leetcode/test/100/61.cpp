 class Solution {
public:
    //递归
    //结束条件：其中一个为空，看另一个是否为空
    //递归过程：都不为空时先比较当前两个节点值是否相同，若不同则返回false，若必须两个节点的左右子树都相同才能满足要求。
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p == NULL)
            return !q;
        else if(q == NULL)
            return !p;
        else{
            if(p->val == q->val)
                return XXX(p->left, q->left) && XXX(p->right, q->right); 
            else return false;
        }
        
        
    }
};

