 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        if(!head||!head->next) return nullptr;
        ListNode *slow=head,*fast=head;//slow找被删的前一个
        int c=0;
        while(fast){
            fast=fast->next;
            if(c>n){
                slow=slow->next;
            } 
            c++; 
            if(c+1==n&&!fast->next){//删的是第一个
                head=head->next;
                return head;
            }
        }
        slow->next=slow->next->next;
        return head;
    }
};

