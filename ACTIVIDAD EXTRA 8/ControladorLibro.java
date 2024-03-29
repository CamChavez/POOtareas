package Controlador;

import Vista.VentanaLibro;
import org.example.modelo.ModeloTablaLibro;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorLibro extends MouseAdapter{
    private VentanaLibro view;
    private ModeloTablaLibro modelo;

    public ControladorLibro(VentanaLibro view) {
        this.view = view;
        this.view.getBtnCaargar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnCaargar());
        modelo = new ModeloTablaLibro();
        modelo.cargarDatos();
        this.view.getTblLibro().setModel(modelo);
        //this.view.getTblLibro().updateUI();
    }
}
