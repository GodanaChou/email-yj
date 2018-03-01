var countdown=60;
var nums =1;
setTimes = function(obj){

    if (countdown === 0) {
        obj.removeAttribute("disabled");
        obj.value="重新获取验证码";
        countdown = 60;
        return;
    } else {
        obj.setAttribute("disabled", true);
        obj.value="重新发送(" + countdown + ")";
        countdown--;
    }

    if(nums === 1){
        getSms();
        nums--;
        alert(nums);
    }
    setTimeout(function() {
            setTimes(obj) }
        ,1000)
}


getSms= function(){
    $.ajax({
        url:"/registerSMS",
        type:"get",
        dataType:"json",
        data:{phone:document.getElementById("phone").value},
        success:function (data) {
            if(data === 1){
                alert("短信发送成功");
            }else {
                alert("该邮箱已经注册,请不要重复注册");
            }
        }
    })
}

doRegister  = function () {
    var phone = document.getElementById("phone").value;
    var password = document.getElementById("password").value;
    var num = document.getElementById("num").value;
    $.ajax({
        url:"/doRegister",
        type:"post",
        dataType:"json",
        data:{phone:phone,password:password,num:num},
        success:function (data) {
            if(data === 1){
                alert("注册成功!");
                window.location.href="/login";
            }else {
                alert("该手机号已被注册,请直接登录!");
                window.location.href="/login";
            }
        }
    })
}