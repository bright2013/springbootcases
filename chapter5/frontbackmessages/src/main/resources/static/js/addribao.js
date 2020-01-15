$("#addribao").click(function (e) {
    console.log("添加日报");

    //获取表单的数据生成Json对象
    var newRibao = {};
    var t = $('form').serializeArray();
    $.each(t, function () {
        newRibao[this.name] = this.value;
    });

    // 补充提交的字段
    console.log(JSON.stringify(newRibao));
    $.ajax({
            type: "POST",
            url: "/ribao/addribao",
            contentType: "application/json;charset=utf-8",
            data: JSON.stringify(newRibao),
            dataType: "json",
            success: function (res) {
                console.log(res);
            },
            error: function (message) {
                alert("提交失败" + JSON.stringify(message));
            }
        }
    );

    //阻止表单默认提交
    e.preventDefault();

});
