 var XXX = function(s) {
    var S = s.replace(/[^a-zA-Z0-9]/g, '').toLowerCase()
    return S == S.split('').reverse().join('')
};

