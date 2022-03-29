class Solution {
public:
    int XXX(TreeNode* root) 
    {
        //层序遍历迭代
        if(root==nullptr)
        return 0;
        vector<TreeNode*> cur{root};//当前层节点
        int dep=0;
        while(!cur.empty())//当前层还有值
        {          
            ++dep;
            vector<TreeNode*> next;//下一层节点           
            for(int i=0;i<cur.size();++i)//遍历当前层节点
            {            
                if(cur[i]->left!=nullptr)
                {
                    next.push_back(cur[i]->left);
                }
                if(cur[i]->right!=nullptr)
                {
                    next.push_back(cur[i]->right);
                }
            }
            cur=next;//遍历下一层
        }      
        return dep;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


