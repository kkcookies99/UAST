class Solution {
public:
    ListNode* XXX(ListNode* head) {
        auto p=head;
        while(p){
            auto q=p->next;
            while(q&&q->val==p->val) q=q->next;
            if(p->next==q) p=p->next;
            else p->next=q;
        }
      return head;
    }
};

