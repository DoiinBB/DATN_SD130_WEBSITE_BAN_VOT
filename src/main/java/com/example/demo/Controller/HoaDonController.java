package com.example.demo.Controller;

import com.example.demo.Entity.ChiTietHoaDon;
import com.example.demo.Entity.HoaDon;
import com.example.demo.Repository.ChiTietHoaDonRepo;
import com.example.demo.Repository.HoaDonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hnh-shop")
public class HoaDonController {
    @Autowired
    private HoaDonRepo spRepo;

    // Hiển thị danh sách sản phẩm
    @GetMapping("/hoa-don/hien-thi")
    public String hienThiSanPham(Model model) {
        model.addAttribute("data", spRepo.findAll());
        return "hoa_don/index";  // Trả về view "index.jsp" hiển thị danh sách sản phẩm
    }
    // Hiển thị form thêm sản phẩm
    @GetMapping("/hoa-don/create")
    public String createForm(Model model) {
        model.addAttribute("data", new ChiTietHoaDon()); // Tạo một đối tượng trống cho form
        return "hoa_don/add"; // Trả về view "add.jsp"
    }

    // Xử lý khi người dùng submit form thêm sản phẩm
    @PostMapping("/hoa-don/create")
    public String create(@ModelAttribute HoaDon sanPham) {
        spRepo.save(sanPham); // Lưu sản phẩm vào cơ sở dữ liệu
        return "redirect:/hnh-shop/hoa-don/hien-thi"; // Chuyển hướng về trang hiển thị sản phẩm sau khi thêm thành công
    }

    // Tạo form chỉnh sửa sản phẩm
    @GetMapping("/hoa-don/edit/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        HoaDon sanPham = spRepo.findById(id).orElse(null);
        if (sanPham != null) {
            model.addAttribute("data", sanPham);
        }
        return "redirect:/hnh-shop/hoa-don/hien-thi"; // Nếu không tìm thấy sản phẩm, quay lại danh sách
    }
    // Xử lý chỉnh sửa sản phẩm
    @PostMapping("/hoa-don/edit/{id}")
    public String edit(@PathVariable Integer id, @ModelAttribute HoaDon sanPham) {
        sanPham.setId(id); // Đặt ID để cập nhật
        spRepo.save(sanPham);
        return "redirect:/hnh-shop/hoa-don/hien-thi"; // Quay lại danh sách sản phẩm
    }
    // Xóa sản phẩm
    @GetMapping("/hoa-don/delete/{id}")
    public String delete(@PathVariable Integer id) {
        spRepo.deleteById(id);
        return "redirect:/hnh-shop/hoa-don/hien-thi"; // Quay lại danh sách sản phẩm
    }
}
