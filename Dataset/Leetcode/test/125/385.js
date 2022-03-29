 var XXX = function(s) {
    s = s.replace(/[^a-zA-Z0-9]/g,'').toLocaleLowerCase()
    return s === s.split('').reverse().join('');
};

