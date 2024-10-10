package com.example.demo.Repository;

import com.example.demo.Entity.Loai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiRepo extends JpaRepository<Loai,String> {
}
