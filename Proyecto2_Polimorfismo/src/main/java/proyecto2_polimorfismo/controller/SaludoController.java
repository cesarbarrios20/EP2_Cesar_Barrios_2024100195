/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_polimorfismo.controller;

/**
 *
 * @author laboratorioasu
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // (4) Anotación para declarar el controlador web
public class SaludoController {
    
    @GetMapping("/saludo")
    @ResponseBody
    public String mostrar() {
        return "saludo";
    }
}