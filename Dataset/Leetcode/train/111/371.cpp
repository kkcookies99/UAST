class Solution {
public:
    int XXX(TreeNode* root) {
        if(root==nullptr) return 0;
        queue<TreeNode*>que;
        que.push(root);
        int depth=1;
        while(not que.empty()){
            auto size=que.size();
            for(int i=0;i<size;i++){
                auto tmp=que.front();que.pop();
                if(tmp->left==nullptr and tmp->right==nullptr) return depth;
                if(tmp->left) que.push(tmp->left);
                if(tmp->right) que.push(tmp->right);
            }
            depth++;
        }
        return depth;
    }
};

