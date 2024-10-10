package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BanHangController {
//    @GetMapping("/trang-chu")
//    public String view(
//            Model model) {
//
//        return "ban-hang";
//    }
    @GetMapping("/hnh-shop/banhang")
    public String hienThiTrangChu(@RequestParam(value = "page", required = false) String page, Model model) {
        // Xác định trang cần hiển thị dựa trên tham số "page"
        String pageContent = "banHangTaiQuay.jsp"; // Trang mặc định

        if ("ban-hang-tai-quay".equals(page)) {
            pageContent = "banHangTaiQuay.jsp";
        } else if ("quan-ly-san-pham".equals(page)) {
            pageContent = "quanLySanPham.jsp";
        } else if ("quan-ly-hoa-don".equals(page)) {
            pageContent = "quanLyHoaDon.jsp";
        } else if ("quan-ly-nhan-vien".equals(page)) {
            pageContent = "quanLyNhanVien.jsp";
        } else if ("quan-ly-voucher".equals(page)) {
            pageContent = "quanLyVoucher.jsp";
        } else if ("quan-ly-tai-khoan".equals(page)) {
            pageContent = "quanLyTaiKhoan.jsp";
        }

        // Gán giá trị cho model để truyền vào JSP
        model.addAttribute("pageContent", pageContent);
        return "ban-hang"; // Trả về trang index.jsp
    }

}
