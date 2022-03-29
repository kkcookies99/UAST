class Solution {
public:
    int XXX(TreeNode* root) {
       queue<TreeNode*> q;
        vector<int> m;
        q.push(root);
        int a=0;
        if(root==NULL)
            return a;
        while(!q.empty())
        {
            a+=1;
            int num=q.size();
            TreeNode*t;
            for(int i=0;i<num;i++)
            {
                t=q.front();
                q.pop();
                if(t->left!=NULL)
                    q.push(t->left);
                if(t->right!=NULL)
                    q.push(t->right);
                if(t->left==NULL&&t->right==NULL)
                    m.push_back(a);
            }
        }
        int max=m[0];
        for(int i=1;i<m.size();i++)
        {
            if(m[i]>max)
                max=m[i];
        }
        return max;
    }
};

