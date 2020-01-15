$(function () {
    $.get("/student/allmyreports", function (res, status) {

        $('#table').bootstrapTable({
            pagination: true,
            search: true,
            showSearchClearButton: true,
            exportTypes: ['json', 'xml', 'csv', 'txt', 'sql', 'excel', 'pdf'],
            columns: [
                {
                field: 'createdAt',
                title: '日期'
            }, {
                field: 'workContent',
                title: '工作内容'
            }, {
                field: 'difficulty',
                title: '遇到的困难'
            },
                {
                    field: 'solution',
                    title: '解决方法'
                },
                {
                    field: 'experience',
                    title: '心得体会'
                },
                {
                    field: 'plan',
                    title: '后续计划'
                }],
            data: res.resultData
        })
    })
});