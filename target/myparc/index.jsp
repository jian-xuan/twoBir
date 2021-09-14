<%--
  Created by IntelliJ IDEA.
  User: 10746@qq.com
  Date: 2021/7/21
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>二次元の生日</title>
    <%
        pageContext.setAttribute("APP_PATH",request.getContextPath());
    %>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
</head>
<body background="https://i.lixinbk.cn/2021/09/f3520aebbe36e.jpg"  >
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>

<%--搭建显示页面--%>
<div class="container">
    <%--    标题--%>
    <div class="row">
        <div class="clo-md-12 col-md-offset-4">
            <%--            <img height="200" width="500" src="https://i.lixinbk.cn/2021/09/f3520aebbe36e.jpg"/>--%>
            <h1>二次元の生日</h1>
        </div>
    </div>
    <%--    按钮--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-2">
            <input type="text" name="chSelect_input" class="form-control" id="select_input" placeholder="输入关键词进行搜索">
        </div>
        <button class="btn btn-primary" id="Select_btn">搜索</button>
        <div class="col-md-4 col-md-offset-8">
            <button class="btn btn-primary" id="Birthday_today_btn">HBD</button>
            <button class="btn btn-primary" id="ch_add_btn">新增</button>
            <button class="btn btn-danger" id="ch_del_all_btn">删除</button>
        </div>
    </div>


    <%--    显示表格数据--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover" id="characters_table">
                <thead>
                <tr>
                    <th>
                        <input type="checkbox" id="check_all">
                    </th>
                    <th>id</th>
                    <th>图片</th>
                    <th>Name</th>
                    <th>Birthday</th>
                    <th>声优</th>
                    <th>动画</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>


                </tbody>
            </table>
        </div>
    </div>

    <%--    显示分页信息--%>
    <div class="row">
        <%--        分页文字信息--%>
        <div class="col-md-6" id="page_info_area"></div>
        <%--        分页条信息--%>
        <div class="col-md-6" id="page_nav_area">
            <nav aria-label="Page navigation">
                <ul class="pagination">

                </ul>
            </nav>
        </div>
    </div>
</div>


<!-- 添加学生的模态框，Bootstrap代码 -->

<div class="modal fade" id="chAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">添加动漫人物</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">名字</label>
                        <div class="col-sm-10">
                            <input type="text" name="chName" class="form-control" id="chName_add_input" placeholder="请输入名字">
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">Birthday</label>
                        <div class="col-sm-10">
                            <input type="text" name="chBirthday" class="form-control" id="Birthday_add_input" placeholder="例:20xx-xx-xx 如无年份 请填写0000">
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">声优</label>
                        <div class="col-sm-10">
                            <input type="text" name="chBack" class="form-control" id="Back_add_input" placeholder="多个请用空格隔开">
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">动画</label>
                        <div class="col-sm-10">
                            <input type="text" name="chAni" class="form-control" id="Ani_add_input" placeholder="来源的动漫/电影">
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">头像</label>
                        <div class="col-sm-10">
                            <input type="text" name="chImg" class="form-control" id="Head_add_input" placeholder="上传头像后输入头像的链接：">
                            <span class="help-block"></span>
                        </div>
                      <div class="col-md-offset-5"><a href="https://i.lixinbk.cn/">点击我上传图片</a></div>

                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="ch_save_btn">保存</button>
            </div>
        </div>
    </div>
</div>




<!-- 修改学生信息的模态框，Bootstrap代码 -->

<div class="modal fade" id="chUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">信息修改</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">名字</label>
                        <div class="col-sm-10">
                            <input type="text" name="chName" class="form-control" id="chName_update_input" placeholder="请输入名字">
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">Birthday</label>
                        <div class="col-sm-10">
                            <input type="text" name="chBirthday" class="form-control" id="chBirthday_update_input" placeholder="例:20xx-xx-xx 如无年份 请填写0000">
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">声优</label>
                        <div class="col-sm-10">
                            <input type="text" name="chBack" class="form-control" id="chBack_update_input" placeholder="多个请用空格隔开">
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">动画</label>
                        <div class="col-sm-10">
                            <input type="text" name="chAni" class="form-control" id="chAni_update_input" placeholder="来源的动漫/电影">
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">头像</label>
                        <div class="col-sm-10">
                            <input type="text" name="chImg" class="form-control" id="chImg_update_input" placeholder="上传头像后输入头像的链接：">
                            <span class="help-block"></span>
                        </div>
                        <div class="col-md-offset-5"><a href="https://i.lixinbk.cn/">点击我上传图片</a></div>

                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="ch_update_btn">更新</button>
            </div>
        </div>
    </div>
</div>

<!-- 修改学生信息的模态框代码结束 -->


<%--HTML代码结束--%>

<%--查询的功能--%>
<script type="text/javascript">
    var  currentPage; // 保存当前的总记录数

    //页面加载完成以后，发送ajax请求，得到分页数据
    $(function () {
        //去首页;
        to_page(1);
    })

    //跳转到指定页面
    function  to_page(pn){
        $.ajax({
            url:"${APP_PATH}/chs",
            data:"pn="+pn,
            type:"GET",
            //result 获取到了返回的Msg对象（JSON数据）
            success:function (result){

                //1、解析并显示数据
                build_characters_table(result);
                //2、解析并显示分页信息
                build_page_info(result);
                //3/解析显示分页条数据
                build_page_nav(result);
            }
        });
    }

    function build_characters_table(result){
        // 每次显示一页的数据之前应该将之前的数据清空，因为使用的都是appen
        //查询新的一页时会在之前的内容之上append，可能会出现错误

        $("#characters_table tbody").empty();

        var chs = result.extend.pageInfo.list;//所有学生的信息

        //遍历获取所有学生的信息
        $.each(chs,function (index,item) {

            //获取到学生信息中的每项信息
            var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
            var chId= $("<td></td>").append(item.chId);
            var img = $("<img height='50' width='50'/>").attr("src",item.chImg);
            var chImg = $("<td></td>").append(img);
            var chName = $("<td></td>").append(item.chName);
            var chBirthday = $("<td></td>").append(item.chBirthday);
            var chBack = $("<td></td>").append(item.chBack);
            var chAni = $("<td></td>").append(item.chAni);

            //每行的编辑按钮
            var ediBtn = $("<button></button>").addClass("btn btn-info btn-sm edit_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");

            //每行中的编辑按钮添加一个自定义属性，表示当前动画人物的id
            ediBtn.attr("edit-id",item.chId);
            //每行中的删除按钮
            var delBtn =  $("<button></button>").addClass("btn btn-warning btn-sm delete_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");

            //为删除添加一个自定义属性,表示当前学生的id
            delBtn.attr("del-id",item.chId);

            //将两个按钮整合在一起
            var btnTd = $("<td></td>").append(ediBtn).append(" ").append(delBtn);

            //将以上数据拼成一行
            $("<tr></tr>").append(checkBoxTd)
                .append(chId)
                .append(chImg)
                .append(chName)
                .append(chBirthday)
                .append(chBack)
                .append(chAni)
                .append(btnTd)
                .appendTo("#characters_table tbody");
        });
    }

    //解析显示分页信息
    function build_page_info(result){
        $("#page_info_area").empty();
        $("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页，总"+result.extend.pageInfo.pages+"页，总 "+result.extend.pageInfo.total+"条记录");
        currentPage = result.extend.pageInfo.pageNum;
    }


    //解析显示分页条数据
    function build_page_nav(result){

        //清空分页条信息
        $("#page_nav_area").empty();

        //Bootstrap中的写法，导航条中的信息都要写在ul变量中
        var ul = $("<ul></ul>").addClass("pagination");

        //首页
        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));

        //前一页
        var prePgaeLi = $("<li></li>").append($("<a></a>").append("&laquo;"));

        //如果当前遍历的页码是首页（没有前一页），让首页和上一页补课点击
        if(result.extend.pageInfo.hasPreviousPgae==false){
            //disable 是Bootstrap中的写法
            firstPageLi.addClass("disabled");
            prePgaeLi.addClass("disabled");
        }else{
            //为首页和前一页添加翻页事件
            firstPageLi.click(function (){
                to_page(1);
            });

            prePgaeLi.click(function () {
                to_page(result.extend.pageInfo.pageNum-1);
            });
        }

        //后一页
        var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));

        //末页
        var lastPgaeLi = $("<li></li>").append($("<a></a>").append("末页"));

        //如果当前遍历的页码是末页，让末页和下一页不可点击。

        if(result.extend.pageInfo.hasNextPgae==false){
            //disable 是Bootstrap中的写法
            lastPgaeLi.addClass("disabled");
            nextPageLi.addClass("disabled");
        }else{
            //为首页和前一页添加翻页事件
            lastPgaeLi.click(function (){
                to_page(result.extend.pageInfo.pages);
            });

            nextPageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum+1);
            });
        }

        //导航条中添加首页和前一页
        ul.append(firstPageLi).append(prePgaeLi);

        //遍历1 2 3 之类的页码
        $.each(result.extend.pageInfo.navigatepageNums,function (index,item) {
            //numLi item 表示遍历到的 1 2 3 之类的页码
            var numLi = $("<li></li>").append($("<a></a>").append(item));

            //如果当前遍历的页码是当前的页码，让其高亮显示
            if(result.extend.pageInfo.pageNum==item){
                //active 是Bootstrap中的写法
                numLi.addClass("active");
            }

            //单击事件，跳转到对应页面
            numLi.click(function () {
                to_page(item);
            });

            //先导航条中添加1 2 3 之类的页码
            ul.append(numLi);
        });

        //导航条中添加下一页和末页
        ul.append(nextPageLi).append(lastPgaeLi);

        //把ul导航条添加到页面中的位置
        var navEle = $("<nav></nav>").append(ul);
        navEle.appendTo("#page_nav_area");
    }

    <!-- 查询、分页功能结束 -->

    <!-- 新增功能 -->

    //点击新增按钮弹出添加学生的模态框
    $("#ch_add_btn").click(function () {

        //调用函数清楚模态框的所有数据，防止上一次信息残留
        reset_form("#chAddModal form");

        //弹出添加人物的模态框（Bootstrap代码）
        $("#chAddModal").modal({
            backdrop:"static"
        });
    });

    //清空模态框样式以及内容(Bootstrap代码）
    function reset_form(ele){
        $(ele)[0].reset();
        $(ele).find("*").removeClass("has-error has-success");
        $(ele).find(".help-block").text("");
    }

    //通过内容发生改变和ajax请求检验填写的姓名是否已经存在于数据库
    $("#chName_add_input").change(function () {
         var chName = this.value;

         //发送ajax请求
        $.ajax({
            url: "${APP_PATH}/checkName",
            data: "chName="+chName,
            type: "POST",
            success:function (result) {
                if(result.code==100){
                    //调用函数以指定的格式显示信息
                    show_validate_msg("#chName_add_input","success","未添加");
                    //如果用户名可用，才让其保存，为保存按钮添加属性
                    $("#ch_save_btn").attr("ajax-va","success");
                }else{
                    //调用函数以指定的格式显示信息
                    show_validate_msg("#chName_add_input","error",result.extend.msg);
                    //如果用户名可用，才让其保存，为保存按钮添加属性
                    $("#ch_save_btn").attr("ajax-va","error");
                }
            }
        });
    });

    function show_validate_msg(ele,status,msg) {

        $(ele).parent().removeClass("has-success has-error");
        $(ele).next("span").text("");
        if("success"==status){
            $(ele).parent().addClass("has-success");
            $(ele).next("span").text(msg);
        }else if("error"==status){
            $(ele).parent().addClass("has-error");
            $(ele).next("span").text(msg);
        }
    }

    //添加学生模态框保存按钮的单击事件
    $("#ch_save_btn").click(function () {

        //发送ajax请求保存员工
        $.ajax({
            url:"${APP_PATH}/ch",
            //将用户填入的信息序列化为字符串，用于ajax请求
            data:$("#chAddModal form").serialize(),
            type:"POST",
            success:function (result) {

                //如果JSR303后端校验成功，保存员工
                if(result.code==100){

                    //关闭模态框（Bootstrap代码）
                    $("#chAddModal").modal('hide');

                    //来到最后一页，显示刚才保存的数据
                    to_page(999);
                }
            }
        });
    });


    <%--添加模块结束 --%>

    <%--修改功能--%>

    //为编辑按钮添加单击事件，弹出模态框

    //不能直接使用click为编辑按钮绑定单击事件
    //因为编辑按钮是在页面加载完成事件中添加的，单击事件早于页面加载事件被绑定
    //相当于还没有加载出来按钮就为其绑定了事件，故使用on 来绑定事件

    //为页面中对应class属性的按钮添加单击事件
    $(document).on("click",".edit_btn",function (){
        //1、查出对应的信息，并显示出来
        getCh($(this).attr("edit-id"));
        //2、把人物的id传递给模态框中的更新按钮
        //之前编辑按钮的edit-id属性已传入对应学生id
        $("#ch_update_btn").attr("edit-id",$(this).attr("edit-id"));
        //3 弹出修改信息的模态框(Bootstrap代码）
        $("#chUpdateModal").modal({
            backdrop: "static"
        });

    });

    function getCh(id) {
        $.ajax({
            url:"${APP_PATH}/ch/"+id,
            type:"GET",
            success:function (result) {
                var chData = result.extend.ch;
                $("#chName_update_input").val(chData.chName);
                $("#chBirthday_update_input").val(chData.chBirthday);
                $("#chBack_update_input").val(chData.chBack);
                $("#chAni_update_input").val(chData.chAni);
                $("#chImg_update_input").val(chData.chImg);
            }
        });
    }

    //点击模态框中的更新，更新学生信息
    $("#ch_update_btn").click(function () {

        //发送ajax请求保存更新的学生数据
        $.ajax({
            url:"${APP_PATH}/ch/"+$(this).attr("edit-id"),
            //web.xml 中已添加过滤器，可直接发送PUT请求
            type:"PUT",
            data:$("#chUpdateModal form").serialize(),
            success:function (result) {
                //1 关闭对话框
                $("#chUpdateModal").modal("hide");

                //2、 回到本页面
                to_page(currentPage);
            }
        });
    });

    <!-- 修改功能结束-->


    <!-- 删除功能开始-->

    //为单个删除绑定单击事件
    $(document).on("click",".delete_btn",function () {
       //1、弹出是否确认删除对话框
        var chName = $(this).parent("td").parent("tr").find("td:eq(3)").text();
        var chId = $(this).attr("del-id");
        if(confirm("确认删除【"+chName+"】吗？")){
            //确认，发送ajax请求删除即可
            $.ajax({
                url:"${APP_PATH}/ch/"+chId,
                type:"DELETE",
                success : function (result){
                    //显示处理成功
                    alert(result.msg);
                    //回到本页
                    to_page(currentPage);
                }

            });
        }


    });

    //为全选框绑定单击事件完成全选/全不选功能
    $("#check_all").click(function () {
        $(".check_item").prop("checked",$(this).prop("checked"));
    });

    //为单选框绑定单击事件，全选以后全选框随之选中
    $(document).on("click",".check_item",function () {
       //选中的个数是否等于单选框个数
       var flag = $(".check_item:checked").length==$(".check_item").length;
       $("#check_all").prop("checked",flag);
    });

    //批量删除按钮绑定单击事件
    $("#ch_del_all_btn").click(function () {
        if($(".check_item:checked").length>=1){
            //表示所有被选中的人物的姓名
            var chNames = "";

            //将选中动漫人物的id用"-"连接
            var del_idstr="";

            //遍历每一个选中的学生
            $.each($(".check_item:checked"),function () {
                chNames += $(this).parents("tr").find("td:eq(3)").text()+",";
                del_idstr += $(this).parents("tr").find("td:eq(1)").text()+"-";
            });

            //去除chName多余的括号
            chNames = chNames.substring(0,chNames.length-1);
            
            //去除del_idstr最后多余的“-”
            del_idstr = del_idstr.substring(0,del_idstr.length-1);
            
            //弹出确认删除对话框
            if(confirm("确认删除【"+chNames+"】吗？")){
                //发送ajax请求批量删除
                $.ajax({
                    url:"${APP_PATH}/ch/"+del_idstr,
                    type:"DELETE",
                    success:function (result) {
                        //显示处理成功
                        alert(result.msg);
                        //回到当前页面
                        to_page(currentPage);
                    }
                });
            }else{
                alert("请至少选中一位学生");
            }
        }
    });

    $("#Birthday_today_btn").click(function () {

        $.ajax({
            url:"${APP_PATH}/bir",
            type:"GET",
            success:function (result) {
                //1、解析并显示数据
                build_characters_table(result);
                //2、解析并显示分页信息
                build_page_info(result);
                //3/解析显示分页条数据
                build_page_nav(result);
            }
        });
    });

    $("#Select_btn").click(function () {
        var text = $("#select_input").val();
        if(text==""){
            alert("请输入关键词");
            return false;
        }else {
            $.ajax({
                url:"${APP_PATH}/select/",
                type:"GET",
                data:"str1="+text.toString(),
                success:function (result){
                    //1、解析并显示数据
                    build_characters_table(result);
                    //2、解析并显示分页信息
                    build_page_info(result);
                    //3/解析显示分页条数据
                    build_page_nav(result);
                }
            });
        }
    });

</script>


</body>
</html>
