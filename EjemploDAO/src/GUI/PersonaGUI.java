package GUI;
import Model1.Persona;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.List;
import java.util.ArrayList;


public class PersonaGUI extends JFrame {

    private JTextField idField, nombreField, edadField, sexoField, bienvenidaField;
    private JTextArea displayArea;
    private JButton actualizarButton, eliminarButton;
    private List<Persona> personas;
    private String archivo = "C:\\Users\\si\\OneDrive\\Documentos\\CODIGOS/persona.txt";

    public PersonaGUI() {
        
        // Configuración del JFrame
        super("Gestor de Personas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650, 600);

        // Configuración del JPanel
        JPanel panel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);

         // Campos de texto y etiquetas
        JLabel bienvenidaLabel = new JLabel ("BIENVENIDO AL GESTOR DE PERSONAS, POR FAVOR, INGRESA LOS SIGUIENTES DATOS");
        bienvenidaField = new JTextField();
        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField();
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField();
        JLabel sexoLabel = new JLabel ("Sexo:");
        sexoField = new JTextField();
        JLabel edadLabel = new JLabel("Edad:");
        edadField = new JTextField();

        // Configuración del JPanel para los botones
        JPanel buttonPanel = new JPanel(new GridLayout(2, 1)); // 2 filas, 1 columna

        // Subpaneles para las filas de botones
        JPanel row1Panel = new JPanel(new GridLayout(1, 2)); // 1 fila, 2 columnas
        JPanel row2Panel = new JPanel(new GridLayout(1, 2)); // 1 fila, 2 columnas

        // Botones
        JButton agregarButton = new JButton("Agregar");
        JButton mostrarButton = new JButton("Mostrar");
        actualizarButton = new JButton("Actualizar");
        eliminarButton = new JButton("Eliminar");
         JButton salirButton = new JButton("Salir");

        // Agregar botones a los subpaneles
        row1Panel.add(mostrarButton);
        row1Panel.add(agregarButton);
        row2Panel.add(actualizarButton);
        row2Panel.add(eliminarButton);
        
        // Botón Salir        
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Llamada a un método para cerrar la aplicación
                cerrarAplicacion();
            }
        });
        row2Panel.add(salirButton);


        // Agregar subpaneles al panel de botones
        buttonPanel.add(row1Panel);
        buttonPanel.add(row2Panel);

        // Área de visualización
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

// Acciones de los botones
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarPersona();
            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPersonas();
            }
        });

        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarPersona();
            }
        });

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarPersona();
            }
        });

        // Agregar componentes al panel principal
        panel.add(bienvenidaLabel);
        panel.add(idLabel);
        panel.add(idField);
        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(sexoLabel);
        panel.add(sexoField);
        panel.add(edadLabel);
        panel.add(edadField);
        panel.add(buttonPanel);// Agregar el panel de botones en lugar de los botones individuales

        // Agregar el panel de botones al panel principal
        panel.add(buttonPanel);

        // Configuración del JFrame
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void agregarPersona() {
        int id = Integer.parseInt(idField.getText());
        String nombre = nombreField.getText();
        int edad = Integer.parseInt(edadField.getText());
        String sexo = sexoField.getText();

        Persona persona = new Persona(id, nombre,sexo, edad);
        personas = listarPersonas();
        personas.add(persona);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            for (Persona p : personas) {
                oos.writeObject(p);
            }
            JOptionPane.showMessageDialog(this, "Persona agregada exitosamente.");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al agregar persona.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        limpiarCampos();
    }

    private void mostrarPersonas() {
        personas = listarPersonas();
        displayArea.setText("");

        for (Persona persona : personas) {
            displayArea.append(persona.toString() + "\n");
        }
    }

    private List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Persona) {
                        Persona persona = (Persona) obj;
                        personas.add(persona);
                    }
                } catch (EOFException e) {
                    break; // Fin del archivo
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            // El archivo aún no existe o está vacío, no es un error
        }

        return personas;
    }

    private void limpiarCampos() {
        idField.setText("");
        nombreField.setText("");
        edadField.setText("");
    }
    private void actualizarPersona() {
        int id = Integer.parseInt(idField.getText());
        String nombre = nombreField.getText();
        int edad = Integer.parseInt(edadField.getText());
        String sexo = sexoField.getText();

        Persona nuevaPersona = new Persona(id, nombre,sexo, edad);
        personas = listarPersonas();

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getId() == id) {
                personas.set(i, nuevaPersona);

                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
                    for (Persona p : personas) {
                        oos.writeObject(p);
                    }
                    JOptionPane.showMessageDialog(this, "Persona actualizada exitosamente.");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error al actualizar persona.", "Error", JOptionPane.ERROR_MESSAGE);
                }

                limpiarCampos();
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Persona no encontrada para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void eliminarPersona() {
    int id = Integer.parseInt(idField.getText());
    personas = listarPersonas();

    // Crear una nueva lista para almacenar las personas actualizadas
    List<Persona> personasActualizadas = new ArrayList<>();

    for (Persona persona : personas) {
        if (persona.getId() != id) {
            personasActualizadas.add(persona);
        }
    }

    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
        for (Persona p : personasActualizadas) {
            oos.writeObject(p);
        }
        JOptionPane.showMessageDialog(this, "Persona eliminada exitosamente.");
    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al eliminar persona.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    limpiarCampos();
}
    private void cerrarAplicacion() {
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Estás seguro de que deseas salir?",
                "Confirmar salida", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            System.exit(0); // Cierra la aplicación
        }
    }

    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PersonaGUI().setVisible(true);
            }
        });
    }
}