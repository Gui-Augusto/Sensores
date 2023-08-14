import java.util.ArrayList;
import java.util.List;

public class Lote {
    private long id;
    private List<Sensor> sensores;
    private boolean descartado;

    public Lote(long id, List<Sensor> sensores) {
        this.id = id;
        this.sensores = sensores;
        this.descartado = descartado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    public boolean getDescartado() {
        int defeito = 0;

        
        for (Sensor sensor : sensores) {

            if (sensor.getDefeito()) {
                defeito++;
            }

        }
        descartado = (double) defeito / (double) sensores.size() > 0.07;
        return descartado;
    }

    public void setDescartado(boolean descartado) {
        this.descartado = descartado;
    }

}

