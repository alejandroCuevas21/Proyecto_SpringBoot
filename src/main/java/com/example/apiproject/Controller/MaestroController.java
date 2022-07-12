package com.example.apiproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiproject.entity.maestro;
import com.example.apiproject.service.MaestroService;


@RestController
@RequestMapping("/Maestro")
public class MaestroController {
    
    @Autowired
    private MaestroService maestroService;

    @GetMapping
    public List<maestro> listar(){
        return maestroService.Listar();
    }

    @PostMapping
    public maestro insertar(@RequestBody maestro ma){
            return maestroService.insertar(ma);
    }

    @PutMapping
    public maestro actualizar(@RequestBody maestro ma)
    {
        return maestroService.actualizar(ma);
    }

     @DeleteMapping
     public void eliminar(@RequestBody maestro ma){

        maestroService.eliminar(ma);

     }


}
