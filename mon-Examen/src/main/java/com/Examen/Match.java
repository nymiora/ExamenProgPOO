package com.Examen;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@Setter
@Getter
public class Match {
    private int id;
    private Date date;
    private String endroit;
    private TypeMatch typeMacth;
    private Combattants combattants;

    public <palmares> void match(TypeMatch match, palmares){
    }
}

