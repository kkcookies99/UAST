class Solution {
public:
class leaf
{
    public:
        int v;
        TreeNode *lef;
};
public:
    vector<vector<int>> XXX(TreeNode* root) {
        int c=0;//记录层数
        vector<vector<int>>tree(0);
        if(root==NULL)
        return tree;
        tree.resize(tree.size()+1); 
        queue<leaf>Q;
        leaf s;
        s.lef=root;
        s.v=0;
        Q.push(s);
        while(!Q.empty())
        {
            int k=c;
            tree[Q.front().v].resize(tree[Q.front().v].size());//加空间
            tree[Q.front().v].push_back(Q.front().lef->val);//加入该层数组
            if(Q.front().lef->left!=NULL)//左孩子不为空入队
            {
                leaf s;
                s.v=Q.front().v+1;
                s.lef=Q.front().lef->left;
                Q.push(s);//赋值孩子入队
                if(s.v>k)
                k=s.v;
            }
            if(Q.front().lef->right!=NULL)//左孩子不为空入队
            {
                leaf s;
                s.v=Q.front().v+1;
                s.lef=Q.front().lef->right;
                Q.push(s);//赋值孩子入队
                if(s.v>k)
                k=s.v;
            }
            Q.pop();
            if(k>c)
            {
               tree.resize(tree.size()+1); 
               c=k;
            }
        }
        return tree;
    }
};

