 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        stack<ListNode*> stk;
        ListNode* phead=new ListNode(0,head);
        ListNode* p=phead;
        while(p){
            stk.push(p);
            p=p->next;
        }
        for(int i=0;i<n;i++){
            stk.pop();
        }
        ListNode* prev=stk.top();
        prev->next=prev->next->next;
        ListNode* ans=phead->next;
        delete phead;
        return ans;
    }   
};

