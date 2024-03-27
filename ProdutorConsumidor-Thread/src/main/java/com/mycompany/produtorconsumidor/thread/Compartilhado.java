/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produtorconsumidor.thread;

/**
 *
 * @author Jorge
 */
/**
 * Classe que contém o buffer a ser compartilhado 
 * entre o produto e o consumidor.
 */
public class Compartilhado {
    private int buffer;
    private int tamanhoBuffer;

    public Compartilhado() {
		this(0,5)
	 }
    
    public Compartilhado(int buffer, int tamanhoBuffer) {
		setBuffer(buffer);
         setTamanhoBuffer(tamanhoBuffer);
    }

	 //Gets e sets    
    public synchronized void consumir() {
		setBuffer(getBuffer() - 1);
    }

    public synchronized void produzir() {
		setBuffer(getBuffer() + 1);
    }
}