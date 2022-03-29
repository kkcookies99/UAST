 class Solution {
public:
    vector<int> XXX(TreeNode* root) 
    {
        vector<int> vec;
        stack<TreeNode*> st;
        TreeNode* cur=root;
        while(cur || st.empty()!=1)
        {
            while(cur)//根节点以及根左边的左子树全部进入栈
            {
                st.push(cur);
                cur=cur->left;
            }
            //取栈顶元素，输出后，删除
            cur=st.top();
            vec.push_back(cur->val);
            st.pop();
            cur=cur->right;//访问该元素的右子树，若存在，则重复以上操作，不存在，则继续取栈顶元素
        }
        return vec;
        
    }
};

