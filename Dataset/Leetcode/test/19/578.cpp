 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        int count=0;
        ListNode* first=head;
        while(first!=nullptr){
            count++;
            first=first->next;
        }
        if(count==1)return nullptr;
        ListNode* second=head;
        int times=count-n-1;
        if(times==-1)return head->next;
        while(times--){
            second=second->next;
        }
//        cout<<second->val<<endl;
        
        second->next=second->next->next;
        return head;

    }
};

