 class Solution {
public:
    bool XXX(TreeNode* root)
    {
        if(!root) return true;
        deque<TreeNode*> q;
        q.push_back(root);
        while(!q.empty())
        {
            int qs=q.size(), cnt=0;
            for(int i=0; i<qs; i++)
            {
                TreeNode* tp = q.front();
                q.pop_front();
                // 用虚拟节点代替空节点
                if(tp->left) q.push_back(tp->left);
                else {q.push_back(new TreeNode(INT_MAX)); cnt++;}
                if(tp->right) q.push_back(tp->right);
                else {q.push_back(new TreeNode(INT_MAX)); cnt++;}
            }
            // 如果到了最底层未发现不对称，返回true
            if(cnt==2*qs) return true;
            auto l=q.begin(), r=q.end(); r--;
            // 双指针迭代判断对称性
            while(r>l)
            {
                if((*l)->val != (*r)->val) return false;
                else {l++; r--;}
            }
        }
        return true;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


