$(document).ready(function () {
    $.ajax({
        type:"GET",
        url:'/getlist',
        success: function (response) {
            var data = response;
            var html="";

            $.each(data, function (i,item) {
                html+="<tr>" +
                    "<td>"+ i +"</td>"+
                    "<td>"+item.id+"</td>"+
                    "<td>"+item.name+"</td>+" +
                    "<td>"+item.old+"</td>"+
                    "<td>"+item.classname+"</td>" +

                    "<td>" +
                     "<a href='/xoa?id="+ item.id +"'>xoa</a>"+
                    "</td>" +

                    "<td>" +
                    "<a href='/sua/"+ item.id +"'>sua</a>"+
                    "</td>" +

                    "</tr>";

            })
            $('#display').html(html);
        },
        error: function () {

        }
    })

    function sua() {

        var formstudent ={
            id :$('#idstudent').val(),
            name: $('#name').val(),
            old: $('#old').val(),
            className: $('#classname').val(),
        }

        $.ajax({
            type: "POST",
            url: "/getsua",
            data: json.isPrototypeOf(formstudent),

        })

    }



})