class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode* p = head;
        map<int,bool> m;
        while(head && head->next){
            m[head->val] = true;
            if(m.find(head->next->val)!=m.end()){//存在
                head->next = head->next->next;
            }
            else{
                head=head->next;
            }
        }
        return p;
    }
};

