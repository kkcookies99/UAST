class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int> > ans;
        if (!root) return ans;
        queue<pair<TreeNode*,int> > que;
        que.push(pair(root,0));
        while(!que.empty())
        {
            int level = que.front().second;
            vector<int> temp;
            while ( level == que.front().second )
            {
                temp.push_back(que.front().first->val);
                if ( que.front().first->left!=NULL) que.push(pair(que.front().first->left, level+1));
                if ( que.front().first->right!=NULL) que.push(pair(que.front().first->right, level+1)); 
                que.pop();
            }       
            ans.push_back(temp);
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


