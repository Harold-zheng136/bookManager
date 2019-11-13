<%--
  Created by IntelliJ IDEA.
  User: AM
  Date: 2019/11/1
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="/statics/css/record.css" rel="stylesheet" type="text/css">
</head>
<body>
    <div>
        <form method="get" action="#">
            <table class="tab" width="100%">
                <tr>
                    <td style="background-color: gainsboro;" colspan="11"><span id="touspan">已超出规定借阅时间</span></td>
                </tr>
                <tr>
                    <td colspan="11">
                        <select class="tyo" name="UserRecord">
                            <option value="0">借阅人姓名</option>
                            <c:forEach var="tbrecord" items="${tbRecordsList}" varStatus="status">
                                <option <c:if test="${tbrecord.user_id == userName }">selected="selected"</c:if> value="${tbrecord.user_id}">
                                    ${tbrecord.userName}
                                </option>
                            </c:forEach>
                        </select>
                        <input type="hidden" name="pageIndex" value="1"/>
                        <input name="bookName" type="text" placeholder="请输入您想查询的图书名称" class="tyo2">
                        <button id="butt">搜索</button>
                    </td>
                </tr>
                <tr class="menu" style="text-align: center">
                    <td>借阅编号</td>
                    <td>图书编号</td>
                    <td>图书名称</td>
                    <td>借阅人ID</td>
                    <td>借阅人姓名</td>
                    <td>联系电话</td>
                    <td>借阅日期</td>
                    <td>预计归还日期</td>
                    <td>借阅状态</td>
                </tr>
                <c:forEach var="tbrecord" items="${tbRecordsList}" varStatus="status">
                    <tr style="text-align: center" id="menu2">
                        <td>
                            <span>${tbrecord.id}</span>
                        </td>
                        <td>
                            <span>${tbrecord.book_id}</span>
                        </td>
                        <td>
                            <span>《 ${tbrecord.bookName} 》</span>
                        </td>
                        <td>
                            <span>${tbrecord.user_id}</span>
                        </td>
                        <td>
                            <span>${tbrecord.userName}</span>
                        </td>
                        <td>
                            <span>${tbrecord.telNum}</span>
                        </td>
                        <td>
                            <span>${tbrecord.recordDate1}</span>
                        </td>
                        <td>
                            <span>${tbrecord.backDate2}</span>
                        </td>
                        <td>
                            <span id="return">
                                <a class="TbRecordmodif" href="javascript:;"id=${tbrecord.id}><c:if test="${tbrecord.returnBook==0}">-点击归还</c:if></a>
                            </span>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </form>
        <input type="hidden" id="totalPageCount" value="${totalPageCount}"/>
        <c:import url="rollpage.jsp">
            <c:param name="totalCount" value="${totalCount}"/>
            <c:param name="currentPageNo" value="${currentPageNo}"/>
            <c:param name="totalPageCount" value="${totalPageCount}"/>
        </c:import>
    </div>
    <script type="text/javascript" src="/statics/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="/statics/js/record.js"></script>
</body>
</html>
