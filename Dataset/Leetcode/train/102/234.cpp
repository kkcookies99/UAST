class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        int last=1;//记录每一层的最后一个节点
        int rear=0,front=0;//队头队尾
        vector<TreeNode*> Q;//初始化队列
        Q.push_back(root);//
        rear++;
        TreeNode *p =NULL;
        vector<vector<int>> res;
        vector<int> levelNodes; //定义记录每层元素的数组
        if(!root)return res;
        while(rear!=front){
            p=Q[front++];
            levelNodes.push_back(p->val);
            if(p->left){
                 Q.push_back(p->left);
                 ++rear;
            }
            if(p->right){
                 Q.push_back(p->right);
                  ++rear;
            }
            if(front==last){//当遍历到每一层的最后一个节点，把层记录清空，然后当前的rear一定是下一层的最后一个节点
                res.push_back(levelNodes);
                last =rear;
                levelNodes.clear();
            }
        }
        return res;
    }
};

