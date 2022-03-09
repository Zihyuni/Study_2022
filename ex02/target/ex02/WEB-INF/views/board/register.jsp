<%--
  Created by IntelliJ IDEA.
  User: jihyun
  Date: 2022-03-10
  Time: 오전 1:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="../includes/header.jsp"%>
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

</head>
<body>
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Board Register</h1>
            <!--.col-lg-12 -->
        </div>
        <!--/.row-->

        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">Board Register</div>
                    <!--/.panel-heading-->
                    <div class="panel-body">

                        <form role="form" action="board/register" method="post">
                            <div class="form-group">
                                <label>Title</label>
                                <input class="form-control" name='title'>
                            </div>

                            <div class="form-group">
                                <label>Text area</label>
                                <textarea class="form-control" rows="3" name='content'></textarea>
                            </div>

                            <div class="form-group">
                                <label>Writer</label>
                                <input class="form-control" name='writer'>
                            </div>
                                
                            <button type="submit" class="btn btn-default">
                                submit button</button>
                            
                            <button type="submit" class="btn btn-default">
                                reset Button</button>
                            
                        </form>
                    </div>
                    <!--end panel bodu-->
                    
                </div>
                <!-- end panel body-->
                
            </div>
            <!-- end panel-->
            
        </div>
        
        <!-- /.row -->
        <%@include file="../includes/footer.jsp"%>

                            </div>


                        </form>
                    </div>

                </div>
            </div>
        </div>



    </div>
</body>
</html>
