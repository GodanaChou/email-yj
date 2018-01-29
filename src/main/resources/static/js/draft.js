function checkall(obj) {
    var all = document.getElementById('all');
    var check = document.getElementsByName(obj);
    console.log(check.length);
    if (all.checked) {
        for (var i = 0; i < check.length; i++) {
            check[i].checked = true;
        }
    } else {
        for (var i = 0; i < check.length; i++) {
            check[i].checked = false;
        }
    }
}

function change(){
    window.location.href = 'read1.html';
}