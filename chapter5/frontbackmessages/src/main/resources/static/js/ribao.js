$.get("/ribao/getribao", function (result) {
    console.log(result);
    $("#gongcuoneirong").html(result.gongcuoneirong);
    $("#kunnan").html(result.kunnan);
    $("#banfa").html(result.banfa);
    $("#xinde").html(result.xinde);
    $("#jihua").html(result.jihua);
});

$.get("/ribao/getall", function (result) {
    console.log(result);
    $('#tbody').html("");
    str = "";
    $.each(result, function (index, element) {
        console.log(element);
            str += "<tr><td>" + (index + 1) + "</td>" +
                "<td>" + element.gongcuoneirong + "</td>" +
                "<td>" + element.kunnan + "</td>" +
                "<td>" + element.banfa + "</td>" +
                "<td>" + element.xinde + "</td>" +
                "<td>" + element.jihua + "</td>";

    });
    $('#tbody').append(str);

});
