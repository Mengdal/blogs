package com.mdh.dao;

import com.mdh.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by mdh on 2019/10/16.
 */
public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);


    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
