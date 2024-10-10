package com.example.demo.Repository;

import com.example.demo.Entity.DoCungThan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoCungThanRepo extends JpaRepository<DoCungThan, String> {
}
