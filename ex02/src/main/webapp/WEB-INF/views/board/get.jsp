<%--
  Created by IntelliJ IDEA.
  User: jihyun
  Date: 2022-03-10
  Time: 오전 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Bootstrap Admin Theme</title>

    <!-- Bootstrap Core CSS -->
    <link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="/resources/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- DataTables CSS -->
    <link href="/resources/vendor/datatables-plugins/dataTables.bootstrap.css" rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="/resources/vendor/datatables-responsive/dataTables.responsive.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/resources/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="/resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <%@ include file="../includes/header.jsp"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
</head>
<body>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Board Read</h1>
            </div>
                <!-- /.col-lg-12-->
            </div>
            <!-- /.row-->
            
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        
                        <div class="panel-heading">Board read Page</div>
                    <!--/.panel-heading-->
                    <div class="panel-body">
                        
                        <div class="form-group">
                            <label>Bno</label>
                            <input class="form-control" name="bno" value="<c:out value="${board.bno}"/>" readonly="readonly">
                        </div>

                        <div class="form-group">
                            <label>Title</label>
                            <input class="form-control" name="title" value="<c:out value="${board.title}"/>" readonly="readonly">
                        </div>

                        <div class="form-group">
                            <label>Content</label>
                            <input class="form-control" name="content" value="<c:out value="${board.content}"/>" readonly="readonly">
                        </div>

                        <div class="form-group">
                            <label>Writer</label>
                            <input class="form-control" name="writer" value="<c:out value="${board.content}"/>" readonly="readonly">
                        </div>
                            
                        <button data-oper='modify' class="btn btn-default"
                        onclick="location.href='/board/modify?bno=<c:out value="${board.bno}"/>">MODIFY(수정)</button>
                            <!--이게 뭐냐면 href가 board/modify밑에 겟으로 값을 넣어주겠다는거!!-->
                        <button data-oper='LIST' class="btn btn-default"
                        onclick="location.href='/board/list'">리스트로 가기!!!</button>

                        <form id="orerForm" action="/board/modify" method="get">
                            <input type="hidden" id="bno" value="<c:out value="${board.bno}"/>">

                        </form>
                    </div>
                    <!--end panel body-->
                </div>
                <!--end panel-body -->
            </div>
            <!-- end panel-->
        </div>
        <!--/.row-->

    <%@include file="../includes/footer.jsp"%>
    <script type="text/javascript">
        $(document).ready(function (){

            var openForm = $("#operForm");

            $("button[data-oper='modify']").on("click",function (e){
                operForm.attr("action","/board/modify").submit();
            });

            $("button[data-oper='list']").on("click",function (e){
                openForm.find(#bno).remove();
                openForm.attr("action","/board/list")
                openForm.submit();
            })
        })
    </script>
</body>
</html>
