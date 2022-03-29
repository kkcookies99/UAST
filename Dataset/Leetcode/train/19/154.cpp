 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        vector<ListNode*> Ptrs;
        ListNode *dummy = new ListNode(-1);
        dummy->next = head;
        Ptrs.push_back(dummy);
        for(ListNode *tmp = head;tmp != NULL; tmp = tmp->next){
            Ptrs.push_back(tmp);
        }
        Ptrs.push_back(nullptr);
        int pos = Ptrs.size()-n-1;
        Ptrs[pos-1]->next =Ptrs[pos+1]; 
        return dummy->next;
        
    }
};

