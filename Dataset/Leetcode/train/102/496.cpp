class Solution {
public:
    queue<pair<TreeNode*, int> > que;
    vector<vector<int> > tong;
    vector<vector<int>> XXX(TreeNode* root) {
        if(!root) return {};
        for(int i = 0; i < 1000; i++){
            tong.push_back({});
        }
        que.push(make_pair(root, 0));
        int max_rank = 0;
        while(!que.empty()){
            pair<TreeNode*, int> node = que.front();
            TreeNode* tree = node.first;
            int rank = node.second;
            tong[rank].push_back(tree->val);
            max_rank = max_rank > rank ? max_rank : rank;
            que.pop();
            if(tree->left) que.push(make_pair(tree->left, rank + 1));
            if(tree->right) que.push(make_pair(tree->right, rank + 1));
        }    
        vector<vector<int> > res;
        for(int i = 0; i <= max_rank; i++){
            vector<int> tmp;
            for(auto t : tong[i]){
                tmp.push_back(t);
            }
            res.push_back(tmp);
        }
        return res;
    }
};

