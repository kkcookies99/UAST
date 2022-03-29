 var XXX = function(s) {
    let len = s.length;
    let st = [];
    for(let i=0; i<len; i++) {
        if(s[i]==='(' || s[i]==='[' || s[i]==='{') {
            st.push(s[i]);
        } else {
            if(s[i]===')'){
                if(st.pop()!=='(') return false;
            }
            if(s[i]===']'){
                if(st.pop()!=='[') return false;
            }
            if(s[i]==='}'){
                if(st.pop()!=='{') return false;
            }
        }
    }
    if(st.length>0)return false;
    return true;
};

