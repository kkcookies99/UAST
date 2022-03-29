class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> result;   
        TreeNode *p; //接收出队结点
        if(root == NULL)
            return result;
        queue<TreeNode*> Q;
        Q.push(root);
        while(!Q.empty()){      
            vector<int> sub; //每层新建一个数组，存放改层全部结点
            int len = Q.size();
            for(int i = 0; i<len; i++){
                //1、下面两步等同于Dequeue(Q,p);
                p = Q.front(); //返回队头元素
                Q.pop(); //删除队头元素
                //2、出队结点val存入数组:相当于visit(p)
                sub.push_back(p->val);
                //3、左右孩子入队
                if(p->left!=NULL)
                    Q.push(p->left);
                if(p->right!=NULL)
                    Q.push(p->right);
            }//循环访问该层所有结点并加入数组sub
            result.push_back(sub);  
        }
        return result;
    }
};

