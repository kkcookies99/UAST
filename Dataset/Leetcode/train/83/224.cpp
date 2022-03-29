class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head==nullptr) return nullptr;
        auto nptr=head;
        while(nptr->next){
            if(nptr->val==nptr->next->val)
            {
                nptr->next=nptr->next->next;
            }
            else
            {
                nptr=nptr->next;
            }
        }
        return head;
    }
};

