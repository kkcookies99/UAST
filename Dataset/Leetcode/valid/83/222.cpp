class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(!head || !head->next) return head;
        if(head->val!=head->next->val){
            head->next=XXX(head->next);
        }else{
            ListNode* move=head;
            while(move->next && move->val==move->next->val){
                move=move->next;
            }
            head->next=XXX(move->next);
        }
        return head;
    }
};

