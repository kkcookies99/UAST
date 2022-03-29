class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head==nullptr)return nullptr;
        ListNode*p=head;
        ListNode*q=head->next;
        while(q!=NULL){
            if(p->val==q->val){q=q->next;p->next=q;}
            else {p=p->next;q=q->next;}         
        }
        return head;
    }
};

