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


function acheckall(obj) {
    var all = document.getElementById('aall');
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

// function change(){
//     //$('input:checkbox:checked');
//     $.each($('input:checkbox:checked'),function(){
//         window.alert("你选了："+
//             $('input[type=checkbox]:checked').length-1+"个邮件!!");
//     });
// }

function delete1One(id) {
    if(window.confirm("确定是否彻底删除")){
    $.ajax({
        url:"/deleteReceiveEmail",
        type:"post",
        data:{"num":id},
        dataType:"json",
        success : function (data) {
            if(data===1){
                alert("删除成功");
                history.go(-1);
            }
        }
    });
}
}


function delete1(){
   var num =JSON.stringify(getNum());
if(window.confirm("确定是否彻底删除")){
   $.ajax({
       url:"/deleteReceiveEmail",
       type:"post",
       data:{"num":num},
       dataType:"json",
       success : function (data) {
           if(data===1){
               alert("删除成功");
               location.reload();
           }
       }
   });
}
}


function doRead() {
    var num =JSON.stringify(getNum());
    if(window.confirm("确定标记已读?")){
    $.ajax({
        url:"/readReceiveEmail",
        type:"post",
        data:{"num":num},
        dataType:"json",
        success : function (data) {
            if(data===1){
                location.reload();
            }
        }
    });
}
}



function doDeleteOne(id) {
    if(window.confirm("确定删除?")){
        $.ajax({
            url:"/updateDelete",
            type:"post",
            data:{"num":id},
            dataType:"json",
            success : function (data) {
                if(data===1){
                    history.go(-1);
                }
            }
        });
    }
}

function doDelete() {
    var num =JSON.stringify(getNum());
    if(window.confirm("确定删除?")){
    $.ajax({
        url:"/updateDelete",
        type:"post",
        data:{"num":num},
        dataType:"json",
        success : function (data) {
            if(data===1){

                location.reload();
            }
        }
    });
    }
}

function deleteSendEmail() {
    var num = JSON.stringify(getNum());
    if(window.confirm("确定删除?")){
    $.ajax({
        url:"/updateSendEmailsDel",
        type:"post",
        data:{"num":num},
        dataType:"json",
        success : function (data) {
            if(data === 1){
                alert("删除成功");
                location.reload();
            }
        }
    });
    }
}

function doDeleteSendEmail() {
    var num = JSON.stringify(getNum());
    if(window.confirm("确定彻底删除?")){
        $.ajax({
            url:"/deleteSendEmails",
            type:"post",
            data:{"num":num},
            dataType:"json",
            success : function (data) {
                if(data === 1){
                    alert("删除成功");
                    location.reload();
                }
            }
        });
    }
}
var num2 = new Array() ;
function getNum() {
    var num = new Array() ;
    var i =0;
    $.each($('input:checkbox:checked'),function(){
        if("全选"!==$(this).val()){
            num[i]=$(this).val();
            i++;
        }
    });
    return num;
}

function td_click(event){
    event.stopPropagation();
}

function  backSendEmail() {
    var num = JSON.stringify(getNum());
    alert(num);
    if(window.confirm("确定恢复至发件箱?")){
        $.ajax({
            url:"/backSendEmail",
            type:"post",
            data:{"num":num},
            dataType:"json",
            success : function (data) {
                if(data === 1){
                    alert("恢复成功");
                    location.reload();
                }
            }
        });
    }
}


function  backReceiveEmail() {
    var num = JSON.stringify(getNum());
    if(window.confirm("确定恢复至发件箱?")){
        $.ajax({
            url:"/backReceiveEmail",
            type:"post",
            data:{"num":num},
            dataType:"json",
            success : function (data) {
                if(data === 1){
                    alert("恢复成功");
                    location.reload();
                }
            }
        });
    }
}

function  doForwardReceive() {
    var num = JSON.stringify(getNum());
    window.location.href = "/index?num="+num+"#doForwardReceive";

}


function  doForwardSend() {
    var num = JSON.stringify(getNum());
    window.location.href = "/index?num="+num+"#doForwardSend";

}