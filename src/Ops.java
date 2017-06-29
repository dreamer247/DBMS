
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Ops extends javax.swing.JFrame {
String selected,selected1,selected2,str1,str2,h;
ResultSet result,result1,result2,r4,r5;
PreparedStatement statement,s1,s2,s3,s4;

     Statement st;
Vector data = new Vector();
ResultSet res;
Vector columnNames = new Vector();
 
ResultSetMetaData metaData;
        

    /**
     * Creates new form Ops
     */
    public Ops() {
        initComponents();
    }
 
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(850, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 650));

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox1.setToolTipText("");
        jComboBox1.setMinimumSize(new java.awt.Dimension(44, 24));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("View Hotel Information");

        jLabel2.setText("View  Booking Information");

        jLabel3.setText("Other queries:");

        jLabel4.setText("View Room Information");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox2.setMinimumSize(new java.awt.Dimension(44, 24));
        jComboBox2.setPreferredSize(new java.awt.Dimension(44, 24));
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "ALL" }));
        jComboBox3.setMinimumSize(new java.awt.Dimension(44, 24));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Search by Name");

        jLabel6.setText("Search by Guest ID");

        jTextField2.setMinimumSize(new java.awt.Dimension(44, 24));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setMinimumSize(new java.awt.Dimension(44, 24));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton3.setText("Select");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Select");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("<HTML>Click <FONT color=\"#000099\"><U>here</U></FONT>"
            + " to execute queries.</HTML>");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setDefaultCapable(false);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.setRequestFocusEnabled(false);
        jButton6.setRolloverEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrorsrs1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(250, 250, 250))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jButton3))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jButton5)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton7))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jLabel3))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       selected=jComboBox1.getSelectedItem().toString();
       if(selected.compareTo("")==0){}
      else if(selected.compareTo("ALL")==0){
          try{ Class.forName("com.mysql.jdbc.Driver"); 
          Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/hotel","root","mysql123");
          

try {
    st = con.createStatement();
     res = st.executeQuery("SELECT * FROM hotel");
   metaData=res.getMetaData();
    HotelInfo hi= new HotelInfo();
   
    int columns = metaData.getColumnCount();
    DefaultTableModel model=new DefaultTableModel();
     hi.jTable1.setModel(model);
    
   
    for (int i = 1; i <= columns; i++)
    {   String st1=metaData.getColumnName(i);
        model.addColumn(st1);
        
    
       
    }
   while (res.next()) {
       Vector row=new Vector();
        for (int i = 1; i <= columns; i++)
       { 
           
       row.add(res.getString(i));
       }
        model.addRow(row);
      
       } 
      
hi.setVisible(true);
   
} catch (SQLException e) {
    e.printStackTrace();
}
//TabularListing tl=new TabularListing();


            con.close();
            
            
      }catch(Exception e){}
       }
       
       
           
      else{ 
      try{  
             
         //this.dispose();
Class.forName("com.mysql.jdbc.Driver");  
 
        Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/hotel","root","mysql123"); 
     

 

try {
    PreparedStatement pst = con.prepareStatement("SELECT * FROM hotel where hname=?");
    pst.setString(1, selected);
    
   
     
         res = pst.executeQuery();
         
    metaData=res.getMetaData();
    HotelInfo hi= new HotelInfo();
   
    int columns = metaData.getColumnCount();
    DefaultTableModel model=new DefaultTableModel();
     hi.jTable1.setModel(model);
    
   
    for (int i = 1; i <= columns; i++)
    {   String st1=metaData.getColumnName(i);
        model.addColumn(st1);
        
    
       
    }
   while (res.next()) {
       Vector row=new Vector();
        for (int i = 1; i <= columns; i++)
       { 
           
       row.add(res.getString(i));
       }
        model.addRow(row);
      
       } 
      
hi.setVisible(true);
   
   
} catch (SQLException e) {
    e.printStackTrace();
}
//TabularListing tl=new TabularListing();

            con.close();
            
            
      }catch(Exception e){}
      
      }
       
       
       
          
           // con.close();
            
            
     
        
        
       
     
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       //h=jComboBox1.getSelectedItem().toString();
      selected=jComboBox1.getSelectedItem().toString();
      
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
         selected1=jComboBox2.getSelectedItem().toString(); // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              selected1=jComboBox2.getSelectedItem().toString();
                   if(selected1.compareTo("")==0) {}
       else if(selected1.compareTo("ALL")==0){
      try{  
             
         //this.dispose();
Class.forName("com.mysql.jdbc.Driver");  
 
        Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/hotel","root","mysql123"); 
       

try {
    st = con.createStatement();
     res = st.executeQuery("SELECT * FROM room");
    metaData=res.getMetaData();
    HotelInfo hi= new HotelInfo();
   
    int columns = metaData.getColumnCount();
    DefaultTableModel model=new DefaultTableModel();
     hi.jTable1.setModel(model);
    
   
    for (int i = 1; i <= columns; i++)
    {   String st1=metaData.getColumnName(i);
        model.addColumn(st1);
        
    
       
    }
   while (res.next()) {
       Vector row=new Vector();
        for (int i = 1; i <= columns; i++)
       { 
           
       row.add(res.getString(i));
       }
        model.addRow(row);
      
       } 
      
hi.setVisible(true);
   

}catch (SQLException e) {System.out.print(e);}
      }catch (Exception e){System.out.println(e);}
      }
 
      
        else { 
            selected1=jComboBox2.getSelectedItem().toString();
             //this.dispose();
             try{
Class.forName("com.mysql.jdbc.Driver");  
 
        Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/hotel","root","mysql123"); 
    


    PreparedStatement pst = con.prepareStatement("select * from room where room.hid in ( select hotel.hid from hotel where hname=?)");
    pst.setString(1, selected1);
    
    res = pst.executeQuery();
    
    metaData=res.getMetaData();
    HotelInfo hi= new HotelInfo();
   
    int columns = metaData.getColumnCount();
    DefaultTableModel model=new DefaultTableModel();
     hi.jTable1.setModel(model);
    
   
    for (int i = 1; i <= columns; i++)
    {   String st1=metaData.getColumnName(i);
        model.addColumn(st1);
        
    
       
    }
   while (res.next()) {
       Vector row=new Vector();
        for (int i = 1; i <= columns; i++)
       { 
           
       row.add(res.getString(i));
       }
        model.addRow(row);
      
       } 
      
hi.setVisible(true);
   
     
   
    for (int i = 1; i <= columns; i++)
    {
      columnNames.addElement(metaData.getColumnName(i)); 
    }data.addElement(columnNames);
   
    while (res.next()) {
      Vector row = new Vector(columns);
       
       for (int i = 1; i <= columns; i++)
        {
        row.addElement(res.getObject(i));
        
       }
       data.addElement(row);
    }


        con.close();
         }catch(Exception e){System.out.print(e);}
            
        }
    
      
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        selected2=jComboBox3.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         
         
        //(selected2.compareToIgnoreCase("ALL")==0){
      try{  
             if(selected2.compareTo(" ")==0){}
             else{
         //this.dispose();
Class.forName("com.mysql.jdbc.Driver");  
 
        Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/hotel","root","mysql123"); 
        
     
 
   
try {
    st = con.createStatement();
     res = st.executeQuery("SELECT * FROM guest");
   metaData=res.getMetaData();
    HotelInfo hi= new HotelInfo();
   
    int columns = metaData.getColumnCount();
    DefaultTableModel model=new DefaultTableModel();
     hi.jTable1.setModel(model);
    
   
    for (int i = 1; i <= columns; i++)
    {   String st1=metaData.getColumnName(i);
        model.addColumn(st1);
        
    
       
    }
   while (res.next()) {
       Vector row=new Vector();
        for (int i = 1; i <= columns; i++)
       { 
           
       row.add(res.getString(i));
       }
        model.addRow(row);
      
       } 
      
hi.setVisible(true);
   
} catch (SQLException e) {
    e.printStackTrace();
}
//TabularListing tl=new TabularListing();

            con.close();
            
             }    
      }catch(Exception e){}
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
      //  str1=jTextField3.getText();
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        str2=jTextField2.getText();
        str1=jTextField3.getText();
        if(str2.compareTo("")==0 && str1.compareTo("")==0){}
        else if(str2.compareTo("")!=0 && str1.compareTo("")==0){
          try{  
             
         //this.dispose();
Class.forName("com.mysql.jdbc.Driver");  
 
        Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/hotel","root","mysql123"); 
  
try {
    PreparedStatement pst = con.prepareStatement("Select guest.gid,fname,lname,phno,reservation.rid,hid"
            + " from guest,reservation,roomres where guest.gid=? "
            + "and guest.gid=reservation.gid and reservation.rid=roomres.rid");
    pst.setString(1, str2);
    
     
         res = pst.executeQuery();
         
    metaData=res.getMetaData();
    HotelInfo hi= new HotelInfo();
   
    int columns = metaData.getColumnCount();
    DefaultTableModel model=new DefaultTableModel();
     hi.jTable1.setModel(model);
    
   
    for (int i = 1; i <= columns; i++)
    {   String st1=metaData.getColumnName(i);
        model.addColumn(st1);
        
    
       
    }
   while (res.next()) {
       Vector row=new Vector();
        for (int i = 1; i <= columns; i++)
       { 
           
       row.add(res.getString(i));
       }
        model.addRow(row);
      
       } 
      
hi.setVisible(true);
   
} catch (SQLException e) {
    e.printStackTrace();
}

            con.close();
            
            
      }catch(Exception e){System.out.print(e);}
        
        }
         
        else /*if(str2.compareTo("")==0 && str1.compareTo("")!=0)*/{
       
        try{
Class.forName("com.mysql.jdbc.Driver");  
 
        Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/hotel","root","mysql123");
         //Statement st;

try {
    PreparedStatement pst = con.prepareStatement("select guest.gid,fname,lname,phno,reservation.rid,hid "
            + "from guest,reservation,roomres "
            + "where (fname like ? or lname like ?) and guest.gid=reservation.gid and reservation.rid=roomres.rid");
    pst.setString(1, "%"+str1+"%");
    pst.setString(2,"%"+str1+"%");
    
         res = pst.executeQuery();
         
   metaData=res.getMetaData();
    HotelInfo hi= new HotelInfo();
   
    int columns = metaData.getColumnCount();
    DefaultTableModel model=new DefaultTableModel();
     hi.jTable1.setModel(model);
    
   
    for (int i = 1; i <= columns; i++)
    {   String st1=metaData.getColumnName(i);
        model.addColumn(st1);
        
    
       
    }
   while (res.next()) {
       Vector row=new Vector();
        for (int i = 1; i <= columns; i++)
       { 
           
       row.add(res.getString(i));
       }
        model.addRow(row);
      
       } 
      
hi.setVisible(true);
   
} catch (SQLException e) {
    e.printStackTrace();
}

     
        con.close();
         }catch(Exception e){System.out.println(e);}
        
            
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        //str2=jTextField2.getText();// TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       // UpdateInfo ui=new UpdateInfo();
          //  ui.setVisible(true);// TODO add your handling code here:
          Predef p=new Predef();
          p.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeVisible
        // TODO add your handling code here
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
       try{ Class.forName("com.mysql.jdbc.Driver");  
 
        Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/hotel","root","mysql123"); 
       
         s3 = con.prepareStatement("Select * from hotel order by hname");//simple 2
          comboBoxModel.addElement(" ");
          comboBoxModel.addElement("ALL");
         r4 = s3.executeQuery();
         while (r4.next()) {
             
              String name=r4.getString("hname");
                 comboBoxModel.addElement(name);

            }
         jComboBox1.setModel(comboBoxModel);
         
            con.close();
            
            
      }catch(Exception e){System.out.print(e);}
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeVisible

    private void jComboBox2PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeVisible
DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
       try{ Class.forName("com.mysql.jdbc.Driver");  
 
        Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/hotel","root","mysql123"); 
       
         s4 = con.prepareStatement("Select * from hotel order by hname");//simple 2
         comboBoxModel.addElement(" "); comboBoxModel.addElement("ALL");
         r5 = s4.executeQuery();
         while (r5.next()) {
             
              String name=r5.getString("hname");
                 comboBoxModel.addElement(name);

            }
         jComboBox2.setModel(comboBoxModel);
         
            con.close();
            
            
      }catch(Exception e){System.out.print(e);}        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeVisible

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        new NewJFrame().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
//here sonoo is database name, root is username and password  

 

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ops().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
