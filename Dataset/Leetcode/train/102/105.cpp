class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        if(!root) return {};
        vector<vector<int>> res;
        queue<TreeNode*> que;
        que.push(root);
        while(!que.empty())
        {
            vector<int> vec;
            for(int i = que.size(); i > 0; i--)
            {
                TreeNode* temp = que.front();
                vec.push_back(temp->val);
                if(temp->left) que.push(temp->left);
                if(temp->right) que.push(temp->right);
                que.pop();
            }
            res.push_back(vec);
        }
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


