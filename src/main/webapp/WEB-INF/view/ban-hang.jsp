<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BanHang</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body>

<div style="display: flex;">
    <div id="content1">
        <nav class="navbar bg-body-tertiary">
            <div class="container">
                <a class="navbar-brand" href="#">
                    <img src="" class="object-fit-cover border rounded" alt="hnh-shop" width="80"
                         height="80">
                    HNH Shop
                </a>
            </div>
        </nav>
        <div class="container-fluid">
            <span>Wellcome,</span><span> Chu Thị Ngọc</span>
        </div>
        <div class="container-fluid">
            <a href="/hnh-shop/trang-chu">
                <button class="h2 btn btn-primary  w-100 p-3 text-light">Bán hàng tại quầy</button>
            </a>
        </div>

        <div class="container-fluid">
            <a href="/hnh-shop/san-pham">
                <button class="h2 btn btn-primary  w-100 p-3 text-light">Quản lý sản phẩm</button>
            </a>
        </div>
        <div class="container-fluid">
            <button class="h2 btn btn-primary w-100 p-3 text-light">Quản lý hóa đơn</button>
        </div>
        <div class="container-fluid">
            <button class="h2 btn btn-primary w-100 p-3 text-light">Quản lý nhân viên</button>
        </div>
        <div class="container-fluid">
            <button class="h2 btn btn-primary w-100 p-3 text-light">Quản lý voucher</button>
        </div>
        <div class="container-fluid">
            <button class="h2 btn btn-primary w-100 p-3 text-light">Quản lý tài khoản</button>
        </div>
        <div class="container-fluid">
            <button class="navbar-brand mb-0 h2 btn btn-primary w-100 p-3 text-light">
                Đăng xuất
            </button>
        </div>
    </div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>