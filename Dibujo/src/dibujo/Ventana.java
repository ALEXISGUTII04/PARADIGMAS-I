
package dibujo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ventana extends JFrame {
    
    private JPanel p123; //PANELES QUE PARPADEARAN
    private JPanel p124;
    private JPanel p125;
    private JPanel p126;
    private JPanel p127;
    private JPanel p128;
    
    private JPanel p135; //PANELES DEL OJO DERECHO 
    private JPanel p136;
    private JPanel p137;
    private JPanel p138;
    private JPanel p139;
    private JPanel p140;
  
      private Color color1 = Color.WHITE;      
      private Color color2 = Color.GREEN;
      private Timer timer;
      
      private JPanel movimientoPanel; // Nuevo panel para el movimiento
       private JPanel spidermanPanel;

     
  public Ventana () {                     
      
      this.setLayout(null);
      this.setTitle("Spider-Man");
      this.setSize(2000, 2000);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
          // Crear el panel para Spiderman
        spidermanPanel = new JPanel();
        spidermanPanel.setLayout(null);
        spidermanPanel.setBounds(40, 40, 220, 220); // Ajusta las coordenadas y dimensiones según tus necesidades
        //Paneles que conforman a Spiderman
         //COLOR NEGRO 
      JPanel p0 = new JPanel();
      p0.setBounds(560, 80, 140, 20);
      p0.setBackground(Color.BLACK);
      this.add(p0);
            
      JPanel p2 = new JPanel ();
      p2.setBounds (700,100,20,20);
      p2.setBackground (Color.BLACK);
      this.add(p2);
      
      JPanel p3 = new JPanel ();
      p3.setBounds (720,120,20,20);
      p3.setBackground (Color.BLACK);
      this.add(p3);
      
      JPanel p4 = new JPanel ();
      p4.setBounds (740,140,20,20);
      p4.setBackground (Color.BLACK);
      this.add(p4);
      
      JPanel p5 = new JPanel ();
      p5.setBounds (760,160,20,120);
      p5.setBackground (Color.BLACK);
      this.add(p5);
      
      JPanel p6 = new JPanel ();
      p6.setBounds (740,280,20,60);
      p6.setBackground (Color.BLACK);
      this.add(p6);
      
      JPanel p7 = new JPanel ();
      p7.setBounds (720,280,20,20);
      p7.setBackground (Color.BLACK);
      this.add(p7);
      
      JPanel p8 = new JPanel ();
      p8.setBounds (720,320,20,20);
      p8.setBackground (Color.BLACK);
      this.add(p8);
      
      JPanel p9 = new JPanel ();
      p9.setBounds (700,340,20,20);
      p9.setBackground (Color.BLACK);
      this.add(p9);
      
      JPanel p10 = new JPanel ();
      p10.setBounds (680,340,20,20);
      p10.setBackground (Color.BLACK);
      this.add(p10);
      
      JPanel p11 = new JPanel ();
      p11.setBounds (720,360,20,20);
      p11.setBackground (Color.BLACK);
      this.add(p11);
      
      JPanel p12 = new JPanel ();
      p12.setBounds (740,380,20,20);
      p12.setBackground (Color.BLACK);
      this.add(p12);
      
      JPanel p13 = new JPanel ();
      p13.setBounds (760,400,20,20);
      p13.setBackground (Color.BLACK);
      this.add(p13);
      
      JPanel p14 = new JPanel ();
      p14.setBounds (780,420,20,20);
      p14.setBackground (Color.BLACK);
      this.add(p14);
      
      JPanel p15 = new JPanel ();
      p15.setBounds (780,440,20,20);
      p15.setBackground (Color.BLACK);
      this.add(p15);
      
      JPanel p16 = new JPanel ();
      p16.setBounds (760,460,20,20);
      p16.setBackground (Color.BLACK);
      this.add(p16);
      
      JPanel p17 = new JPanel ();
      p17.setBounds (740,460,20,20);
      p17.setBackground (Color.BLACK);
      this.add(p17);
      
      JPanel p18 = new JPanel ();
      p18.setBounds (720,480,20,20);
      p18.setBackground (Color.BLACK);
      this.add(p18);
      
      JPanel p19 = new JPanel ();
      p19.setBounds (720,500,20,20);
      p19.setBackground (Color.BLACK);
      this.add(p19);
      
      JPanel p20 = new JPanel ();
      p20.setBounds (720,520,20,20);
      p20.setBackground (Color.BLACK);
      this.add(p20);
      
      JPanel p21 = new JPanel ();
      p21.setBounds (720,440,20,20);
      p21.setBackground (Color.BLACK);
      this.add(p21);
   
      JPanel p22 = new JPanel ();
      p22.setBounds (700,420,20,20);
      p22.setBackground (Color.BLACK);
      this.add(p22);
      
      JPanel p23 = new JPanel ();
      p23.setBounds (700,400,20,20);
      p23.setBackground (Color.BLACK);
      this.add(p23);
      
      JPanel p24 = new JPanel ();
      p24.setBounds (700,460,20,20);
      p24.setBackground (Color.BLACK);
      this.add(p24);
      
      JPanel p25 = new JPanel ();
      p25.setBounds (700,440,20,20);
      p25.setBackground (Color.BLACK);
      this.add(p25);
      //COLOR AZUL
      JPanel p26 = new JPanel ();
      p26.setBounds (720,420,20,20);
      p26.setBackground (Color.BLUE);
      this.add(p26);
      
      JPanel p27 = new JPanel ();
      p27.setBounds (720,400,20,20);
      p27.setBackground (Color.BLUE);
      this.add(p27);
      
      JPanel p28 = new JPanel ();
      p28.setBounds (740,400,20,20);
      p28.setBackground (Color.BLUE);
      this.add(p28);
      //COLOR ROJO
      JPanel p29 = new JPanel ();
      p29.setBounds (740,440,20,20);
      p29.setBackground (Color.RED);
      this.add(p29);
      
      JPanel p30 = new JPanel ();
      p30.setBounds (740,420,20,20);
      p30.setBackground (Color.RED);
      this.add(p30);
      
      JPanel p31 = new JPanel ();
      p31.setBounds (760,420,20,20);
      p31.setBackground (Color.RED);
      this.add(p31);
     
      JPanel p32 = new JPanel ();
      p32.setBounds (760,440,20,20);
      p32.setBackground (Color.RED);
      this.add(p32);
      
      JPanel p33 = new JPanel ();
      p33.setBounds (740,520,20,60);
      p33.setBackground (Color.BLACK);
      this.add(p33);
      
      //LADO IZQUIERDO COLOR NEGRO
      JPanel p37 = new JPanel ();
      p37.setBounds (540,100,20,20);
      p37.setBackground (Color.BLACK);
      this.add(p37);
      
      JPanel p38 = new JPanel ();
      p38.setBounds (520,120,20,20);
      p38.setBackground (Color.BLACK);
      this.add(p38);
      
      JPanel p39 = new JPanel ();
      p39.setBounds (500,140,20,20);
      p39.setBackground (Color.BLACK);
      this.add(p39);
      
      JPanel p40 = new JPanel ();
      p40.setBounds (480,160,20,120);
      p40.setBackground (Color.BLACK);
      this.add(p40);
      
      JPanel p41 = new JPanel ();
      p41.setBounds (520,160,20,20);
      p41.setBackground (Color.BLACK);
      this.add(p41);
      
      JPanel p42 = new JPanel ();
      p42.setBounds (540,160,20,20);
      p42.setBackground (Color.BLACK);
      this.add(p42);
      
      JPanel p43 = new JPanel ();
      p43.setBounds (500,180,20,20);
      p43.setBackground (Color.BLACK);
      this.add(p43);
      
      JPanel p44 = new JPanel ();
      p44.setBounds (580,200,20,20);
      p44.setBackground (Color.BLACK);
      this.add(p44);
      
      JPanel p45 = new JPanel ();
      p45.setBounds (560,180,20,20);
      p45.setBackground (Color.BLACK);
      this.add(p45);
      
      JPanel p46 = new JPanel ();
      p46.setBounds (600,220,20,20);
      p46.setBackground (Color.BLACK);
      this.add(p46);
      
      JPanel p47 = new JPanel ();
      p47.setBounds (620,240,20,20);
      p47.setBackground (Color.BLACK);
      this.add(p47);
      
      JPanel p48 = new JPanel ();
      p48.setBounds (620,240,20,40);
      p48.setBackground (Color.BLACK);
      this.add(p48);
      
      JPanel p49 = new JPanel ();
      p49.setBounds (640,220,20,20);
      p49.setBackground (Color.BLACK);
      this.add(p49);
      
      JPanel p50 = new JPanel ();
      p50.setBounds (660,200,20,20);
      p50.setBackground (Color.BLACK);
      this.add(p50);
      
      JPanel p51 = new JPanel ();
      p51.setBounds (680,180,20,20);
      p51.setBackground (Color.BLACK);
      this.add(p51);
      
      JPanel p52 = new JPanel ();
      p52.setBounds (700,160,40,20);
      p52.setBackground (Color.BLACK);
      this.add(p52);
      
      JPanel p53 = new JPanel ();
      p53.setBounds (740,180,20,20);
      p53.setBackground (Color.BLACK);
      this.add(p53);
      
      JPanel p54 = new JPanel ();
      p54.setBounds (560,180,20,20);
      p54.setBackground (Color.BLACK);
      this.add(p54);
      
      JPanel p55 = new JPanel ();
      p55.setBounds (600,280,20,20);
      p55.setBackground (Color.BLACK);
      this.add(p55);
      
      JPanel p56 = new JPanel ();
      p56.setBounds (640,280,20,20);
      p56.setBackground (Color.BLACK);
      this.add(p56);
      
      JPanel p57 = new JPanel ();
      p57.setBounds (660,300,60,20);
      p57.setBackground (Color.BLACK);
      this.add(p57);
      
      JPanel p58 = new JPanel ();
      p58.setBounds (540,300,60,20);
      p58.setBackground (Color.BLACK);
      this.add(p58);
      
      JPanel p59 = new JPanel ();
      p59.setBounds (520,280,20,20);
      p59.setBackground (Color.BLACK);
      this.add(p59);
      
      JPanel p60 = new JPanel ();
      p60.setBounds (500,280,20,40);
      p60.setBackground (Color.BLACK);
      this.add(p60);
      
      JPanel p61 = new JPanel ();
      p61.setBounds (520,320,20,20);
      p61.setBackground (Color.BLACK);
      this.add(p61);
      
      JPanel p62 = new JPanel ();
      p62.setBounds (540,340,40,20);
      p62.setBackground (Color.BLACK);
      this.add(p62);
      
      JPanel p63 = new JPanel ();
      p63.setBounds (580,360,100,20);
      p63.setBackground (Color.BLACK);
      this.add(p63);
      
      JPanel p64 = new JPanel ();
      p64.setBounds (520,360,20,20);
      p64.setBackground (Color.BLACK);
      this.add(p64);
      
      JPanel p65 = new JPanel ();
      p65.setBounds (500,380,20,20);
      p65.setBackground (Color.BLACK);
      this.add(p65);
      
      JPanel p66 = new JPanel ();
      p66.setBounds (480,400,20,20);
      p66.setBackground (Color.BLACK);
      this.add(p66);
      
      JPanel p67 = new JPanel ();
      p67.setBounds (460,420,20,40);
      p67.setBackground (Color.BLACK);
      this.add(p67);
      
      JPanel p68 = new JPanel ();
      p68.setBounds (480,460,40,20);
      p68.setBackground (Color.BLACK);
      this.add(p68);
      
      JPanel p69 = new JPanel ();
      p69.setBounds (520,440,20,20);
      p69.setBackground (Color.BLACK);
      this.add(p69);
      
      JPanel p70 = new JPanel ();
      p70.setBounds (540,400,20,80);
      p70.setBackground (Color.BLACK);
      this.add(p70);
      
      JPanel p71 = new JPanel ();
      p71.setBounds (580,420,20,20);
      p71.setBackground (Color.BLACK);
      this.add(p71);
      
      JPanel p72 = new JPanel ();
      p72.setBounds (600,400,60,20);
      p72.setBackground (Color.BLACK);
      this.add(p72);
      
      JPanel p73 = new JPanel ();
      p73.setBounds (620,420,20,20);
      p73.setBackground (Color.BLACK);
      this.add(p73);
      
      JPanel p74 = new JPanel ();
      p74.setBounds (660,420,20,20);
      p74.setBackground (Color.BLACK);
      this.add(p74);
      
      JPanel p75 = new JPanel ();
      p75.setBounds (620,380,20,20);
      p75.setBackground (Color.BLACK);
      this.add(p75);
      
      JPanel p76 = new JPanel ();
      p76.setBounds (520,480,20,60);
      p76.setBackground (Color.BLACK);
      this.add(p76);
      
      JPanel p77 = new JPanel ();
      p77.setBounds (500,520,20,60);
      p77.setBackground (Color.BLACK);
      this.add(p77);
      
      JPanel p78 = new JPanel ();
      p78.setBounds (500,560,80,20);
      p78.setBackground (Color.BLACK);
      this.add(p78);
      
      JPanel p79 = new JPanel ();
      p79.setBounds (580,520,20,60);
      p79.setBackground (Color.BLACK);
      this.add(p79);
      
      JPanel p80 = new JPanel ();
      p80.setBounds (600,500,60,20);
      p80.setBackground (Color.BLACK);
      this.add(p80);
      
      JPanel p81 = new JPanel ();
      p81.setBounds (660,520,20,60);
      p81.setBackground (Color.BLACK);
      this.add(p81);
      
      JPanel p82 = new JPanel ();
      p82.setBounds (660,560,80,20);
      p82.setBackground (Color.BLACK);
      this.add(p82);
      //COLOR ROJO DE LA CABEZA
      JPanel p83 = new JPanel ();
      p83.setBounds (560,100,140,20);
      p83.setBackground (Color.RED);
      this.add(p83);
      
      JPanel p84 = new JPanel ();
      p84.setBounds (540,120,180,20);
      p84.setBackground (Color.RED);
      this.add(p84);
      
      JPanel p85 = new JPanel ();
      p85.setBounds (520,140,220,20);
      p85.setBackground (Color.RED);
      this.add(p85);
      
      JPanel p86 = new JPanel ();
      p86.setBounds (560,160,140,20);
      p86.setBackground (Color.RED);
      this.add(p86);
      
      JPanel p87 = new JPanel ();
      p87.setBounds (580,180,100,20);
      p87.setBackground (Color.RED);
      this.add(p87);
      
      JPanel p88 = new JPanel ();
      p88.setBounds (600,200,60,20);
      p88.setBackground (Color.RED);
      this.add(p88);
      
      JPanel p89 = new JPanel ();
      p89.setBounds (620,220,20,20);
      p89.setBackground (Color.RED);
      this.add(p89);
      
      JPanel p90 = new JPanel ();
      p90.setBounds (500,160,140,20);
      p90.setBackground (Color.RED);
      this.add(p90);
      
      JPanel p91 = new JPanel ();
      p91.setBounds (740,160,20,20);
      p91.setBackground (Color.RED);
      this.add(p91);
      
      JPanel p92 = new JPanel ();
      p92.setBounds (620,280,20,20);
      p92.setBackground (Color.RED);
      this.add(p92);
      
      JPanel p93 = new JPanel ();
      p93.setBounds (600,300,60,20);
      p93.setBackground (Color.RED);
      this.add(p93);
      
      JPanel p94 = new JPanel ();
      p94.setBounds (520,300,20,20);
      p94.setBackground (Color.RED);
      this.add(p94);
      
      JPanel p95 = new JPanel ();
      p95.setBounds (540,320,180,20);
      p95.setBackground (Color.RED);
      this.add(p95);
      
      JPanel p96 = new JPanel ();
      p96.setBounds (720,300,20,20);
      p96.setBackground (Color.RED);
      this.add(p96);
      
      JPanel p97 = new JPanel ();
      p97.setBounds (580,340,100,20);
      p97.setBackground (Color.RED);
      this.add(p97);
      
      JPanel p98 = new JPanel ();
      p98.setBounds (540,360,180,20);
      p98.setBackground (Color.RED);
      this.add(p98);
      
      JPanel p99 = new JPanel ();
      p99.setBounds (520,380,240,20);
      p99.setBackground (Color.RED);
      this.add(p99);
      
      JPanel p100 = new JPanel ();
      p100.setBounds (500,400,80,20);
      p100.setBackground (Color.BLUE);
      this.add(p100);
      
      JPanel p101 = new JPanel ();
      p101.setBounds (520,420,60,20);
      p101.setBackground (Color.BLUE);
      this.add(p101);
      
      JPanel p102 = new JPanel ();
      p102.setBounds (600,420,80,20);
      p102.setBackground (Color.RED);
      this.add(p102);
      
      JPanel p103 = new JPanel ();
      p103.setBounds (580,400,100,20);
      p103.setBackground (Color.RED);
      this.add(p103);
      
      JPanel p104 = new JPanel ();
      p104.setBounds (560,440,240,20);
      p104.setBackground (Color.RED);
      this.add(p104);
      
      JPanel p105 = new JPanel ();
      p105.setBounds (480,440,40,20);
      p105.setBackground (Color.RED);
      this.add(p105);
      
      JPanel p106 = new JPanel ();
      p106.setBounds (480,420,40,20);
      p106.setBackground (Color.RED);
      this.add(p106);
      
      JPanel p107 = new JPanel ();
      p107.setBounds (560,460,160,20);
      p107.setBackground (Color.BLUE);
      this.add(p107);
      
      JPanel p108 = new JPanel ();
      p108.setBounds (540,480,180,20);
      p108.setBackground (Color.BLUE);
      this.add(p108);
      
      JPanel p109 = new JPanel ();
      p109.setBounds (540,500,180,20);
      p109.setBackground (Color.BLUE);
      this.add(p109);
      
      JPanel p110 = new JPanel ();
      p110.setBounds (540,520,40,20);
      p110.setBackground (Color.RED);
      this.add(p110);
      
      JPanel p111 = new JPanel ();
      p111.setBounds (520,540,60,20);
      p111.setBackground (Color.RED);
      this.add(p111);
      
      JPanel p112 = new JPanel ();
      p112.setBounds (680,520,40,20);
      p112.setBackground (Color.RED);
      this.add(p112);
      
      JPanel p113 = new JPanel ();
      p113.setBounds (680,540,60,20);
      p113.setBackground (Color.RED);
      this.add(p113);
      
      JPanel p114 = new JPanel ();
      p114.setBounds (680,400,20,40);
      p114.setBackground (Color.BLUE);
      this.add(p114);
      //OJO IZQUIERDO
      JPanel p115 = new JPanel (); //SEGUNDA LINEA DE OJO
      p115.setBounds (500,200,80,20);
      p115.setBackground (Color.WHITE);
      this.add(p115);
      
      JPanel p116 = new JPanel (); //PRIMER LINEA DE OJO
      p116.setBounds (520,180,40,40);
      p116.setBackground (Color.WHITE);
      this.add(p116);
      
      JPanel p117 = new JPanel (); //TERCER LINEA 
      p117.setBounds (500,200,100,40);
      p117.setBackground (Color.WHITE);
      this.add(p117);
      
      JPanel p118 = new JPanel (); //CUARTA LINEA
      p118.setBounds (500,220,120,40);
      p118.setBackground (Color.WHITE);
      this.add(p118);
      
      JPanel p119 = new JPanel (); //QUINTA LINEA
      p119.setBounds (500,240,120,40);
      p119.setBackground (Color.WHITE);
      this.add(p119);
      
      JPanel p120 = new JPanel (); //SEXTA LINEA
      p120.setBounds (540,260,60,40);
      p120.setBackground (Color.WHITE);
      this.add(p120);
      
      JPanel p121 = new JPanel ();
      p121.setBounds (720,460,20,20);
      p121.setBackground (Color.WHITE);
      this.add(p121);
      
      JPanel p122 = new JPanel ();
      p122.setBounds (520,460,20,20);
      p122.setBackground (Color.WHITE);
      this.add(p122);
      //OJO DERECHO
      JPanel p129 = new JPanel ();
      p129.setBounds (700,180,40,20);
      p129.setBackground (Color.WHITE);
      this.add(p129);
      
      JPanel p130 = new JPanel ();
      p130.setBounds (680,200,100,20);
      p130.setBackground (Color.WHITE);
      this.add(p130);
      
      JPanel p131 = new JPanel ();
      p131.setBounds (660,220,120,20);
      p131.setBackground (Color.WHITE);
      this.add(p131);
      
      JPanel p132 = new JPanel ();
      p132.setBounds (640,240,140,20);
      p132.setBackground (Color.WHITE);
      this.add(p132);
      
      JPanel p133 = new JPanel ();
      p133.setBounds (640,260,140,20);
      p133.setBackground (Color.WHITE);
      this.add(p133);
      
      JPanel p134 = new JPanel ();
      p134.setBounds (660,280,60,20);
      p134.setBackground (Color.WHITE);
      this.add(p134);
      
       // Agrega el KeyListener para el movimiento
      this.addKeyListener(new KeyAdapter() {
          @Override
          public void keyPressed(KeyEvent e) {
              int keyCode = e.getKeyCode();
              int step = 10; // Puedes ajustar este valor según sea necesario

              switch (keyCode) {
                  case KeyEvent.VK_UP:
                      spidermanPanel.setLocation(spidermanPanel.getX(), spidermanPanel.getY() - step);
                      break;
                  case KeyEvent.VK_DOWN:
                      spidermanPanel.setLocation(spidermanPanel.getX(), spidermanPanel.getY() + step);
                      break;
                  case KeyEvent.VK_LEFT:
                      spidermanPanel.setLocation(spidermanPanel.getX() - step, spidermanPanel.getY());
                      break;
                  case KeyEvent.VK_RIGHT:
                      spidermanPanel.setLocation(spidermanPanel.getX() + step, spidermanPanel.getY());
                      break;
              }
          }
      });

      this.add(spidermanPanel);

      this.setFocusable(true);
      this.requestFocusInWindow();


      
//    // Crear el panel para el movimiento
//        movimientoPanel = new JPanel();
//        movimientoPanel.setBackground(Color.YELLOW); // Puedes cambiar el color según tu preferencia
//        movimientoPanel.setBounds(100, 100, 40, 40); // Ajusta las coordenadas y dimensiones según tus necesidades
//        this.add(movimientoPanel);
//
//        // Agrega el KeyListener para el movimiento
//        this.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                int keyCode = e.getKeyCode();
//                int step = 10; // Puedes ajustar este valor según sea necesario
// switch (keyCode) {
//                    case KeyEvent.VK_UP:
//                        movimientoPanel.setLocation(movimientoPanel.getX(), movimientoPanel.getY() - step);
//                        break;
//                    case KeyEvent.VK_DOWN:
//                        movimientoPanel.setLocation(movimientoPanel.getX(), movimientoPanel.getY() + step);
//                        break;
//                    case KeyEvent.VK_LEFT:
//                        movimientoPanel.setLocation(movimientoPanel.getX() - step, movimientoPanel.getY());
//                        break;
//                    case KeyEvent.VK_RIGHT:
//                        movimientoPanel.setLocation(movimientoPanel.getX() + step, movimientoPanel.getY());
//                        break;
//                }
//            }
//        });
//
//        this.setFocusable(true);
//        this.requestFocusInWindow();
    

      
      p123 = new JPanel();
      p123.setBackground(color1);
      p123.setBounds(520, 180, 40, 20);
      this.add(p123);
      
      p124 = new JPanel();
      p124.setBackground(color1);
      p124.setBounds(500, 200, 80, 20);
      this.add(p124);
      
      p125 = new JPanel();
      p125.setBackground(color1);
      p125.setBounds(500, 220, 100, 20);
      this.add(p125);

      p126 = new JPanel();
      p126.setBackground(color1);
      p126.setBounds(500, 240, 120, 20);
      this.add(p126);

      p127 = new JPanel();
      p127.setBackground(color1);
      p127.setBounds(500, 260, 120, 20);
      this.add(p127);
      
      p128 = new JPanel();
      p128.setBackground(color1);
      p128.setBounds(540, 280, 60, 20);
      this.add(p128);
      //PANELES DEL OJO DERECHO
      p135 = new JPanel();
      p135.setBackground(color1);
      p135.setBounds(700, 180, 40, 20);
      this.add(p135);
      
      p136 = new JPanel();
      p136.setBackground(color1);
      p136.setBounds(680, 200, 80, 20);
      this.add(p136);
      
      p137 = new JPanel();
      p137.setBackground(color1);
      p137.setBounds(660, 220, 100, 20);
      this.add(p137);
      
      p138 = new JPanel();
      p138.setBackground(color1);
      p138.setBounds(640, 240, 120, 20);
      this.add(p138);
      
      p139 = new JPanel();
      p139.setBackground(color1);
      p139.setBounds(640, 260, 120, 20);
      this.add(p139);
      
      p140 = new JPanel();
      p140.setBackground(color1);
      p140.setBounds(660, 280, 60, 20);
      this.add(p140);
      
//      
      timer = new Timer (1020, new ActionListener(){
          @Override
          public void actionPerformed (ActionEvent e){
              if (p123.getBackground() == color1){
                  p123.setBackground(color2);
              } else {
                  p123.setBackground(color1);
              }
             
          }
      });
      timer.start();
      
      timer = new Timer (1040, new ActionListener(){
          @Override
          public void actionPerformed (ActionEvent e){
              if (p124.getBackground() == color1){
                  p124.setBackground(color2);
              } else {
                  p124.setBackground(color1);
              }
          }
      });
      timer.start();
      
      timer = new Timer (1060, new ActionListener(){
          @Override
          public void actionPerformed (ActionEvent e){
              if (p125.getBackground() == color1){
                  p125.setBackground(color2);
              } else {
                  p125.setBackground(color1);
              }
          }
      });
      timer.start();
      
      timer = new Timer (1080, new ActionListener(){
          @Override
          public void actionPerformed (ActionEvent e){
              if (p126.getBackground() == color1){
                  p126.setBackground(color2);
              } else {
                  p126.setBackground(color1);
              }
          }
      });
      timer.start();
      
      timer = new Timer (1100, new ActionListener(){
          @Override
          public void actionPerformed (ActionEvent e){
              if (p127.getBackground() == color1){
                  p127.setBackground(color2);
              } else {
                  p127.setBackground(color1);
              }
          }
      });
      timer.start();
      
       timer = new Timer (1120, new ActionListener(){
          @Override
          public void actionPerformed (ActionEvent e){
              if (p128.getBackground() == color1){
                  p128.setBackground(color2);
              } else {
                  p128.setBackground(color1);
              }
          }
      });
       timer.start();
       
       timer = new Timer (1020, new ActionListener(){ //PANELES DEL OJO DERECHO
          @Override
          public void actionPerformed (ActionEvent e){
              if (p135.getBackground() == color1){
                  p135.setBackground(color2);
              } else {
                  p135.setBackground(color1);
              }
          }
      });
       timer.start();
       
       timer = new Timer (1040, new ActionListener(){ //PANELES DEL OJO DERECHO
          @Override
          public void actionPerformed (ActionEvent e){
              if (p136.getBackground() == color1){
                  p136.setBackground(color2);
              } else {
                  p136.setBackground(color1);
              }
          }
      });
       timer.start();
       
       timer = new Timer (1060, new ActionListener(){ //PANELES DEL OJO DERECHO
          @Override
          public void actionPerformed (ActionEvent e){
              if (p137.getBackground() == color1){
                  p137.setBackground(color2);
              } else {
                  p137.setBackground(color1);
              }
          }
      });
       timer.start();
       
       timer = new Timer (1080, new ActionListener(){ //PANELES DEL OJO DERECHO
          @Override
          public void actionPerformed (ActionEvent e){
              if (p138.getBackground() == color1){
                  p138.setBackground(color2);
              } else {
                  p138.setBackground(color1);
              }
          }
      });
       timer.start();
       
       timer = new Timer (1100, new ActionListener(){ //PANELES DEL OJO DERECHO
          @Override
          public void actionPerformed (ActionEvent e){
              if (p139.getBackground() == color1){
                  p139.setBackground(color2);
              } else {
                  p139.setBackground(color1);
              }
          }
      });
       timer.start();
       
       timer = new Timer (1120, new ActionListener(){ //PANELES DEL OJO DERECHO
          @Override
          public void actionPerformed (ActionEvent e){
              if (p140.getBackground() == color1){
                  p140.setBackground(color2);
              } else {
                  p140.setBackground(color1);
              }
          }
      });
       timer.start();
       
      Componentes();
      
  }     
  
  public void Componentes (){
           // FOR PARA LA CUADRICULA   
//      int x = 0;
//      int y = 0;
//      
//        for (x = 0; x < 2000; x += 20) {
//            for (y = 0; y < 2000; y += 20) {
//            JPanel pan1 = new JPanel();
//        pan1.setBounds(x, y, 1, 2000);
//        pan1.setBackground(Color.BLACK);
//        this.add(pan1);
//                      
//            JPanel pan2 = new JPanel();
//      pan2.setBounds (x,y,2000,1);
//      pan2.setBackground(Color.BLACK);
//      this.add(pan2);
//}
//        }
         //MOVIMIENTO
         //JTextArea Caja = new JTextArea();
//        Caja.setBounds(300, 300, 140, 150);
//        Caja.setFocusable(true);
//        this.add(Caja);
// Caja.addKeyListener (new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                String ch = String.valueOf(e.getKeyChar()); 
//                
//                if(ch.equals("w")){
//                    Caja.setLocation(Caja.getX(), Caja.getY() - 10);
//                }
//                if(ch.equals("s")){
//                    Caja.setLocation(Caja.getX(), Caja.getY() + 10);
//                }
//                if(ch.equals("a")){
//                    Caja.setLocation(Caja.getX() - 10, Caja.getY());
//                }
//                if(ch.equals("d")){
//                    Caja.setLocation(Caja.getX() + 10, Caja.getY());
//                }
//@Override
//            public void keyReleased(KeyEvent e) {
//            }
//        });{


       //COLOR NEGRO 
      JPanel p0 = new JPanel();
      p0.setBounds(560, 80, 140, 20);
      p0.setBackground(Color.BLACK);
      this.add(p0);
            
      JPanel p2 = new JPanel ();
      p2.setBounds (700,100,20,20);
      p2.setBackground (Color.BLACK);
      this.add(p2);
      
      JPanel p3 = new JPanel ();
      p3.setBounds (720,120,20,20);
      p3.setBackground (Color.BLACK);
      this.add(p3);
      
      JPanel p4 = new JPanel ();
      p4.setBounds (740,140,20,20);
      p4.setBackground (Color.BLACK);
      this.add(p4);
      
      JPanel p5 = new JPanel ();
      p5.setBounds (760,160,20,120);
      p5.setBackground (Color.BLACK);
      this.add(p5);
      
      JPanel p6 = new JPanel ();
      p6.setBounds (740,280,20,60);
      p6.setBackground (Color.BLACK);
      this.add(p6);
      
      JPanel p7 = new JPanel ();
      p7.setBounds (720,280,20,20);
      p7.setBackground (Color.BLACK);
      this.add(p7);
      
      JPanel p8 = new JPanel ();
      p8.setBounds (720,320,20,20);
      p8.setBackground (Color.BLACK);
      this.add(p8);
      
      JPanel p9 = new JPanel ();
      p9.setBounds (700,340,20,20);
      p9.setBackground (Color.BLACK);
      this.add(p9);
      
      JPanel p10 = new JPanel ();
      p10.setBounds (680,340,20,20);
      p10.setBackground (Color.BLACK);
      this.add(p10);
      
      JPanel p11 = new JPanel ();
      p11.setBounds (720,360,20,20);
      p11.setBackground (Color.BLACK);
      this.add(p11);
      
      JPanel p12 = new JPanel ();
      p12.setBounds (740,380,20,20);
      p12.setBackground (Color.BLACK);
      this.add(p12);
      
      JPanel p13 = new JPanel ();
      p13.setBounds (760,400,20,20);
      p13.setBackground (Color.BLACK);
      this.add(p13);
      
      JPanel p14 = new JPanel ();
      p14.setBounds (780,420,20,20);
      p14.setBackground (Color.BLACK);
      this.add(p14);
      
      JPanel p15 = new JPanel ();
      p15.setBounds (780,440,20,20);
      p15.setBackground (Color.BLACK);
      this.add(p15);
      
      JPanel p16 = new JPanel ();
      p16.setBounds (760,460,20,20);
      p16.setBackground (Color.BLACK);
      this.add(p16);
      
      JPanel p17 = new JPanel ();
      p17.setBounds (740,460,20,20);
      p17.setBackground (Color.BLACK);
      this.add(p17);
      
      JPanel p18 = new JPanel ();
      p18.setBounds (720,480,20,20);
      p18.setBackground (Color.BLACK);
      this.add(p18);
      
      JPanel p19 = new JPanel ();
      p19.setBounds (720,500,20,20);
      p19.setBackground (Color.BLACK);
      this.add(p19);
      
      JPanel p20 = new JPanel ();
      p20.setBounds (720,520,20,20);
      p20.setBackground (Color.BLACK);
      this.add(p20);
      
      JPanel p21 = new JPanel ();
      p21.setBounds (720,440,20,20);
      p21.setBackground (Color.BLACK);
      this.add(p21);
   
      JPanel p22 = new JPanel ();
      p22.setBounds (700,420,20,20);
      p22.setBackground (Color.BLACK);
      this.add(p22);
      
      JPanel p23 = new JPanel ();
      p23.setBounds (700,400,20,20);
      p23.setBackground (Color.BLACK);
      this.add(p23);
      
      JPanel p24 = new JPanel ();
      p24.setBounds (700,460,20,20);
      p24.setBackground (Color.BLACK);
      this.add(p24);
      
      JPanel p25 = new JPanel ();
      p25.setBounds (700,440,20,20);
      p25.setBackground (Color.BLACK);
      this.add(p25);
      //COLOR AZUL
      JPanel p26 = new JPanel ();
      p26.setBounds (720,420,20,20);
      p26.setBackground (Color.BLUE);
      this.add(p26);
      
      JPanel p27 = new JPanel ();
      p27.setBounds (720,400,20,20);
      p27.setBackground (Color.BLUE);
      this.add(p27);
      
      JPanel p28 = new JPanel ();
      p28.setBounds (740,400,20,20);
      p28.setBackground (Color.BLUE);
      this.add(p28);
      //COLOR ROJO
      JPanel p29 = new JPanel ();
      p29.setBounds (740,440,20,20);
      p29.setBackground (Color.RED);
      this.add(p29);
      
      JPanel p30 = new JPanel ();
      p30.setBounds (740,420,20,20);
      p30.setBackground (Color.RED);
      this.add(p30);
      
      JPanel p31 = new JPanel ();
      p31.setBounds (760,420,20,20);
      p31.setBackground (Color.RED);
      this.add(p31);
     
      JPanel p32 = new JPanel ();
      p32.setBounds (760,440,20,20);
      p32.setBackground (Color.RED);
      this.add(p32);
      
      JPanel p33 = new JPanel ();
      p33.setBounds (740,520,20,60);
      p33.setBackground (Color.BLACK);
      this.add(p33);
      
      //LADO IZQUIERDO COLOR NEGRO
      JPanel p37 = new JPanel ();
      p37.setBounds (540,100,20,20);
      p37.setBackground (Color.BLACK);
      this.add(p37);
      
      JPanel p38 = new JPanel ();
      p38.setBounds (520,120,20,20);
      p38.setBackground (Color.BLACK);
      this.add(p38);
      
      JPanel p39 = new JPanel ();
      p39.setBounds (500,140,20,20);
      p39.setBackground (Color.BLACK);
      this.add(p39);
      
      JPanel p40 = new JPanel ();
      p40.setBounds (480,160,20,120);
      p40.setBackground (Color.BLACK);
      this.add(p40);
      
      JPanel p41 = new JPanel ();
      p41.setBounds (520,160,20,20);
      p41.setBackground (Color.BLACK);
      this.add(p41);
      
      JPanel p42 = new JPanel ();
      p42.setBounds (540,160,20,20);
      p42.setBackground (Color.BLACK);
      this.add(p42);
      
      JPanel p43 = new JPanel ();
      p43.setBounds (500,180,20,20);
      p43.setBackground (Color.BLACK);
      this.add(p43);
      
      JPanel p44 = new JPanel ();
      p44.setBounds (580,200,20,20);
      p44.setBackground (Color.BLACK);
      this.add(p44);
      
      JPanel p45 = new JPanel ();
      p45.setBounds (560,180,20,20);
      p45.setBackground (Color.BLACK);
      this.add(p45);
      
      JPanel p46 = new JPanel ();
      p46.setBounds (600,220,20,20);
      p46.setBackground (Color.BLACK);
      this.add(p46);
      
      JPanel p47 = new JPanel ();
      p47.setBounds (620,240,20,20);
      p47.setBackground (Color.BLACK);
      this.add(p47);
      
      JPanel p48 = new JPanel ();
      p48.setBounds (620,240,20,40);
      p48.setBackground (Color.BLACK);
      this.add(p48);
      
      JPanel p49 = new JPanel ();
      p49.setBounds (640,220,20,20);
      p49.setBackground (Color.BLACK);
      this.add(p49);
      
      JPanel p50 = new JPanel ();
      p50.setBounds (660,200,20,20);
      p50.setBackground (Color.BLACK);
      this.add(p50);
      
      JPanel p51 = new JPanel ();
      p51.setBounds (680,180,20,20);
      p51.setBackground (Color.BLACK);
      this.add(p51);
      
      JPanel p52 = new JPanel ();
      p52.setBounds (700,160,40,20);
      p52.setBackground (Color.BLACK);
      this.add(p52);
      
      JPanel p53 = new JPanel ();
      p53.setBounds (740,180,20,20);
      p53.setBackground (Color.BLACK);
      this.add(p53);
      
      JPanel p54 = new JPanel ();
      p54.setBounds (560,180,20,20);
      p54.setBackground (Color.BLACK);
      this.add(p54);
      
      JPanel p55 = new JPanel ();
      p55.setBounds (600,280,20,20);
      p55.setBackground (Color.BLACK);
      this.add(p55);
      
      JPanel p56 = new JPanel ();
      p56.setBounds (640,280,20,20);
      p56.setBackground (Color.BLACK);
      this.add(p56);
      
      JPanel p57 = new JPanel ();
      p57.setBounds (660,300,60,20);
      p57.setBackground (Color.BLACK);
      this.add(p57);
      
      JPanel p58 = new JPanel ();
      p58.setBounds (540,300,60,20);
      p58.setBackground (Color.BLACK);
      this.add(p58);
      
      JPanel p59 = new JPanel ();
      p59.setBounds (520,280,20,20);
      p59.setBackground (Color.BLACK);
      this.add(p59);
      
      JPanel p60 = new JPanel ();
      p60.setBounds (500,280,20,40);
      p60.setBackground (Color.BLACK);
      this.add(p60);
      
      JPanel p61 = new JPanel ();
      p61.setBounds (520,320,20,20);
      p61.setBackground (Color.BLACK);
      this.add(p61);
      
      JPanel p62 = new JPanel ();
      p62.setBounds (540,340,40,20);
      p62.setBackground (Color.BLACK);
      this.add(p62);
      
      JPanel p63 = new JPanel ();
      p63.setBounds (580,360,100,20);
      p63.setBackground (Color.BLACK);
      this.add(p63);
      
      JPanel p64 = new JPanel ();
      p64.setBounds (520,360,20,20);
      p64.setBackground (Color.BLACK);
      this.add(p64);
      
      JPanel p65 = new JPanel ();
      p65.setBounds (500,380,20,20);
      p65.setBackground (Color.BLACK);
      this.add(p65);
      
      JPanel p66 = new JPanel ();
      p66.setBounds (480,400,20,20);
      p66.setBackground (Color.BLACK);
      this.add(p66);
      
      JPanel p67 = new JPanel ();
      p67.setBounds (460,420,20,40);
      p67.setBackground (Color.BLACK);
      this.add(p67);
      
      JPanel p68 = new JPanel ();
      p68.setBounds (480,460,40,20);
      p68.setBackground (Color.BLACK);
      this.add(p68);
      
      JPanel p69 = new JPanel ();
      p69.setBounds (520,440,20,20);
      p69.setBackground (Color.BLACK);
      this.add(p69);
      
      JPanel p70 = new JPanel ();
      p70.setBounds (540,400,20,80);
      p70.setBackground (Color.BLACK);
      this.add(p70);
      
      JPanel p71 = new JPanel ();
      p71.setBounds (580,420,20,20);
      p71.setBackground (Color.BLACK);
      this.add(p71);
      
      JPanel p72 = new JPanel ();
      p72.setBounds (600,400,60,20);
      p72.setBackground (Color.BLACK);
      this.add(p72);
      
      JPanel p73 = new JPanel ();
      p73.setBounds (620,420,20,20);
      p73.setBackground (Color.BLACK);
      this.add(p73);
      
      JPanel p74 = new JPanel ();
      p74.setBounds (660,420,20,20);
      p74.setBackground (Color.BLACK);
      this.add(p74);
      
      JPanel p75 = new JPanel ();
      p75.setBounds (620,380,20,20);
      p75.setBackground (Color.BLACK);
      this.add(p75);
      
      JPanel p76 = new JPanel ();
      p76.setBounds (520,480,20,60);
      p76.setBackground (Color.BLACK);
      this.add(p76);
      
      JPanel p77 = new JPanel ();
      p77.setBounds (500,520,20,60);
      p77.setBackground (Color.BLACK);
      this.add(p77);
      
      JPanel p78 = new JPanel ();
      p78.setBounds (500,560,80,20);
      p78.setBackground (Color.BLACK);
      this.add(p78);
      
      JPanel p79 = new JPanel ();
      p79.setBounds (580,520,20,60);
      p79.setBackground (Color.BLACK);
      this.add(p79);
      
      JPanel p80 = new JPanel ();
      p80.setBounds (600,500,60,20);
      p80.setBackground (Color.BLACK);
      this.add(p80);
      
      JPanel p81 = new JPanel ();
      p81.setBounds (660,520,20,60);
      p81.setBackground (Color.BLACK);
      this.add(p81);
      
      JPanel p82 = new JPanel ();
      p82.setBounds (660,560,80,20);
      p82.setBackground (Color.BLACK);
      this.add(p82);
      //COLOR ROJO DE LA CABEZA
      JPanel p83 = new JPanel ();
      p83.setBounds (560,100,140,20);
      p83.setBackground (Color.RED);
      this.add(p83);
      
      JPanel p84 = new JPanel ();
      p84.setBounds (540,120,180,20);
      p84.setBackground (Color.RED);
      this.add(p84);
      
      JPanel p85 = new JPanel ();
      p85.setBounds (520,140,220,20);
      p85.setBackground (Color.RED);
      this.add(p85);
      
      JPanel p86 = new JPanel ();
      p86.setBounds (560,160,140,20);
      p86.setBackground (Color.RED);
      this.add(p86);
      
      JPanel p87 = new JPanel ();
      p87.setBounds (580,180,100,20);
      p87.setBackground (Color.RED);
      this.add(p87);
      
      JPanel p88 = new JPanel ();
      p88.setBounds (600,200,60,20);
      p88.setBackground (Color.RED);
      this.add(p88);
      
      JPanel p89 = new JPanel ();
      p89.setBounds (620,220,20,20);
      p89.setBackground (Color.RED);
      this.add(p89);
      
      JPanel p90 = new JPanel ();
      p90.setBounds (500,160,140,20);
      p90.setBackground (Color.RED);
      this.add(p90);
      
      JPanel p91 = new JPanel ();
      p91.setBounds (740,160,20,20);
      p91.setBackground (Color.RED);
      this.add(p91);
      
      JPanel p92 = new JPanel ();
      p92.setBounds (620,280,20,20);
      p92.setBackground (Color.RED);
      this.add(p92);
      
      JPanel p93 = new JPanel ();
      p93.setBounds (600,300,60,20);
      p93.setBackground (Color.RED);
      this.add(p93);
      
      JPanel p94 = new JPanel ();
      p94.setBounds (520,300,20,20);
      p94.setBackground (Color.RED);
      this.add(p94);
      
      JPanel p95 = new JPanel ();
      p95.setBounds (540,320,180,20);
      p95.setBackground (Color.RED);
      this.add(p95);
      
      JPanel p96 = new JPanel ();
      p96.setBounds (720,300,20,20);
      p96.setBackground (Color.RED);
      this.add(p96);
      
      JPanel p97 = new JPanel ();
      p97.setBounds (580,340,100,20);
      p97.setBackground (Color.RED);
      this.add(p97);
      
      JPanel p98 = new JPanel ();
      p98.setBounds (540,360,180,20);
      p98.setBackground (Color.RED);
      this.add(p98);
      
      JPanel p99 = new JPanel ();
      p99.setBounds (520,380,240,20);
      p99.setBackground (Color.RED);
      this.add(p99);
      
      JPanel p100 = new JPanel ();
      p100.setBounds (500,400,80,20);
      p100.setBackground (Color.BLUE);
      this.add(p100);
      
      JPanel p101 = new JPanel ();
      p101.setBounds (520,420,60,20);
      p101.setBackground (Color.BLUE);
      this.add(p101);
      
      JPanel p102 = new JPanel ();
      p102.setBounds (600,420,80,20);
      p102.setBackground (Color.RED);
      this.add(p102);
      
      JPanel p103 = new JPanel ();
      p103.setBounds (580,400,100,20);
      p103.setBackground (Color.RED);
      this.add(p103);
      
      JPanel p104 = new JPanel ();
      p104.setBounds (560,440,240,20);
      p104.setBackground (Color.RED);
      this.add(p104);
      
      JPanel p105 = new JPanel ();
      p105.setBounds (480,440,40,20);
      p105.setBackground (Color.RED);
      this.add(p105);
      
      JPanel p106 = new JPanel ();
      p106.setBounds (480,420,40,20);
      p106.setBackground (Color.RED);
      this.add(p106);
      
      JPanel p107 = new JPanel ();
      p107.setBounds (560,460,160,20);
      p107.setBackground (Color.BLUE);
      this.add(p107);
      
      JPanel p108 = new JPanel ();
      p108.setBounds (540,480,180,20);
      p108.setBackground (Color.BLUE);
      this.add(p108);
      
      JPanel p109 = new JPanel ();
      p109.setBounds (540,500,180,20);
      p109.setBackground (Color.BLUE);
      this.add(p109);
      
      JPanel p110 = new JPanel ();
      p110.setBounds (540,520,40,20);
      p110.setBackground (Color.RED);
      this.add(p110);
      
      JPanel p111 = new JPanel ();
      p111.setBounds (520,540,60,20);
      p111.setBackground (Color.RED);
      this.add(p111);
      
      JPanel p112 = new JPanel ();
      p112.setBounds (680,520,40,20);
      p112.setBackground (Color.RED);
      this.add(p112);
      
      JPanel p113 = new JPanel ();
      p113.setBounds (680,540,60,20);
      p113.setBackground (Color.RED);
      this.add(p113);
      
      JPanel p114 = new JPanel ();
      p114.setBounds (680,400,20,40);
      p114.setBackground (Color.BLUE);
      this.add(p114);
      //OJO IZQUIERDO
      JPanel p115 = new JPanel (); //SEGUNDA LINEA DE OJO
      p115.setBounds (500,200,80,20);
      p115.setBackground (Color.WHITE);
      this.add(p115);
      
      JPanel p116 = new JPanel (); //PRIMER LINEA DE OJO
      p116.setBounds (520,180,40,40);
      p116.setBackground (Color.WHITE);
      this.add(p116);
      
      JPanel p117 = new JPanel (); //TERCER LINEA 
      p117.setBounds (500,200,100,40);
      p117.setBackground (Color.WHITE);
      this.add(p117);
      
      JPanel p118 = new JPanel (); //CUARTA LINEA
      p118.setBounds (500,220,120,40);
      p118.setBackground (Color.WHITE);
      this.add(p118);
      
      JPanel p119 = new JPanel (); //QUINTA LINEA
      p119.setBounds (500,240,120,40);
      p119.setBackground (Color.WHITE);
      this.add(p119);
      
      JPanel p120 = new JPanel (); //SEXTA LINEA
      p120.setBounds (540,260,60,40);
      p120.setBackground (Color.WHITE);
      this.add(p120);
      
      JPanel p121 = new JPanel ();
      p121.setBounds (720,460,20,20);
      p121.setBackground (Color.WHITE);
      this.add(p121);
      
      JPanel p122 = new JPanel ();
      p122.setBounds (520,460,20,20);
      p122.setBackground (Color.WHITE);
      this.add(p122);
      //OJO DERECHO
      JPanel p129 = new JPanel ();
      p129.setBounds (700,180,40,20);
      p129.setBackground (Color.WHITE);
      this.add(p129);
      
      JPanel p130 = new JPanel ();
      p130.setBounds (680,200,100,20);
      p130.setBackground (Color.WHITE);
      this.add(p130);
      
      JPanel p131 = new JPanel ();
      p131.setBounds (660,220,120,20);
      p131.setBackground (Color.WHITE);
      this.add(p131);
      
      JPanel p132 = new JPanel ();
      p132.setBounds (640,240,140,20);
      p132.setBackground (Color.WHITE);
      this.add(p132);
      
      JPanel p133 = new JPanel ();
      p133.setBounds (640,260,140,20);
      p133.setBackground (Color.WHITE);
      this.add(p133);
      
      JPanel p134 = new JPanel ();
      p134.setBounds (660,280,60,20);
      p134.setBackground (Color.WHITE);
      this.add(p134);
      
      //FONDO
      JPanel fondo1 = new JPanel();
      fondo1.setBounds(0,0,2000,2000);
      fondo1.setBackground(Color.GREEN);
      this.add(fondo1);
          
  }
     
}

      
                  






