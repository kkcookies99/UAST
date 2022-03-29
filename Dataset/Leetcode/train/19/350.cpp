 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *node1,*node2,*node3;
        node1=node2=node3=head;
        for(int i=1; i<n;i++){
            node2=node2->next;
        }
        while(node2->next!=NULL){
            node2=node2->next;
            node3=node1;
            node1=node1->next;
        }
        if(node3==node1){//delete head node
            node1=node1->next;
            delete node3;
            return node1;
        }else{ //not head node
            node3->next=node1->next;
            delete node1;
            return head;
        }
    }
};

