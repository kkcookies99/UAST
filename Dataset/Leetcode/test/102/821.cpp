 class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        if(!root)return vector<vector<int>>();
        vector<vector<int>> ret;
        vector<int> temp;
        TreeNode* t;
        queue<TreeNode*> que;
        int prek=1,k=0;
        que.push(root);
        while(!que.empty())
        {
            t=que.front();
            que.pop();
            temp.push_back(t->val);
             if(t->left)
            {
                k++;que.push(t->left);
            }
            if(t->right)
            {
                k++;que.push(t->right);
            }
            if(!--prek){
                ret.push_back(temp);
                temp=vector<int>();
                prek=k;
                k=0;
            }
        }
        return ret;
    }
};

