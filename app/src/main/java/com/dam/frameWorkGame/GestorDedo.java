/**
 * DESARROLLO DE APLICACIONES MULTIPLATAFORMA
 * MODULO: PROGRAMACION MULTIMEDIA Y DISPOSITIVOS MOVILES
 * CENTRO: COLEGIO STMA TRINIDAD
 * CURSO: 2016-2017
 **/
package com.dam.frameWorkGame;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

import java.util.ArrayList;

public class GestorDedo implements OnTouchListener{
    private EventoTocar eventoTocar;
    private boolean pantallaTocada;
    private Game game;
    public static class EventoTocar {
        public int tipoEvento;
        public int x, y;
    }
    public GestorDedo(Game game,Vista vista){
        this.game=game;
        vista.setOnTouchListener(this);
        eventoTocar=new EventoTocar();
        pantallaTocada=false;
    }

    public boolean isTocada(){
        return pantallaTocada;
    }

    public EventoTocar getTouchEvento(){
        pantallaTocada=false;
        return eventoTocar;
    }

    public boolean onTouch(View v, MotionEvent event) {
        eventoTocar.x=(int) event.getX();
        eventoTocar.y=(int) event.getY();
        pantallaTocada=true;
        return false;
    }

}

