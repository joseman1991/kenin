
package Constructor;


public class V_Especialidad {
    private int idesp;
    private String nesp;
       
    public V_Especialidad(){}
    
    public V_Especialidad(int idsp,String nsp){
        this.idesp=idsp;
        this.nesp=nsp;
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
     * @return the nesp
     */
    public String getNesp() {
        return nesp;
    }

    /**
     * @param nesp the nesp to set
     */
    public void setNesp(String nesp) {
        this.nesp = nesp;
    }
        public String toString(){
    return this.nesp;
}
}
