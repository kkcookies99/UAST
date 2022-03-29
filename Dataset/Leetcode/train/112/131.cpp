class Solution {
public:
    bool result=false;
    bool XXX(TreeNode* root, int sum) {
        if(!root)return result;
        check_sum(root,sum);
        return result;
    }
    void check_sum(TreeNode *root,int num)
    {
        if(!root)return;
        num-=root->val;
        if(num==0&&!root->left&&!root->right)result=true;
        //这是因为[1,0]情况时还需要走到0结点处,所以直接用else包括=0，但是不是叶子结点的情况
        else {check_sum(root->left,num);check_sum(root->right,num);}
        return;
    }
};

