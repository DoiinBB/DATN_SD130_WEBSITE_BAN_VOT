<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trang quản lý bán hàng</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <style>
        #content1 {
            width: 25%; /* Thay đổi kích thước */
            padding: 0; /* Giảm padding */
            display: flex;
            flex-direction: column; /* Sắp xếp các phần tử theo chiều dọc */
            justify-content: flex-start; /* Căn chỉnh phần tử ở đầu */
            height: 100vh; /* Chiều cao toàn bộ viewport */
        }
        .menu-button {
            margin: 5px 0; /* Thêm một khoảng cách nhỏ giữa các nút */
        }
    </style>
</head>
<body>
<div style="display: flex; height: 100vh;">
    <div id="content1">
        <nav class="navbar bg-body-tertiary">
            <div class="container">
                <a class="navbar-brand" href="#">
                    <img src="" class="object-fit-cover border rounded" alt="hnh-shop" width="80" height="80">
                    HNH Shop
                </a>
            </div>
        </nav>
        <div class="container-fluid">
            <span>Welcome, Chu Thị Ngọc</span>
        </div>

        <!-- Nút điều hướng đến các phần khác -->
        <div class="container-fluid menu-button">
            <a href="?page=ban-hang-tai-quay">
                <button class="btn btn-primary w-100 p-2">Bán hàng tại quầy</button>
            </a>
        </div>
        <div class="container-fluid menu-button">
            <a href="?page=quan-ly-san-pham">
                <button class="btn btn-primary w-100 p-2">Quản lý sản phẩm</button>
            </a>
        </div>
        <div class="container-fluid menu-button">
            <a href="?page=quan-ly-hoa-don">
                <button class="btn btn-primary w-100 p-2">Quản lý hóa đơn</button>
            </a>
        </div>
        <div class="container-fluid menu-button">
            <a href="?page=quan-ly-nhan-vien">
                <button class="btn btn-primary w-100 p-2">Quản lý nhân viên</button>
            </a>
        </div>
        <div class="container-fluid menu-button">
            <a href="?page=quan-ly-voucher">
                <button class="btn btn-primary w-100 p-2">Quản lý voucher</button>
            </a>
        </div>
        <div class="container-fluid menu-button">
            <a href="?page=quan-ly-tai-khoan">
                <button class="btn btn-primary w-100 p-2">Quản lý tài khoản</button>
            </a>
        </div>
        <div class="container-fluid menu-button">
            <button class="navbar-brand mb-0 h2 btn btn-danger w-100 p-2">
                Đăng xuất
            </button>
        </div>
    </div>

    <!-- Phần hiển thị nội dung động -->
    <div id="product-list" style="width: 70%; padding: 20px;">
        <jsp:include page="${pageContent}"/>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
