 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        if(!root) return res;
        stack<cmd> s;
        s.push(cmd(root,1));
        while(!s.empty()){
            TreeNode *node = s.top().root;
            int state = s.top().count;
            s.pop();
            if(state == 2) res.push_back(node->val);
            else{
                if(node->right) s.push(cmd(node->right,1));
                s.push(cmd(node,2));
                if(node->left) s.push(cmd(node->left,1));
            }
        }
        return res;
    }
private:
    struct cmd{
        TreeNode* root;
        int count;//0表示没有访问，1表示第一次访问，2表示第二次访问，要进行输出
        cmd(TreeNode* node,int count):count(count){
            root = node;
        }
    };
};

