public class Puplis {
    String name ;
    Puplis1 ALEKS ;
    Puplis2 VADIM ;
    Puplis3 ANTON ;
    Puplis4 IGOR ;
    Puplis5 ANDREI;

    public Puplis(String name, Puplis1 ALEKS, Puplis2 VADIM, Puplis3 ANTON, Puplis4 IGOR, Puplis5 ANDREI) {
        this.name = name;
        this.ALEKS = ALEKS;
        this.VADIM = VADIM;
        this.ANTON = ANTON;
        this.IGOR = IGOR;
        this.ANDREI = ANDREI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Puplis1 getALEKS() {
        return ALEKS;
    }

    public void setALEKS(Puplis1 ALEKS) {
        this.ALEKS = ALEKS;
    }

    public Puplis2 getVADIM() {
        return VADIM;
    }

    public void setVADIM(Puplis2 VADIM) {
        this.VADIM = VADIM;
    }

    public Puplis3 getANTON() {
        return ANTON;
    }

    public void setANTON(Puplis3 ANTON) {
        this.ANTON = ANTON;
    }

    public Puplis4 getIGOR() {
        return IGOR;
    }

    public void setIGOR(Puplis4 IGOR) {
        this.IGOR = IGOR;
    }

    public Puplis5 getANDREI() {
        return ANDREI;
    }

    public void setANDREI(Puplis5 ANDREI) {
        this.ANDREI = ANDREI;
    }

    @Override
    public String toString() {
        return "Puplis{" +
                "name='" + name + '\'' +
                ", ALEKS=" + ALEKS +
                ", VADIM=" + VADIM +
                ", ANTON=" + ANTON +
                ", IGOR=" + IGOR +
                ", ANDREI=" + ANDREI +
                '}';
    }
}
