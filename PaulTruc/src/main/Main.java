package main;

import java.io.IOException;

import lecture.Lecture;
import vue.Fenetre;

public class Main {

	public static void main (String[] args) throws IOException {
		Fenetre fenetre = new Fenetre();
		Lecture.lireExcel();
	}
}
