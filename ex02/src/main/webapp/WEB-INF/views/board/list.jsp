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

<body>

        <div class="panel-heding">Board List Page
        <button id='regBtn' type="button" class="btn btn-xs pull-right">
        Register New Board !!!>
        </button>
        </div>


        <table class="table table-striped table-bordered table-hover">
        <thead>
            <tr>
                <th>#번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>작성일</th>
                <th>수정일</th>
            </tr>
        </thead>

        <c:forEach items="${list}" var="board">

            <tr>
                <td><c:out value="${board.bno}"/> </td>
                <td><a href='/board/get?bno=<c:out value="${board.bno}"/>'>
                    <c:out value="${board.title}"/></a></td>
                    <!--title에 a태그를 걸어서 해당하는 게시물 번호로 넘어가게한다-->
                <td><c:out value="${board.writer}"/> </td>
                <td><fmt:formatDate value="${board.regdate}" pattern="yyyy-MM-DD"/> </td>
                <td><fmt:formatDate value="${board.updateDate}" pattern="yyyy-MM-dd" /></td>
                <!--이거 검색해보기 !formatDate-->
            </tr>
        </c:forEach>
            </tbody>
        </table>

        <div class='pull-right'>
            <ul class="pagination">
                <c:if test="${pageMaker.prev }">
                    <li class="paginate_button previous"><a href="#">Previous</a>
                    </li>
                </c:if>

                <c:forEach var="num" begin="${pageMaker.startPage }" end="${pageMaker.endPage }">
                    <li class="paginate_button next"> <a href="#">${num }</a> </li>
                </c:forEach>

                <c:if test="${pageMaker.next }">
                    <li class="paginate_button next"><a href="#">Next</a>
                    </li>
                </c:if>
            </ul>
        </div>
        <!--  end Pagination  -->

        <form id='actionForm' action="/board/list" method="get">
            <input type='hidden' name="pageNum" value="${pageMaker.cri.pageNum}">
            <input type="hidden" name="amount" value="${pageMaker.cri.amount}">
        </form>



        <!--Model 추가-->
        <div class="model fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
             aria-hidden="true">

            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"
                                aria-hidden="true">&times;&times;</button>
                        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                    </div>

                    <div class="modal-body>처리가 완료되었습니다!!!">
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary">Save changes</button>
                    </div>
                    </div>

            <!--/.modal-content-->
            </div>
            <!--/.model-dialog-->
        </div>
        <!--modal-->



        <%@include file="../includes/footer.jsp"%>



</body>
    <script type="text/javascript">
        $(document).ready(function (){
            var result = '<c:out value="${result}"/>';

            checkModal(result);

            function checkModal(result){
                if(result === '' || history.state){
                    return;
                }if (parseInt(result)>0){
                    $(".modal-body").html("게시물 " + parseInt(result)+"번이 등록되었음!!!");
                }
                $("myModal").modal("show");
            }
            $("#regBtn").on("click", function (){
                self.location = "/board/register";
            });

            var actionForm = $("#actionForm");

            $(".paginate_button a").on("click", function (e){
                e.preventDefault();
                console.log('click');
                actionForm.find("input[name='pageNum']").val($(this).attr("href"));
                actionForm.submit();
            });
        });
    </script>

    <!--게시물 조회를 위한 이벤트처리를 추가하는 스크립트-->
    <script>
        $(document).ready(function() {
            var result='<c:out value="${result}"/>';
            checkModal(result);

            history.replaceState({}, null, null);

            function checkModal(result) {
                if(result==='' || history.state) {
                    return;
                }

                if(parseInt(result) > 0) {
                    $(".modal-body").html("게시글 " + parseInt(result) + "번이 등록되었습니다.");
                }

                $("#myModal").modal("show");
            }

            $("#regBtn").on("click", function() {
                self.location="/board/register";
            });

            var actionForm = $("#actionForm");

            $(".paginate_button a").on("click", function(e) {
                e.preventDefault();
                console.log('click');
                actionForm.find("input[name='pageNum']").val($(this).attr("href"));
                actionForm.submit();
            });

            $(".move").on("click", function(e) {
                e.preventDefault();
                actionForm.append("<input type='hidden' name='bno' value='"+$(this).attr("href")+"'>");
                actionForm.attr("action", "/board/get");
                actionForm.submit();
            });
        });
    </script>

</html>