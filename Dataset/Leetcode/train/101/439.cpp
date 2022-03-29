 class Solution {
public:
    bool res;
    //层序遍历
    bool XXX(TreeNode* root) {
        if(root==nullptr) return true;//空树竟然要求返回true
        res=true;
        TreeNode* lf=root->left;
        TreeNode* rt=root->right;
        dfs(lf,rt);
        return res;
    }
    void dfs(TreeNode* root1,TreeNode* root2){//根结点的左右子节点同时dfs,不过dfs的左右子树不同
        if(res==false||root1==nullptr&&root2==nullptr) return;//结束条件
        if(root1==nullptr||root2==nullptr||root1->val!=root2->val) res=false;//如果此时某个节点为空时,或两个值都存在但不相等时
        // else if(root1->val!=root2->val) res=false;
        else {
            dfs(root1->left,root2->right);
            dfs(root1->right,root2->left);
        }
    }


};code block

