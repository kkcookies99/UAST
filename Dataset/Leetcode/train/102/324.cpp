class Solution {
public:
    vector<vector<int>> nums;           //存储结果
    vector<vector<int>> XXX(TreeNode* root) {
        if(!root){
            return nums;
        }
        queue<TreeNode *> Q;            //二叉树的层次遍历需要借助队列来实现
        TreeNode *p=root,*last=p;       //p指向根节点，last指向当前层的最右结点（初始化时为根节点）
        vector<int> temp;               //存储当前层的元素值
        Q.push(p);                      //根节点入队
        while(!Q.empty()){              //队列非空
            p=Q.front();
            Q.pop(); 
            temp.push_back(p->val);     //出队，并将元素值加入temp中
            if(p->left){                //有左孩子，左孩子入队
                Q.push(p->left);
            }
            if(p->right){
                Q.push(p->right);       //有右孩子，右孩子入队
            }
            
            if(p==last){                //已经到了当前层的最右边一个结点，将temp压入nums中
                nums.push_back(temp);
                temp.clear();           //将temp清空，用于下一次存储
                last=Q.back();          //last指向下层
            }
        }
        return nums;
    }
};

