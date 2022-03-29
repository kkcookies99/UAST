var XXX = function(root) {
    var balance = (root)=>{
        if(!root) return true;
        let leftBalance = balance(root.left);
        let rightBalance = balance(root.rght);
        if( (Math.abs( hight(root.left) - hight(root.right) ) <=1 ) && leftBalance && rightBalance ){
            return true;
        }else{
            return false;
        }
    }
    var hight = (root)=>{
            if(!root) return 0;
            return (1 + Math.max(hight(root.left), hight(root.rght)));
        }
    return balance(root);

};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


