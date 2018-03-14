var time = document.getElementById('time');
var myDate = new Date();
var hours = myDate.getHours();

if (hours <= 12 && hours >= 0) {
    time.innerHTML = "上午好";
} else {
    time.innerHTML = "下午好";
}

/*section鼠标覆盖div改变 --- 函数：section_divChange*/
function section_divChange(obj1, obj2) {
    var ul = document.getElementById(obj1);
    var aa = ul.getElementsByTagName("input");
    var classes = document.getElementsByClassName(obj2);

    for (var i = 0; i < aa.length; i++) {
        ! function(i) {
            aa[i].onclick = function() {
                for (var j = 0; j < aa.length; j++) {
                    classes[j].style.display = "none";
                }
                classes[i].style.display = "block";
            }
        }(i);
    }
}
section_divChange("sec", "content");

function check(id1,id2) {
    var name = document.getElementById(id1).value;
    var message = document.getElementById(id2).value;
    if (name == null || name == '' || message == null || message == '') {
        alert("请填写完整");
        return false;
    }
    alert("修改成功");
    return true;
}
function check2(){
    var name = document.getElementById("text").value;
    if (name == null || name == '' || message == null || message == '') {
        alert("请填写完整");
        return false;
    }
    alert("修改成功");
    return true;
}