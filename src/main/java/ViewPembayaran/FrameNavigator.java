/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewPembayaran;

import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class FrameNavigator {
    private JFrame currentFrame;
    private JFrame previousFrame;
    
    public FrameNavigator() {
        
    }

    static void switchToFrame(Pembayaran currentFrame, JFrame nextFrame) {
        nextFrame.setVisible(true);
        currentFrame.setVisible(false);    
    }
    
    static void closeFrame(Pembayaran currentFrame) {
        currentFrame.dispose();
    }
}

