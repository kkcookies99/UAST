 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        if(head->next==nullptr) 
            return nullptr;
        ListNode *temp=head;
        ListNode *ans=head;
        int count(0);
        while((temp->next)!=nullptr){
            if(count>=n)
                ans=ans->next;
            temp=temp->next;
            count++;
        }
        if(count<n)
            return ans->next;
        else
            ans->next=ans->next->next;
        return head;
    }
};

