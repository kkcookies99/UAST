 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        // 非递归版本，使用栈存，栈能模拟dfs
        stack<TreeNode*> st;
        vector<int> res;
        auto cur = root;
        while(cur || st.size())
        {
            while(cur)
            {
                st.push(cur);
                cur = cur->left;
            }
            if (st.size())
            {
                cur = st.top();
                res.push_back(cur->val);
                st.pop();
                cur = cur->right;
            }
        }

        return res;
    }
};

