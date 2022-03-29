 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode* list=new ListNode(0);
        ListNode* curList=list;
        int jinwei=0;
        while(l1!=NULL||l2!=NULL)
        {
            if(l1->next != NULL || l2->next != NULL )
            {
                ListNode* newList=new ListNode(0);
                curList->next=newList;
            }
            
            if(jinwei>0)
            {
                curList->val=(l1->val+l2->val)+1;
                jinwei=0;
            }
            else{
                curList->val=(l1->val+l2->val);
            }
            if(curList->val>9)
            {
                curList->val=(curList->val)%10;
                jinwei++;
            }
            l1=l1->next;
            l2=l2->next;
            curList=curList->next;
        }
        if(jinwei!=0)
        {
            ListNode* lastList=new ListNode(1);
            curList=lastList;
        }
        return list;
    }
};

