package com.prog3.ApiRest.repositories;

import com.prog3.ApiRest.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor,Long> {
}
