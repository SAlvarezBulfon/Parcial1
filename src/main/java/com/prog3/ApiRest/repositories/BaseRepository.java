package com.prog3.ApiRest.repositories;

import com.prog3.ApiRest.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E,ID> {
}