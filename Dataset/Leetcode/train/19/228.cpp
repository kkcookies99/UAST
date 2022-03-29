 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* node = head;
        vector<ListNode*> v;
        int len = n;
        while(node){
            v.push_back(node);
            node = node->next;
        }
        if(int(v.size() - n - 1) < 0) return v[v.size() - n + 1]; 
        v[v.size() - n - 1]->next = v[v.size() - n + 1];
        return head;
    }
};

