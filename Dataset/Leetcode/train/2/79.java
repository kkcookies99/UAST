class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode l = dummyHead;
        while(l1!=null && l2!=null){
            int val = l1.val + l2.val;
            if(val>=10){
                if(l.next==null){
                    l.next = new ListNode(val%10,new ListNode(1));
                }else{
                    l.next.val += val%10;
                    l.next.next = new ListNode(1);
                }
                 l = l.next;
            }else{
                if(l.next==null){
                    l.next = new ListNode(val);
                }else{
                    int temp = l.next.val+val;
                    if(temp>=10){
                        l.next.val = temp%10;
                        l.next.next = new ListNode(1); 
                    }else{
                        l.next.val = temp;
                    }
                }
                l = l.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l2!=null){
           if(l.next==null){
               l.next = l2;
           }else{
                while(l2!=null){
                int temp = l.next.val+l2.val;
                if(temp>=10){
                    l.next.val = temp%10;
                    l.next.next = new ListNode(1);
                    l = l.next;
                }else{
                    l.next.val = temp;
                    l.next.next = l2.next;
                    break;
                }
                l2 = l2.next;
            }
           }
        }else{
             if(l.next==null){
               l.next = l1;
           }else{
                while(l1!=null){
                int temp = l.next.val+l1.val;
                if(temp>=10){
                    l.next.val = temp%10;
                    l.next.next = new ListNode(1);
                    l = l.next;
                }else{
                    l.next.val = temp;
                    l.next.next = l1.next;
                    break;
                }
                l1 = l1.next;
            }
           }
        }
        return dummyHead.next;
    }

undefined
document.getElementsByTagName("code");

HTMLCollection(16) [code, code, code.language-go, code.language-cpp, code, code.language-c++, code.language-reasonml, code, code, code, code.language-reasonml, code.language-java, code, code, code, code.language-reasonml]
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

