/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screensframework.views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import screensframework.ControlledScreen;
import screensframework.ControlledScreen;
import screensframework.ScreensController;
import screensframework.ScreensController;

/**
 * FXML Controller class
 *
 * @author Diego
 */
public class LoginFormController implements Initializable, ControlledScreen {

    ScreensController myController;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }
    
    public void login() {
        System.out.println("Foi!");
    }
    
}
