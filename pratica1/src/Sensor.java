public class Sensor {

    private long id;
    private boolean defeito;


    public Sensor(long id) {
        this.id = id;

        double funciona = Math.random();

        this.defeito = funciona <= 0.05;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean getDefeito() {
        return defeito;
    }

    public void setDefeito(boolean defeito) {
        this.defeito = defeito;
    }

}
