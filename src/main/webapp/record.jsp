<%--
  Created by IntelliJ IDEA.
  User: AM
  Date: 2019/11/1
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="statics/css/record.css" rel="stylesheet" type="text/css">
</head>
<body>
    <div>
        <table class="tab">
            <tr>
                <td style="background-color: ghostwhite;" colspan="11"><span id="touspan">已超出规定借阅时间</span></td>
            </tr>
            <tr>
                <td colspan="11">
                    <select class="tyo">
                        <option value="0">借阅人姓名</option>
                    </select>
                    <input type="text" placeholder="请输入您想查询的借阅集记录" class="tyo2">
                    <button id="butt">搜索</button>
                </td>
            </tr>
            <tr id="menu">
                <td>借阅编号</td>
                <td>图书编号</td>
                <td>图书名称</td>
                <td>借阅人ID</td>
                <td>借阅人姓名</td>
                <td>联系电话</td>
                <td>借阅日期</td>
                <td>预计归还日期</td>
                <td>已超时时间</td>
                <td>借阅状态</td>
                <td>黑名单</td>
            </tr>
        </table>
    </div>
</body>
</html>
