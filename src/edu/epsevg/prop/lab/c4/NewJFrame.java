package edu.epsevg.prop.lab.c4;




import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;


/**
 *
 * @author Hume
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 400), new java.awt.Dimension(0, 400), new java.awt.Dimension(32767, 400));
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEnabled(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Versus");

        jTextField2.setEnabled(false);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLayeredPane1MouseClicked(evt);
            }
        });

        filler2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        filler2.setOpaque(true);
        jLayeredPane1.add(filler2);
        filler2.setBounds(350, 0, 50, 400);

        filler4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        filler4.setOpaque(true);
        jLayeredPane1.add(filler4);
        filler4.setBounds(0, 0, 50, 400);

        filler5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        filler5.setOpaque(true);
        jLayeredPane1.add(filler5);
        filler5.setBounds(50, 0, 50, 400);

        filler6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        filler6.setOpaque(true);
        jLayeredPane1.add(filler6);
        filler6.setBounds(100, 0, 50, 400);

        filler7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        filler7.setOpaque(true);
        jLayeredPane1.add(filler7);
        filler7.setBounds(150, 0, 50, 400);

        filler8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        filler8.setOpaque(true);
        jLayeredPane1.add(filler8);
        filler8.setBounds(200, 0, 50, 400);

        filler9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        filler9.setOpaque(true);
        jLayeredPane1.add(filler9);
        filler9.setBounds(250, 0, 50, 400);

        filler10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        filler10.setOpaque(true);
        jLayeredPane1.add(filler10);
        filler10.setBounds(300, 0, 50, 400);

        jTextField3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jTextField2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(380, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int c1, c2;
    private static int[][] tauler = { {0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0}};
    static double Ymax;
    static double  Xmax;
    static int  Step;
    static boolean Torn;
    
    private static int whichx(int col){
        return (Step*col+70);
    }
    
    private static int whichy(int fil){
        return (446-fil*50);
    }

    private void jLayeredPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane1MouseClicked
        // TODO add your handling code here:

        int X = evt.getX();
        int Y = evt.getY();
        Dimension mides = jLayeredPane1.getSize();
        Ymax = mides.getHeight();
        Xmax = mides.getWidth();
        Step = (int) Xmax/8;
        int col = (int) X/Step;
        jTextField1.setText(String.valueOf(col));

        if (!Torn){
            col =(int) (8*Math.random());
        }       
        int j=0;
        boolean trobat=false;
        while (j<8 && !trobat){
            if (tauler[col][j]!=0){ 
                    j++;
            }
            else{
                trobat=true;
            }
        }
        if (trobat){
        if (Torn) {
            tauler[col][j]=1;
            Torn = !(Torn);
        }
        else {
            tauler[col][j]=-1;
            Torn = !(Torn);
        }
        }
        repaint();
    }//GEN-LAST:event_jLayeredPane1MouseClicked

    
    private static  void movimentrandom(){
        int j=0;
        boolean trobat=false;
        int col =(int) (8*Math.random());
        while (j<8 && !trobat){
            if (tauler[col][j]!=0){ 
                    j++;
            }
            else{
                trobat=true;
            }
        }
        if (trobat){
        if (Torn) {
            tauler[col][j]=1;
            Torn = !(Torn);
        }
        else {
            tauler[col][j]=-1;
            Torn = !(Torn);
        }
        }
      //  repaint();
    }
    
    @Override
    public void paint(Graphics g)
    {
     super.paint(g);
     
     
     
     for (int i=0; i<8; i++){
        for (int j=0; j<8; j++){
            if (tauler[i][j]==1) { 
                g.setColor(Color.RED);
                g.drawOval(whichx(i),whichy(j),40,40);
                g.fillOval(whichx(i),whichy(j),40,40);
            }
            else if (tauler[i][j]==-1) { 
                g.setColor(Color.BLUE);
                g.drawOval(whichx(i),whichy(j),40,40);
                g.fillOval(whichx(i),whichy(j),40,40);
            }
        }
     }
    }
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
