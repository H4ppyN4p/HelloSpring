package com.example.jan15_firstspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@RestController

public class FirstController
{
    @GetMapping("/Rhello")
    public String getRhello(){

        return "Rhello World";
    }

    @GetMapping("/Rhelloto")
    public String getRhelloto(@RequestParam String input){
        return input;
    }


    @GetMapping("/CheckDay")
    public String getCheckDay(){
        DayOfWeek day = LocalDate.EPOCH.getDayOfWeek();
        if (day.getValue() == 5){
            return "Er det fredag? Ja!";
        } else {
            return "Er det fredag? Nej ;_;";
        }

    }




}
