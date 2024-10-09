<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Danh sách sản phẩm</title>
</head>
<body>
<h1>Danh sách sản phẩm</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Mã</th>
        <th>Tên</th>
        <th>Thông tin</th>
        <th>Giá</th>
        <th>Trạng thái</th>
        <th>Số lượng đã bán</th>
        <th>Hành động</th>
    </tr>
    <c:forEach var="sanPham" items="${data}">
        <tr>
            <td>${sanPham.id}</td>
            <td>${sanPham.ma}</td>
            <td>${sanPham.ten}</td>
            <td>${sanPham.thongTin}</td>
            <td>${sanPham.gia}</td>
            <td>${sanPham.trangThai}</td>
            <td>${sanPham.soLuongDB}</td>
            <td>
                <a href="${pageContext.request.contextPath}/hnh-shop/san-pham/edit/${sanPham.id}">Sửa</a>
                <a href="${pageContext.request.contextPath}/hnh-shop/san-pham/delete/${sanPham.id}">Xóa</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}/hnh-shop/san-pham/create">Thêm sản phẩm mới</a>
</body>
</html>
