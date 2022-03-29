class Solution {
public:
    int XXX(TreeNode* root) {

        if(!root) return 0;

        queue<TreeNode*> q; //辅助队列,实现层序遍历
        TreeNode* temp;//记录临时弹出的节点
        int depth = 1; //记录层数
        int size = 0;//记录该层的节点数
        
        q.push(root);
        while(!q.empty()){
            size = q.size();
            while(size-->0){
                temp = q.front();
                q.pop(); //弹出队头元素

                //层序遍历找到第一个叶子节点,直接返回
                if(!temp->left && !temp->right) return depth;
                //插入左右孩子
                if(temp->left) q.push(temp->left);
                if(temp->right) q.push(temp->right);

            }
            depth++;
        }
        return depth;
    }
};

