$(document).ready(function () {
        var texts ="";
     $(".message").each(function () {
        texts += $(this).attr("value");
     });

    var work = new Worker("js/workJS.js");


    $(function(){
        window.setTimeout(setContent,1000);//一秒后再调用赋值方法
    });
    function setContent(){
        UE.getEditor('editor').execCommand('insertHtml', texts);
    }
    work.terminate();

    $("#send").click(function () {
        alert(UE.getEditor('editor').getContent());
        $.ajax({
            url:"/sendEmail",
            type:"post",
            data:{"title":$("#title").val(), "receiveperson":$("#userPhone").val(),"message":UE.getEditor('editor').getContent()},
            dataType:"json",
            success :function () {
                alert("发送成功");
            }
        });
    });

    $("button#saveAsDraft").click(function () {
        $.ajax({
            url:"/saveAsDraft",
            type:"post",
            dataType:"json",
            data:{"title":$("#title").val(),"message":UE.getEditor('editor').getContent(),"receiveperson":$("#userPhone").val()},
            success:function (data) {
                if (data === 1){
                    alert("保存成功");
                }
            }
        })
    });

});

