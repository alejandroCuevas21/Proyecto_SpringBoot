
package com.example.apiproject.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apiproject.entity.maestro;


@Repository
public interface MaestroRepo extends JpaRepository<maestro, Integer> {
    

}
