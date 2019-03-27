
package Constructor;
public class V_Servicios {
    
        private int idserv;
        private String nserv;
        private int pserv;
        private String giva;
        private int idesp;
        private String freg;
       
    public V_Servicios(){}
    
    public V_Servicios(int idsvr,String nsvr,int psvr,String iva,int idsp,String fech){
        this.idserv=idsvr;
        this.nserv=nsvr;
        this.pserv=psvr;
        this.giva=iva;
        this.idesp=idsp;
        this.freg=fech;
    } 

    /**
     * @return the idserv
     */
    public int getIdserv() {
        return idserv;
    }

    /**
     * @param idserv the idserv to set
     */
    public void setIdserv(int idserv) {
        this.idserv = idserv;
    }

    /**
     * @return the nserv
     */
    public String getNserv() {
        return nserv;
    }

    /**
     * @param nserv the nserv to set
     */
    public void setNserv(String nserv) {
        this.nserv = nserv;
    }

    /**
     * @return the pserv
     */
    public int getPserv() {
        return pserv;
    }

    /**
     * @param pserv the pserv to set
     */
    public void setPserv(int pserv) {
        this.pserv = pserv;
    }

    /**
     * @return the giva
     */
    public String getGiva() {
        return giva;
    }

    /**
     * @param giva the giva to set
     */
    public void setGiva(String giva) {
        this.giva = giva;
    }

    /**
     * @return the idesp
     */
    public int getIdesp() {
        return idesp;
    }

    /**
     * @param idesp the idesp to set
     */
    public void setIdesp(int idesp) {
        this.idesp = idesp;
    }

    /**
     * @return the freg
     */
    public String getFreg() {
        return freg;
    }

    /**
     * @param freg the freg to set
     */
    public void setFreg(String freg) {
        this.freg = freg;
    }

public String toString(){
    return this.nserv;
}
}
