class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> ans;
        if(root == nullptr){
            return ans;
        }
        queue<pair<TreeNode *,int>> que;
        que.push(make_pair(root,0));
        while(!que.empty()){
            pair<TreeNode *,int> front = que.front();
            que.pop();
            if(ans.size() == front.second){
                ans.resize(front.second + 1);
            }
            ans[front.second].push_back(front.first->val);
            if(front.first->left != nullptr){
                que.push(make_pair(front.first->left,front.second + 1));
            }
            if(front.first ->right != nullptr){
                que.push(make_pair(front.first->right,front.second + 1));
            }
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


