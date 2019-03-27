
package Constructor;


public class V_Pacientes {
        private String ced;
        private String nom;
        private String edad;
        private String sexo;
        private String telf;
        private String freg;
        private String iduser;
       
    public V_Pacientes(){}
    
    public V_Pacientes(String cedula,String nomb,String eda,String sex,String tel,String fregis,String idus){
        this.ced=cedula;
        this.nom=nomb;
        this.edad=eda;
        this.sexo=sex;
        this.telf=tel;
        this.freg=fregis;
        this.iduser=idus;
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
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the telf
     */
    public String getTelf() {
        return telf;
    }

    /**
     * @param telf the telf to set
     */
    public void setTelf(String telf) {
        this.telf = telf;
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

    /**
     * @return the iduser
     */
    public String getIduser() {
        return iduser;
    }

    /**
     * @param iduser the iduser to set
     */
    public void setIduser(String iduser) {
        this.iduser = iduser;
    }
}
