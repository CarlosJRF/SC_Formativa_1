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

    @GetMapping
    public String mostrarCitas(Model model) {
        model.addAttribute("citas", ListadoCitas);
        return "citas";

        }
}
