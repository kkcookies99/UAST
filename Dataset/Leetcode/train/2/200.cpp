class Solution 
{
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) 
    {
        ListNode* res=new ListNode(NULL);//新建一个空列表
        ListNode* cur=res;//当前指针指向该链表
        int tmp=0;//每次计算的中间结果
        while(l1!=NULL||l2!=NULL)
        {
            if(l1!=NULL) {tmp+=l1->val;l1=l1->next;}
            if(l2!=NULL) {tmp+=l2->val;l2=l2->next;}
            cur->next=new ListNode(tmp%10);
            tmp/=10;
            cur=cur->next;
        }
        if(tmp!=0)//只可能是1
            cur->next=new ListNode(1);
        return res->next;
    }
};

