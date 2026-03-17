package com.example.demo.controller;

import com.example.demo.model.Cita;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/citas")
public class Controlador {

    private static List<Cita> ListadoCitas = new ArrayList<>();

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("cita", new Cita());
        return "formulario-cita";
    }

    @PostMapping("/guardar")
    public String guardarCita(@ModelAttribute Cita cita) {
        cita.setId((long) (ListadoCitas.size() + 1)); // As ignar un ID único
        ListadoCitas.add(cita);
        return "redirect:/citas/ver";
    }

    @GetMapping
    public String verCitas(Model model) {
        model.addAttribute("citas", ListadoCitas);
        return "Listado-citas";

        }
}
