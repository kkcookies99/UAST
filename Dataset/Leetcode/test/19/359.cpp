 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode*root=new ListNode(),*quick,*slow;
        root->next=head,quick=root,slow=root;
        for(int i=0;i<n;i++)
            quick=quick->next;
        while(quick->next)
            quick=quick->next,slow=slow->next;
        quick=slow->next->next,slow->next=quick;
        return root->next;
    }
};

