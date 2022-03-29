class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) 
    {
        if(root==nullptr)
        return {};
        vector<vector<int>> ans;//每层节点值
        vector<TreeNode*> cur{root};//当前层节点
        while(!cur.empty())//当前层还有值
        {
            vector<int> curval;//当前节点值
            vector<TreeNode*> next;//下一层节点
            for(auto &i:cur)//遍历当前层节点
            {
                curval.push_back(i->val);
                if(i->left!=nullptr)
                {
                    next.push_back(i->left);
                }
                if(i->right!=nullptr)
                {
                    next.push_back(i->right);
                }
            }
            ans.push_back(curval);
            cur=next;//遍历下一层
        }
        return ans;
    }
};

