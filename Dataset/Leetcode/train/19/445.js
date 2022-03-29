 var XXX = function(head, n) {
    let count = 0,newHead = new ListNode(0, head)
    function helper(node){
        if (node.next === null) {            
            return node
        }        
        next = helper(node.next)        
        count += 1 
        if(count == n) {
            node.next = next.next
        }         
        return node     
    }    
    return helper(newHead).next    
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


