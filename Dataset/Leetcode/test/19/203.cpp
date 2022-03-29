 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        if(!head | !head -> next) return NULL;
        ListNode* s=new ListNode(0);
        s->next=head;
        ListNode *fast=s;
        ListNode *slow=s;
        int i=0;
        while(fast){
            if(i>n){
                slow=slow->next;
            }
            fast=fast->next;
            i++;
        }
        slow->next=slow->next->next;
        return s->next;
    }
};

