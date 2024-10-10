package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tongtien")
    private double tongTien;

    @Column(name = "tennguoinhan")
    private String tenNguoiNhan;

    @Column(name = "ngaynhan")
    private Date ngayNhan;

    @Column(name = "ngaytao")
    private Date ngayTao;

    @Column(name = "ngaysua")
    private Date ngaySua;

    @Column(name = "tienship")
    private double tienShip;

    @Column(name = "ngayship")
    private Date ngayShip;

    @Column(name = "ngaythanhtoan")
    private Date ngayThanhToan;

    @Column(name = "tongtiensaugiam")
    private double tongTienSauGiam;

    @Column(name = "hinhthucthanhtoan")
    private String hinhThucThanhToan;

    @Column(name = "phuongthucthanhtoan")
    private String phuongThucThanhToan;

    @Column(name = "trangthai")
    private Integer trangThai;

    @ManyToOne
    @JoinColumn(name = "idvoucher")
    private Voucher voucher;

    @ManyToOne
    @JoinColumn(name = "idnguoidung")
    private NguoiDung nguoiDung;

}
