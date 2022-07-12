package com.example.apiproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiproject.entity.maestro;
import com.example.apiproject.repo.MaestroRepo;


@Service
public class MaestroService  {
    
    @Autowired
    private MaestroRepo maestrorepo;


    public maestro insertar(maestro ma) {
        return maestrorepo.save(ma);
    }

    public maestro actualizar(maestro ma){
            return maestrorepo.save(ma);
    }

    public List<maestro> Listar(){
        return maestrorepo.findAll();
    }

    public void eliminar(maestro ma)
    {
        maestrorepo.delete(ma);
    }

    public void eliminarMaestro(int id)
    {
        maestrorepo.deleteById(id);
    }

}
