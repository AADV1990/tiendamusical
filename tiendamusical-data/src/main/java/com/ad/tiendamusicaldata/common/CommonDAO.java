package com.ad.tiendamusicaldata.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;
import java.util.List;

//clase generica que representa los metodos de crud que se utiliza en todas las entidades
//E significa la entidad, R el repositorio
public class CommonDAO<E,id,R extends PagingAndSortingRepository<E,id>> {
   // @Autowired
    protected R repository;

    public List<E> consultarListaPaginable(int desde,int hasta,String orderBy){
        PageRequest pageable = PageRequest.of(desde,hasta, Sort.by(orderBy));
        Page<E> page = this.repository.findAll(pageable);
        return page.getContent();

    }

    public E guardar(E e) {
        return this.repository.save(e);
    }

    public E actualizar(E e) {
        return this.repository.save(e);
    }

    public  void  eliminar(E e) {
         this.repository.delete(e);
    }
}
