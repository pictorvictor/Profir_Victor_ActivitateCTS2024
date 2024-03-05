package BazeDeDate.classes;

public class ConexiuneDB {
    private String numeDB;

    public String getNumeDB() {
        return numeDB;
    }

    public void setNumeDB(String numeDB) {
        this.numeDB = numeDB;
    }

    public int getNrTabele() {
        return nrTabele;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public static ConexiuneDB getInstanta() {
        return instanta;
    }

    public static void setInstanta(ConexiuneDB instanta) {
        ConexiuneDB.instanta = instanta;
    }

    public String getLinkConexiune() {
        return linkConexiune;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }

    private int nrTabele;
    private static ConexiuneDB instanta = null;
    private String linkConexiune;

    private ConexiuneDB(String numeDB, int nrTabele, String linkConexiune) {
        this.numeDB = numeDB;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    public static ConexiuneDB getInstance(String numeDB, int nrTabele, String linkConexiune) {
        if (instanta == null) {
            instanta = new ConexiuneDB(numeDB, nrTabele, linkConexiune);
        }
        return instanta;
    }
}
