 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(NULL == root) return true;
        queue<TreeNode*> l, r;

        //将左右子树根节点放入队列中
        if(root->left) l.push(root->left);
        if(root->right) r.push(root->right);

        //检查左右子树的镜像关系
        while(!l.empty() && !r.empty())
        {
            int size = l.size();
            if(r.size() != size) return false;
            while(size-- > 0)
            {
                if(l.front()->val != r.front()->val)
                    return false;
                if((l.front()->left && !r.front()->right) ||
                   (!l.front()->left && r.front()->right) ||
                   (l.front()->right && !r.front()->left) ||
                   (!l.front()->right && r.front()->left))
                   return false;
                if(l.front()->left && r.front()->right)
                {
                    l.push(l.front()->left);
                    r.push(r.front()->right);
                }
                if(l.front()->right && r.front()->left)
                {
                    l.push(l.front()->right);
                    r.push(r.front()->left);
                }
                l.pop();
                r.pop();
            }
        }

        return l.empty() && r.empty();
    }
};

