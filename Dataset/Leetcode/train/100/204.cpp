 class Solution {
public:
    
    // 递归法：
    // 1.确定函数的入参及返回值
    bool XXX(TreeNode* p, TreeNode* q) {
        // 2.确定函数的递归终止条件
        if(p == nullptr && q != nullptr) return false;
        else if(p != nullptr && q == nullptr) return false;
        else if(p == nullptr && q == nullptr) return true;
        else if(p->val != q->val) return false;

        // 3.确定单层递归逻辑
        bool left = XXX(p->left, q->left);
        bool right = XXX(p->right, q->right);
        bool result = left && right;

        return result;
    }
    
    // 迭代法：
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p == nullptr && q == nullptr) return true;
        queue<TreeNode*> que;
        que.push(p);
        que.push(q);

        while(!que.empty()) {
            TreeNode* tr1 = que.front();
            que.pop();

            TreeNode* tr2 = que.front();
            que.pop();

            if(!tr1 && !tr2) continue;
            if((!tr1 || !tr2 || (tr1->val != tr2->val))) return false;

            que.push(tr1->left);
            que.push(tr2->left);
            que.push(tr1->right);
            que.push(tr2->right);
        }
        return true;
    }

};

