 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* cur=head;
        vector<ListNode*> A={head};
        while(cur->next!=nullptr)
        {
            A.push_back(cur->next);
            cur=cur->next;
        }
        if(A.size()-n==0)
        {
            head=head->next;
        }
        else
        {
            A[A.size()-n-1]->next=A[A.size()-n]->next;
        }
        return head;
    }
};

