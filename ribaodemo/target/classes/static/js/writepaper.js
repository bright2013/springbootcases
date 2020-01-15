var wquill = new Quill('#workcontenteditor', {
    theme: 'snow'
});
var dquill = new Quill('#difficultyeditor', {
    theme: 'snow'
});
var squill = new Quill('#solutioneditor', {
    theme: 'snow'
});
var daquill = new Quill('#dailyexpeditor', {
    theme: 'snow'
});
var nquill = new Quill('#nextplayeditor', {
    theme: 'snow'
});


function validateInput() {
    var w_content = wquill.container.firstChild.innerHTML;
    var d_content = dquill.container.firstChild.innerHTML;
    var s_content = squill.container.firstChild.innerHTML;
    var da_content = daquill.container.firstChild.innerHTML;
    var n_content = nquill.container.firstChild.innerHTML;
    var FIXEDPHARASES = '请填写';
    if (w_content.indexOf(FIXEDPHARASES) >= 0 || d_content.indexOf(FIXEDPHARASES) >= 0
        || s_content.indexOf(FIXEDPHARASES) >= 0 || da_content.indexOf(FIXEDPHARASES) >= 0
        || n_content.indexOf(FIXEDPHARASES) >= 0) {
        return false;
    }
    return true;
}

$(document).ready(function () {
    //隐藏告警框
    $(".alert").hide();

    //检查是否是周日,0 -6 为周日到周六
    var today = new Date();
    var weekday = today.getDay();
    if (weekday == 0) {
        $("#experience").text("本周心得");
        $("#plan").text("下周计划");
    }

});

$("#submitBtn").click(function () {

    //检查是否有没填的内容
    if (validateInput()) {

        //获取表单的数据
        var newReport = {
            /**
             * 工作内容
             */
            workContent: wquill.container.firstChild.innerHTML,
            /**
             * 遇到的困难
             */
            difficulty: dquill.container.firstChild.innerHTML,
            /**
             * 解决方法
             */
            solution: squill.container.firstChild.innerHTML,
            /**
             * 心得体会
             */
            experience: daquill.container.firstChild.innerHTML,
            /**
             * 后续计划
             */
            plan: nquill.container.firstChild.innerHTML

        };

        console.log(JSON.stringify(newReport));
        /**
         * 用Ajax提交到服务端controller
         */
        $.ajax({
                type: "POST",
                url: "/student/addreport",
                contentType: "application/json;charset=utf-8",
                data: JSON.stringify(newReport),
                dataType: "json",
                success: function (res) {
                    console.log("Data: " + res.resultData);
                    window.location.href = "/myreport";
                },
                error: function (message) {
                    alert("提交失败" + JSON.stringify(message));
                }
            }
        );
    } else {
        $(".alert").show();
    }

});


