package BazeDeDate.main;

import BazeDeDate.classes.ConexiuneDB;

public class Main {
    public static void main(String[] args) {

        ConexiuneDB conn = ConexiuneDB.getInstance("alo baza baza", 5, "alo delta force");

        conn.setNumeDB("fanuc");

        System.out.println(conn);
    }
}