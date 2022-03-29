 var XXX = function(s) {
    let longSubstring = "";
    let len = 0;
    let substring = "";
    for(let i = 0;i < s.length;i++){
        if(!substring.includes(s.charAt(i))){
            substring += s.charAt(i);
        } else {
            if(len < substring.length){
                longSubstring = substring;
                len = longSubstring.length;
                substring = s.charAt(i);
            }
        }
    }
    if(substring.length > longSubstring.length){
        longSubstring = substring;
        len = longSubstring.length;
    }
    return len;
};
XXX("dvdf");

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

