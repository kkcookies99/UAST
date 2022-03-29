 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* p=head;
        int sum=0;
        vector<int>ivec;
        while(p){
            sum++;
            p=p->next;
        }
        if(sum==n){
            return head->next;
        }
        if(n>=1 && n<=sum){
            int px=0;
            int len=sum-n+1;
            ListNode* q=head;
            while(q){
                px++;
                if(px!=len){
                    ivec.push_back(q->val);
                }
                q=q->next;
            }
            ListNode* t=head;

            ListNode* pre=head;
            int idx=0;
            for(int i=0;i<ivec.size();i++){
                t->val=ivec[i];
                pre=t;
                t=t->next;
            }
            pre->next=nullptr;
            return head;
        }
        return nullptr;
    }
};

