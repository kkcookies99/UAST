class Solution {
public:

    vector<vector<int>> ans;

    void assign(TreeNode* root){
        
        queue<TreeNode*> nodes;
        nodes.push(root);
        while(!nodes.empty()){
            vector<int> tmp;
            int len = nodes.size();

            for(int i =0;i < len;i++){

                auto elem = nodes.front();
                tmp.push_back(elem->val);
                if(elem->left)
                    nodes.push(elem->left);
                if(elem->right)
                    nodes.push(elem->right);
                nodes.pop();
            }
            ans.push_back(tmp);
        }
    }

    vector<vector<int>> XXX(TreeNode* root) {
        if(!root) return{};
        assign(root);
        return ans;

    }
};

