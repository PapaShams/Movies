/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

/**
 *
 * @author DENNIS
 */
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
public class Movies extends JFrame {

    public Movies()
    {
        //headers for the table
        String[] columns = new String[] {
            "Movie", "Rating" };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
            {"Star Wars",9.0},
            {"Total Recall",6.5},
            {"Terminator",8.2},
            {"Star Trek",7.6},
            {"Jurassic World","8.2"}
        };
        //create table with data
        JTable table = new JTable(data, columns);
         
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("Movie Content");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Movies();
            }
        });
    }   
}
    

