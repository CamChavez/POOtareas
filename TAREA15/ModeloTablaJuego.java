package JTable;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaJuego implements TableModel {
    public static final int COLS = 6;
    ArrayList<VideoJuego> datos;

    public ModeloTablaJuego(ArrayList<VideoJuego> datos) {
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = "";
        switch (columnIndex) {
            case 0:
                columnName = "ID";
                break;
            case 1:
                columnName = "NOMBRE";
                break;
            case 2:
                columnName = "GENERO";
                break;
            case 3:
                columnName = "PES0 EN GB";
                break;
            case 4:
                columnName = "PLATAFORMA";
                break;
            case 5:
                columnName = "DESARROLLADOR";
                break;
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
            case 4:
                return String.class;
            case 5:
                return String.class;

        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VideoJuego tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
                case 1:
                return tmp.getNombre();
                case 2:
                return tmp.getGenero();
                case 3:
                return tmp.getPesoEnGb();
                case 4:
                return tmp.getPlataforma();
                case 5:
                return tmp.getDesarrollador();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void agregarJuego (VideoJuego juego){
        this.datos.add(juego);
    }
}
