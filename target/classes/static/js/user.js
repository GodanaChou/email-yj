$(function(){
    $(".userMenu").on("click", "li", function(){
        var sId = $(this).data("id");  //获取data-id的值
        var url =window.location.href;
        if(url.indexOf("?")!==-1){
            url = url.substring(0,url.indexOf("?"));
            window.location.href= url + "#" + sId;
        }else{
            window.location.hash = sId;  //设置锚点
            loadInner(sId);
        }
    });
    function loadInner(sId){
        var sId = window.location.hash;
        var pathn, i;
        switch(sId){
            case "#get": pathn = "get"; i = 1; break;
            case "#unread": pathn = "unread"; i = 2; break;
            case "#send": pathn = "send"; i = 3; break;
            case "#group_mail": pathn = "groupMail"; i = 4; break;
			case "#draft": pathn = "draft"; i = 5; break;
			case "#delete": pathn = "delete"; i = 6; break;
            case "#deleteReceive": pathn = "deleteForReceive"; break;
            case "#edit": pathn = "edit"+window.location.href.substring(window.location.href.indexOf("?"),window.location.href.indexOf("#")); break;
            case "#write": pathn = "write"; i = 7; break;
            case "#friend": pathn = "friend"; i = 8; break;
            case "#friendAdd": pathn = "friendAdd"; i = 12; break;
            case "#doForwardReceive":pathn = "doForwardReceive"+window.location.href.substring(window.location.href.indexOf("?"),window.location.href.indexOf("#"));break;
            case "#doForwardSend":pathn = "doForwardSend"+window.location.href.substring(window.location.href.indexOf("?"),window.location.href.indexOf("#"));break;
            case "#writeToFriend":pathn="writeToFriend"+window.location.href.substring(window.location.href.indexOf("?"),window.location.href.indexOf("#"));break;
            case "#reply": pathn = "reply"+window.location.href.substring(window.location.href.indexOf("?"),window.location.href.indexOf("#"));i = 9;break;
            case "#read": pathn = "read"+window.location.href.substring(window.location.href.indexOf("?"),window.location.href.indexOf("#"));i = 10;break;
            case "#read1": pathn = "read1"+window.location.href.substring(window.location.href.indexOf("?"),window.location.href.indexOf("#"));i = 11;break;
            case "#editReceive":pathn = "editReceive"+window.location.href.substring(window.location.href.indexOf("?"),window.location.href.indexOf("#"));break;
            default: pathn = "center"; i = 0; break;
        }
        $("#contentT").load(pathn); //加载相对应的内容
      //  $(".userMenu li").eq(i).addClass("current").siblings().removeClass("current"); //当前列表高亮
    }
    var sId = window.location.hash;
    loadInner(sId);
});