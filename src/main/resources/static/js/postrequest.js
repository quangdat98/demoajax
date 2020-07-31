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

    $("#customerForm").submit(function(event) {
        // Prevent the form from submitting via the browser.
        event.preventDefault();
        ajaxPost();
    });

    function ajaxPost(){

        var formstudent ={
            id :        $('#idstudent').val(),
            name:       $('#name').val(),
            old:        $('#old').val(),
            classname:  $('#classname').val(),
        }

        $.ajax({
            type : "POST",
            contentType : "application/json",
            url: "/getsua",
            data: JSON.stringify(formstudent), // stringify dùng để chuyển 1 đối tượng ở javacript sang dạng json
            dataType:'json',
            success: function (kq) {
                if(kq){
                    $('#message').html('Đã Sửa Thành Công!!!');
                }else {
                    $('#message').html('Sửa Thất Bại!!!');
                }
            },
            error: function () {
                $('#message').html('Sửa Thất Bại!!!');
            },
        })
    }



    /*          button them moi           */

    $(document).delegate('#butonthem','click',function () {/* thằng delegate giao quyền thực hiện 1 cái gì đó  */

        var formstudent={
            id:         $('#idstudent').val(),
            name:       $('#name').val(),
            old:        $('#old').val(),
            classname:  $('#classname').val(),
        }

        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/themmoi",
            data: JSON.stringify(formstudent),
            dataType: 'json',
            success: function (kq) {
                $('#message1').html('Bạn Đã Thêm Mới Thành Công');
            },
            error: function () {
                $('#message1').html('Bạn Thêm Mới Thất Bại');
            }
        })

    })




})