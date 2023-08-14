import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Sensor> listSensores = new ArrayList<Sensor>();
        List<Lote> lotes = new ArrayList<Lote>();
        for (int i = 1; i <= 1000; i++) {


            Sensor sensor = new Sensor(i);
            listSensores.add(sensor);
        }

        for (int j = 1; j <= 20; j++) {
            List<Sensor> sensoresLote = new ArrayList<Sensor>();

            for (int h = 1; h <= 50; h++) {
                sensoresLote.add(listSensores.remove(0));
            }

            Lote lote = new Lote(j, sensoresLote);
            lotes.add(lote);

        }
        for (Lote lote : lotes
        ) {



            System.out.println("id: " + lote.getId() + " defeito: " + lote.getDescartado());
        }


    }
}