$(function(){
    $(".userMenu").on("click", "li", function(){
        var sId = $(this).data("id");  //获取data-id的值
        window.location.hash = sId;  //设置锚点
        loadInner(sId);
    });
    function loadInner(sId){
        var sId = window.location.hash;
        var pathn, i;
        switch(sId){
            case "#receiveEmail": pathn = "/all/1/1"; i = 1; break;
            case "#get": pathn = "get"; i = 2; break;
            case "#send": pathn = "send"; i = 3; break;
            case "#moreSend": pathn = "moreSend"; i = 4; break;
			case "#draft": pathn = "draft"; i = 5; break;
			case "#delete": pathn = "delete"; i = 6; break;
            default: pathn = "center"; i = 0; break;
        }
        $("#content").load(pathn); //加载相对应的内容
        $(".userMenu li").eq(i).addClass("current").siblings().removeClass("current"); //当前列表高亮
    }
    var sId = window.location.hash;
    loadInner(sId);
});