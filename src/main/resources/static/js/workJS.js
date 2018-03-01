
createEditor = function()  {
    enableBtn();
    UE.getEditor('editor');

    window.clearInterval(x);

};
var x= setInterval(createEditor(),1);