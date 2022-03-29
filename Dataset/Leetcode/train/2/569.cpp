 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
       ListNode* ans=new ListNode();
       ListNode* res=new ListNode();
       ans=res;
       bool plusone_flag=false;
       while(l1!=nullptr||l2!=nullptr)
       {
           int add_num=0;
           bool next_plus_one_flag=false;
           if(l1!=nullptr&&l2!=nullptr)
           {
               add_num=(l1->val+l2->val)%10;
                if(l1->val+l2->val>9)next_plus_one_flag=true;
               l1=l1->next;
               l2=l2->next;
           }
           else if(l1==nullptr&&l2!=nullptr)
           {
               add_num=l2->val;
                l2=l2->next;
           }
           else if(l1!=nullptr&&l2==nullptr)
           {
               add_num=l1->val;
               l1=l1->next;
           }
           if(plusone_flag==true&&add_num==9)
           {
               res->val=0;
               plusone_flag=true;
           }
           else if(plusone_flag==true&& add_num<9){
               res->val=add_num+1;
               plusone_flag=false;
           }
           else
           {
               res->val=add_num;
           }
           if(next_plus_one_flag)plusone_flag=true;
           ListNode* node=new ListNode();
           if(l1!=nullptr||l2!=nullptr)
           {
            res->next=node;
            res=res->next;
           }
           if(l1==nullptr&&l2==nullptr&&plusone_flag==true)
           {
                ListNode* node=new ListNode();
                node->val=1;
                res->next=node;
           }
       }
       return ans;
    }
};

