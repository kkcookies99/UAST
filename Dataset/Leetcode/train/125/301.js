 var XXX = function(s) {
    const s1 = s.replace(/[^0-9a-zA-Z]/g,'');
    const s2 = s1.toLocaleLowerCase();
    return s2 == s2.split("").reverse().join("")
};

