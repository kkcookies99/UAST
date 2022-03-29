 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *start=new ListNode(-1,head);
        ListNode* q=start,*tmp=start;
        for(int i=0;i<n;i++)q=q->next;
        while(q->next){
            q=q->next;
            tmp=tmp->next;
        }
        tmp->next=tmp->next->next;
        return start->next;
    }
};

