$(function () {
    var time = document.getElementById('time');
    var weekend = ['星期天', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六'];
    setInterval(function() {
        clearInterval();
        var myDate = new Date();
        var year = myDate.getFullYear(); //获取完整的年份(4位,1970-????)
        var month = myDate.getMonth() + 1; //获取当前月份(0-11,0代表1月)
        var date = myDate.getDate(); //获取当前日(1-31)
        var week = weekend[myDate.getDay()]; //获取当前星期X(0-6,0代表星期天)

        var hours = myDate.getHours(); //获取当前小时数(0-23)
        var minutes = myDate.getMinutes(); //获取当前分钟数(0-59)
        var second = myDate.getSeconds(); //获取当前秒数(0-59)

        if (month >= 1 && month <= 9) {
            month = "0" + month;
        }
        if (date >= 1 && date <= 9) {
            date = "0" + date;
        }
        if (hours >= 0 && hours <= 9) {
            hours = "0" + hours;
        }
        if (minutes >= 0 && minutes <= 9) {
            minutes = "0" + minutes;
        }
        if (second >= 0 && second <= 9) {
            second = "0" + second;
        }

        time.innerHTML = year + "年" + month + "月" + date + "日" + "&nbsp;" + hours + ":" + minutes + ":" + second + "&nbsp;" + week;

    }, 1000);

    function checks(id1,id2) {
        var name = document.getElementById(id1).value;
        var message = document.getElementById(id2).value;
        if (name === null || name === '' || message == null || message === '') {
            alert("请填写完整");
            return false;
        }
        return true;
    }

});