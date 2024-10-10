package com.example.demo.Repository;

import com.example.demo.Entity.DiaChi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaChiRepo extends JpaRepository<DiaChi,String> {
}
