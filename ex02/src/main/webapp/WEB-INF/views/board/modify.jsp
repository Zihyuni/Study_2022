<%--
  Created by IntelliJ IDEA.
  User: jihyun
  Date: 2022-03-08
  Time: 오후 5:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../includes/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>

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

</head>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Board Register</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->


<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">Board Register</div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <form role="form" action="/board/modify" method="post">
                    <div class="form-group">
                        <label>Bno</label> <input class="form-control" name='bno'
                                                  value='<c:out value="${board.bno}"/>' readonly="readonly">
                    </div>
                    <div class="form-group">
                        <label>Title</label> <input class="form-control" name='title'
                                                    value='<c:out value="${board.title}"/>' >
                    </div>
                    <div class="form-group">
                        <label>Text area</label>
                        <textarea class="form-control" rows="3" name='content'>
							<c:out value="${board.content }" />
						</textarea>
                    </div>
                    <div class="form-group">
                        <label>Writer</label> <input class="form-control" name='writer'
                                                     value='<c:out value="${board.writer}"/>' readonly="readonly">
                    </div>
                    <div class="form-group">
                        <label>RegDate</label> <input class="form-control" name='regDate'
                                                      value='<fmt:formatDate pattern="yyyy/MM/dd" value="${board.regdate}"/>'
                                                      readonly="readonly">
                    </div>
                    <div class="form-group">
                        <label>Writer</label> <input class="form-control"
                                                     name='updateDate'
                                                     value='<fmt:formatDate pattern="yyyy/MM/dd" value="${board.updateDate}"/>'
                                                     readonly="readonly">
                    </div>
                    <button type="submit" data-oper='modify' class="btn btn-dafult">Modify</button>
                    <button type="submit" data-oper='remove' class="btn btn-danger">Remove</button>
                    <button type="submit" data-oper='list' class="btn btn-info">List</button>
                </form>

            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </div>
    <!-- /.col-lg-12 -->
</div>
    <script type="text/javascript">
        $(document).ready(function (){
            var formObj = $("form");

            $('button').on("click",function (e){
                e.preventDefault();

                var operation = $(this).data("oper");

                console.log(operation);

                if(operation === 'remove'){
                    formObj.attr("action", "/board/remove");
                }else if(operation === 'list'){
                    //move to list
                    formObj.attr("action","/board/list").attr("method","get");
                    formObj.empty();
                }
                formObj.submit();
            });
        });
    </script>

<%@include file="../includes/footer.jsp"%>