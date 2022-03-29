 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        queue<int> s1, s2;
        vector<int> v;
        while(l1){
            s1.push(l1->val);
            l1 = l1->next;
        }
        while(l2){
            s2.push(l2->val);
            l2 = l2->next;
        }
        int c = 0;
        while(!s1.empty()&&!s2.empty()){
            int t = s1.front()+s2.front()+c;
            s1.pop();
            s2.pop();
            v.emplace_back(t%10);
            c = t/10;
        }
        while(!s1.empty()){
            int t = s1.front()+c;
            s1.pop();
            v.emplace_back(t%10);
            c = t/10;
        }
        while(!s2.empty()){
            int t = s2.front()+c;
            s2.pop();
            v.emplace_back(t%10);
            c = t/10;
        }
        if(c)v.emplace_back(c);
        ListNode* phead = new ListNode(), *p = phead;
        for( int e:v ){
            ListNode* t = new ListNode(e);
            p->next = t;
            p = t;
        }
        p->next = NULL;
        return phead->next;
    }
};

