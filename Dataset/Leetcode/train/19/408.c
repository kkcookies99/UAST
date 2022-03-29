 struct ListNode* XXX(struct ListNode* head, int n){
    struct ListNode* fast=head;  
    struct ListNode* slow=head;
    struct ListNode* a=head;
    //快指针先走n-1步
    for(int i=0;i<n-1;i++)
        fast=fast->next;
    while(fast->next != NULL){       //快慢指针同时前进
        slow=slow->next;
        a=fast;                      //a指向快指针的前驱节点
        fast=fast->next;
    }
    //此时slow指向要删除的节点
    if(slow==head){                  //如果删除第一个节点
        head=slow->next;
    }else if(slow->next==NULL){      //如果删除最后一个节点
        a->next=NULL;
    }else{                           //如果删除中间节点
        slow->val=slow->next->val;
        slow->next=slow->next->next;
    }
    return head;
}

