
package Constructor;


public class V_Facturas {
    
        private int idfact;
        private String ced;
        private String cedd;
        private int cant;
        
        private String detallefact;
        private double pnit;
        private double iva;
        private double tneto;
        
        private String fecha;
        private int iduser;
      
    public V_Facturas(){}
    
    public V_Facturas(int idfac,String cedp,String ceddd,int canti,String detallef,double puni,
            double iv,double tonet,String fech,int idusr){
        
        this.idfact=idfac;
        this.ced=cedp;
        this.cedd=ceddd;
        this.cant=canti;
        this.detallefact=detallef;
        this.pnit=puni;
        this.iva=iv;
        this.tneto=tonet;
        this.fecha=fech;
        this.iduser=idusr;
    } 

    /**
     * @return the idfact
     */
    public int getIdfact() {
        return idfact;
    }

    /**
     * @param idfact the idfact to set
     */
    public void setIdfact(int idfact) {
        this.idfact = idfact;
    }

    /**
     * @return the ced
     */
    public String getCed() {
        return ced;
    }

    /**
     * @param ced the ced to set
     */
    public void setCed(String ced) {
        this.ced = ced;
    }

    /**
     * @return the cedd
     */
    public String getCedd() {
        return cedd;
    }

    /**
     * @param cedd the cedd to set
     */
    public void setCedd(String cedd) {
        this.cedd = cedd;
    }

    /**
     * @return the cant
     */
    public int getCant() {
        return cant;
    }

    /**
     * @param cant the cant to set
     */
    public void setCant(int cant) {
        this.cant = cant;
    }

    /**
     * @return the detallefact
     */
    public String getDetallefact() {
        return detallefact;
    }

    /**
     * @param detallefact the detallefact to set
     */
    public void setDetallefact(String detallefact) {
        this.detallefact = detallefact;
    }

    /**
     * @return the pnit
     */
    public double getPnit() {
        return pnit;
    }

    /**
     * @param pnit the pnit to set
     */
    public void setPnit(double pnit) {
        this.pnit = pnit;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    /**
     * @return the tneto
     */
    public double getTneto() {
        return tneto;
    }

    /**
     * @param tneto the tneto to set
     */
    public void setTneto(double tneto) {
        this.tneto = tneto;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the iduser
     */
    public int getIduser() {
        return iduser;
    }

    /**
     * @param iduser the iduser to set
     */
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }
}
