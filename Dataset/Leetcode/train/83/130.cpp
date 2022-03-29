class Solution {
public:
    ListNode* XXX(ListNode* head) {
              ListNode* p=head;
              if(head==NULL)return NULL;
              while(p->next&&p){
                  if(p->val==p->next->val){
                     p->next=p->next->next;
                     continue;
                  }
                  p=p->next;
              }
              return head;
    }
};

