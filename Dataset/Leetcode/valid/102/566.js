var XXX = function(root) {
    let res = [];
    let table = [];
    table.push(root);
    while(root && table.length){
        let len = table.length;
        let item = [];
        for(let i = 0; i < len; i++){
            let tmp = table.shift();
            item.push(tmp.val);
            tmp.left && table.push(tmp.left);
            tmp.right && table.push(tmp.right);
        }
        res.push(item);
    }
    return res;
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


