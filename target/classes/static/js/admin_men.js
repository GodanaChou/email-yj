var change = function(ids, cls) {
    var box = document.getElementById(ids);
    var lis = box.getElementsByTagName('a');

    for (var i = 0; i < lis.length; i++) {
        lis[i].onclick = function() {
            for (var i = 0; i < lis.length; i++) {
                lis[i].className = "";
            }
            this.className = cls;
        }
    }
}
change('box1', 'click');
