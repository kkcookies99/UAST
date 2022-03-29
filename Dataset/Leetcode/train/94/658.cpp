 class Solution {
public:
    vector<int>result;
    vector<int> XXX(TreeNode* root) {
        if(!root)return {};
        stack<TreeNode *>treestack;
        TreeNode * cur = root;
        while(!treestack.empty() || cur )  //一定要有 || cur 是操作右子树的关键
        {
            while(cur)
            {
                treestack.push(cur);
                cur = cur -> left;
            }
            TreeNode * temp = treestack.top();
            result.push_back(temp->val);
            treestack.pop();
            if(temp -> right)
                cur = temp -> right;
        }
        return result;
    }
};

