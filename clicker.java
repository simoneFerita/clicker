package org.ea;

import java.awt.*;
import java.awt.event.InputEvent;

import javax.swing.ImageIcon;

public class clicker {


      ImageIcon logo = new ImageIcon(".//face.png");
      public static void main(String[] args) {
            try {
                  while (true){
                        Robot r = new Robot();
                        int button = InputEvent.BUTTON1_DOWN_MASK;
                        System.out.println("Click");
                        r.mousePress(button);
                        Thread.sleep(1000);
                        r.mouseRelease(button);
                        Thread.sleep(1000*10);   
                                      

                        r.mouseMove(838,539);
                  }
            }
            catch (Exception e){
                  e.printStackTrace();
            }
            
      }
}