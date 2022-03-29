class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(!head)   return head;
        ListNode *p = head;
        while(p&&p->next){
            while(p&&p->next&&p->next->val==p->val){
                ListNode *dist = p->next;
                p->next = p->next->next;
                delete dist;
            }
            p = p->next;
        }
        return head;
    }
};

