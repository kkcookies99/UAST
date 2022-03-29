class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<int> temp;
        queue<pair<TreeNode*,int>> q;
        int curlevel = 1;
        int prelevel = 1;
        vector<vector<int>> ans;
        if(root == nullptr)
            return {};
        q.push(make_pair(root,1));
        while(!q.empty()){
            root = q.front().first;
            curlevel = q.front().second;
            q.pop();
            if(root->left != nullptr)
                q.push(make_pair(root->left,curlevel+1));
            if(root->right != nullptr)
                q.push(make_pair(root->right,curlevel+1));
            if(curlevel!=prelevel){
                ans.push_back(temp);
                temp.clear();
            }
            temp.push_back(root->val);
            prelevel = curlevel;
        }
        ans.push_back(temp);
        return ans;
    }
};

