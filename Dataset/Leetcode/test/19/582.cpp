 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        //快慢指针
        auto p=head,q=head;
        int k=0;
        while(k++<n&&p)p=p->next;
        if(!p)return head->next;
        while(p->next){
            p=p->next;
            q=q->next;
        }
        q->next=q->next->next;
        return head;
    }
};

