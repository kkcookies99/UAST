class Solution {
public:
    //广度优先遍历
    int XXX(TreeNode* root) {
        if(!root) return 0;
        queue<TreeNode*> qu;
        int nums=1;
        qu.push(root);
        while(!qu.empty())
        {
            int size=0,len=qu.size();
            while(size<len)
            {
                TreeNode* t=qu.front();
                qu.pop();
                if(t==nullptr)
                {
                    size++;
                    continue;
                }
                if(!t->left&&!t->right)
                    return nums;
                qu.push(t->left);
                qu.push(t->right);
                size++;
            }
            nums++;
        }
        return nums;
    }
};

