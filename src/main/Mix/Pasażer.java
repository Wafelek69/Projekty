package klasy;

public class Pasażer extends Człowiek implements Comparable<Pasażer>{


    private int rejestrowanyBagaż;
    private int podrecznyBagaż;
    private  double oplataZaBagaz;


    public static class ProgramLojalnościowy

    {

        public int getPoziomCzłonkowstwa() {
            return poziomCzłonkowstwa;
        }

        public void setPoziomCzłonkowstwa(int poziomCzłonkowstwa) {
            this.poziomCzłonkowstwa = poziomCzłonkowstwa;
        }

        public int getDniCzłonkowstwa() {
            return dniCzłonkowstwa;
        }

        public void setDniCzłonkowstwa(int dniCzłonkowstwa) {
            this.dniCzłonkowstwa = dniCzłonkowstwa;
        }

        private int poziomCzłonkowstwa;
        private int dniCzłonkowstwa;








    }

    private ProgramLojalnościowy programLojalnościowy;

    public ProgramLojalnościowy getProgramLojalnościowy() {
        return programLojalnościowy;
    }

    public void setProgramLojalnościowy(ProgramLojalnościowy programLojalnościowy) {
        this.programLojalnościowy = programLojalnościowy;
    }





    public Pasażer (){
        programLojalnościowy = new ProgramLojalnościowy();
    }

    public Pasażer(int podrecznyBagaż){
        this (podrecznyBagaż > 1 ? 25.0 : 50.0);
        this.podrecznyBagaż = podrecznyBagaż;
    }


    public Pasażer ( int podrecznyBagaż, int rejestrowanyBagaż){
        this(podrecznyBagaż);
        this.rejestrowanyBagaż = rejestrowanyBagaż;
    }
    private Pasażer (double oplataZaBagaz){
        this.oplataZaBagaz = oplataZaBagaz;

    }


    public void setPoziomCzłonkowstwaIDniCzłonkowstwa (int poziomCzłonkowstwa, int dniCzłonkowstwa){
        this.programLojalnościowy.poziomCzłonkowstwa = poziomCzłonkowstwa;
        this.programLojalnościowy.dniCzłonkowstwa = dniCzłonkowstwa;}





    public int getRejestrowanyBagaż(){
        return rejestrowanyBagaż;
    }
    public void setRejestrowanyBagaż(int rejestrowanyBagaż){
        this.rejestrowanyBagaż = rejestrowanyBagaż;
    }

    public int getPodrecznyBagaż(){
        return podrecznyBagaż;
    }
    public void setPodrecznyBagaż (int podrecznyBagaż){
        this.podrecznyBagaż = podrecznyBagaż;
    }

      public double getOplataZaBagaż(){
        return oplataZaBagaz;
      }
      public void  setOplataZaBagaż (double oplataZaBagaz){
        this.oplataZaBagaz = oplataZaBagaz;
      }









      @Override

      public int compareTo (Pasażer p){

        if(programLojalnościowy.poziomCzłonkowstwa > p.programLojalnościowy.poziomCzłonkowstwa){
            return -1;
        }else if (programLojalnościowy.poziomCzłonkowstwa < p.programLojalnościowy.poziomCzłonkowstwa){
            return 1;
        } else {
            if (programLojalnościowy.dniCzłonkowstwa >p.programLojalnościowy.dniCzłonkowstwa){
                return -1;
            } else if (programLojalnościowy.dniCzłonkowstwa < p.programLojalnościowy.dniCzłonkowstwa){
                return 1;
            }else{
                return 0;
            }
        }

      }
//
//    @Override
//    public String toString() {
//        return "Pasażer{" +
//                "poziomCzłonkowstwa=" + poziomCzłonkowstwa +
//                ", dniCzłonkowstwa=" + dniCzłonkowstwa+
//                //", oplataZaBagaz=" + oplataZaBagaz +
//                '}';
//    }





}
