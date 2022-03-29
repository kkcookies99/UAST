 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode *p = head;
        while(p&&p->next)
        {
            if(p->val==p->next->val){
                ListNode* t= p->next;
                p->next = t->next;
                delete t; 
            }
            else
            p = p->next;
        }
        return head;
    }
};

