 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root){
            return true;
        }
        vector<TreeNode*>que;
        que.emplace_back(root);
        while(!que.empty()){
            int len=que.size();
            for(int i=0;i<len/2;i++){
                if(!que[i]&&!que[len-1-i]){
                    continue;
                }else if(que[i]&&que[len-i-1]&&que[i]->val==que[len-i-1]->val){
                    continue;
                }else{
                    return false;
                }
            }
            for(int i=0;i<len;i++){
                if(que[0]){
                    que.emplace_back(que[0]->left);
                    que.emplace_back(que[0]->right);
                }
                que.erase(que.begin());
            }
        }
        return true;
    }
};

