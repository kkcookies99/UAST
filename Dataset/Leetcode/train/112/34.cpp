class Solution {
public:
    void dfs(TreeNode * root, vector<int>&result,int sum){
        sum += root->val;
        if(!root->left && !root->right){    //如果是叶子节点
            result.push_back(sum);
            return;
        }
        if(root->left)
            dfs(root->left, result,sum);
        if(root->right)
            dfs(root->right,result,sum);
    }
    bool XXX(TreeNode* root, int targetSum) {
        if(!root)
            return false;
        vector<int> cur;
        int sum = 0;
        dfs(root,cur,sum);
        for(int a : cur){
            if(a == targetSum)
                return true;
        }
        return false;
    }
};

