package com.example.demo.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "SanPhamChiTiet")
public class ChiTietSanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "gia")
    private double gia; // Giá của sản phẩm

    @Column(name = "soluongton")
    private int soLuongTon; // Số lượng tồn

    @Column(name = "ngaysua")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaySua; // Ngày sửa

    @Column(name = "ngaytao")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngayTao; // Ngày tạo

    @Column(name = "trangthai")
    private int trangThai; // Trạng thái sản phẩm

    @ManyToOne
    @JoinColumn(name = "idsanpham")
    private SanPham sanPham;

    @ManyToOne
    @JoinColumn(name = "iddiemcanbang")
    private DiemCanBang diemCanBang;

    @ManyToOne
    @JoinColumn(name = "idvatlieutruc")
    private VatLieuTruc vatLieuTruc;

    @ManyToOne
    @JoinColumn(name = "idvatlieukhung")
    private VatLieuKhung vatLieuKhung;

    @ManyToOne
    @JoinColumn(name = "iddocungthan")
    private DoCungThan doCungThan;

    @ManyToOne
    @JoinColumn(name = "idchieudaitongthe")
    private ChieuDaiTongThe chieuDaiTongThe;

    @ManyToOne
    @JoinColumn(name = "idmuccangtoida")
    private MucCangToiDa mucCangToiDa;

    @ManyToOne
    @JoinColumn(name = "idchuvicanvot")
    private ChuViCanVot chuViCanVot;

    @ManyToOne
    @JoinColumn(name = "idmausac")
    private MauSac mauSac;

}
