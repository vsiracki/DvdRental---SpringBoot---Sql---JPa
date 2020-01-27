package com.example.demo.repositories;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Store;


@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {

}
