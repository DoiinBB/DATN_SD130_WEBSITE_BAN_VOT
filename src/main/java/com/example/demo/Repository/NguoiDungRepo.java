package com.example.demo.Repository;

import com.example.demo.Entity.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguoiDungRepo extends JpaRepository<NguoiDung, String> {
}
