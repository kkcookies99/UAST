 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(root==nullptr) return false;
        return dfs(root,targetSum);

    }
    bool dfs(TreeNode* root,int targetSum)
    {
        if(root->left==nullptr&&root->right==nullptr)  //终止条件为叶节点
        {
            sum+=root->val;
            cout<<sum<<endl;
            if(sum!=targetSum)
                return false;
            else
                return true;
        }
        sum+=root->val;
        bool a=false,b=false;
        if(root->left)//递归加回溯，返回原始值
        {
            a=dfs(root->left,targetSum);
            sum-=root->left->val;
        }
        if(root->right)
        {
            b=dfs(root->right,targetSum);
            sum-=root->right->val;
        }
        return a||b;
    }
private:
    int sum=0;
}; 

