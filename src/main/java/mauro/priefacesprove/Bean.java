/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauro.priefacesprove;

import java.io.Serializable;
import javax.inject.Named;
import org.omnifaces.cdi.ViewScoped;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author utente_javaee7
 */
@Named(value = "bean")
@ViewScoped
public class Bean implements Serializable{

    private PieChartModel model;

    public Bean() {
        model = new PieChartModel();
        model.set("Brand 1", 540);
        model.set("Brand 2", 325);
        model.set("Brand 3", 702);
        model.set("Brand 4", 421);
        model.setTitle("Simple Pie");
        model.setLegendPosition("w");
    }

    public PieChartModel getModel() {
        return model;
    }

}
