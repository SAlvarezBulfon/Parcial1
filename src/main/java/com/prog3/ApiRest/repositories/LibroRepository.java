package com.prog3.ApiRest.repositories;

import com.prog3.ApiRest.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}
