 class Solution {
public:
    ListNode* XXX(ListNode* head) {
    	if(head==NULL) return head;
  		ListNode *p=head->next;
  		ListNode *r,*s;
  		r=head;
  		head->next=NULL;
  		while(p){
  			if(p->val==r->val){
  				p=p->next;
			  }
			  else{
			  	s=p->next;
			  	p->next=r->next;
			  	r->next=p;
                r=p;
			  	p=s;
			  	
			  }
		  }
		  return head;
    }
};

