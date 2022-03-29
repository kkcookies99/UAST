class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        queue<pair<TreeNode* ,int>>myqueue;
        vector<vector<int>>res;
        if(!root)return res;
        myqueue.push(pair<TreeNode*,int>(root,1));
        while(!myqueue.empty()){
            auto temp=myqueue.front();
            if(res.size()<temp.second){
                vector<int>newvec;
                res.push_back(newvec);
            }
            res[temp.second-1].push_back(temp.first->val);
            if(temp.first->left)
            myqueue.push(pair<TreeNode*,int>(temp.first->left,temp.second+1));
            if(temp.first->right)
            myqueue.push(pair<TreeNode*,int>(temp.first->right,temp.second+1));
            myqueue.pop();
        }
        return res;
    }
};

