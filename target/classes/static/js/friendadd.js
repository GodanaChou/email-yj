window.onload=function(){
    var boxBtn=document.getElementById('add');
    boxBtn.onclick=function(){
        new ShowDiv();
    }
}
function ShowDiv(){
var _this=this;
this.modlueDiv=document.getElementById("modlue");
this.BoxBtn=document.getElementById('add');
this.cancleBtn=document.getElementById("cancle");
//对应div的“X”按钮的操作
this.cancleBtnn=document.getElementById("cancleBtn");
//对应div的取消按钮的操作
this.confirmBtn=document.getElementById("confirm");
this.newMask = document.createElement("div");  
//遮罩层，用来屏蔽灰掉背部界面
this.infoMsg=document.getElementById('infoMesg');
this.textData=document.getElementById("TextValue")
this.textData.value="";
this.BoxBtn.disabled=true;
this.modlueDiv.style.visibility="visible";
this.cancleBtnn.onclick=function(){
    _this.CloseDiv(this);
}
//取消按钮
this.cancleBtn.onclick=function(){
    _this.CloseDiv(this);
}
//确认按钮
this.confirmBtn.onclick=function(){
    _this.CloseDivAndInfoMesg(this);
}
// 创建弹出层 遮罩层 等 
    if ( !document.getElementById("mask") && 1)
    {      
        //mask div    
        this.newMask.id = "mask";
        this.newMask.style.position = "absolute";
        this.newMask.style.zIndex = "1";
        this.newMask.style.width = "100%";
        this.newMask.style.height = Math.max(document.body.scrollHeight,document.documentElement.scrollHeight) + 100 + "px";
        this.newMask.style.top = "0px";
        this.newMask.style.left = "0px";
        this.newMask.style.background = "gray";
        this.newMask.style.filter = "alpha(opacity=80)";
        this.newMask.style.opacity = "0.5";
        document.body.appendChild(this.newMask);      
    }
    _this.mask=document.getElementById("mask");
    _this.mask.style.visibility="visible";
}
//点击取消按钮关闭模态框
CloseDiv=function(){
    this.BoxBtn.disabled=false;
    this.modlueDiv.style.visibility="hidden";
    this.mask.style.visibility="hidden";
};
//点击确认按钮关闭模态框，提示增加信息
CloseDivAndInfoMesg=function(){
         doSave();
        this.CloseDiv();
};

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

doSave = function (){
  var phone = document.getElementById("phone").value;
  var name = document.getElementById("name").value;
  $.ajax({
      url:"addFriend",
      type:"post",
      dataType:"json",
      data:{friendphone:phone,friendname:name},
      success:function (data) {
          if(data===1){
          alert("添加成功");
          location.reload();
          }
      }
  })
};

writeToFriend = function (phone) {
    window.location.href = "index?phone="+phone+"#writeToFriend";
    
};

deleteFriend = function (id) {
    $.ajax({
        url:"deleteFriend",
        type:"post",
        dataType:"json",
        data:{id:id},
        success:function (data) {
            if(data === 1){
                alert("删除成功");
                location.reload();
            }else {
                alert("删除失败");
            }

        }
    })
};