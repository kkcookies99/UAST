 class Solution {
public:

    void dfsInorder(vector<int> & res, TreeNode* root)
    {
        if(root)
        {
            dfsInorder(res, root->left);
            res.push_back(root->val);
            dfsInorder(res, root->right);
        }
        else
            return;  
    }

    vector<int> lpInorderTraversal(TreeNode* root)
    {
        vector<int> res;
        stack<TreeNode*> s;
        while(!s.empty() || root)
        {
            while(root) //先一直往左遍历，用stack记录根节点，只有前序遍历会遇到就用res记录root的值
            {
                s.push(root);
                root = root->left;
            }
            res.push_back(s.top()->val); //等遍历到叶子节点结束时，再记录根节点的值
            root = s.top()->right;  //然后遍历右孩子
            s.pop();    //弹出一个根节点
        }
        return res;
    }

    vector<int> XXX(TreeNode* root) {
        return lpInorderTraversal(root);
    }
};

