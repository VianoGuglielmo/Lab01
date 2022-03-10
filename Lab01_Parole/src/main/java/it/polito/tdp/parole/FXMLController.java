/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole; //importo la classe Parole così posso usare i metodi creati
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	Parole elenco;
	
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnCancella"
    private Button btnCancella; // Value injected by FXMLLoader

    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader

    @FXML // fx:id="btnReset"
    private Button btnReset; // Value injected by FXMLLoader

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML // fx:id="txtTempo"
    private TextArea txtTempo; // Value injected by FXMLLoader

    @FXML
    void doCancella(ActionEvent event) {

    }

    @FXML
    void doInsert(ActionEvent event) {
    	long start, end;
    	String tem;
    	start = System.nanoTime();
    	String p = txtParola.getText(); 
    	elenco.addParola(p);
    	String ris = ""; // creo stringa vuota
    	for (String s: elenco.getElenco()) { //for dove passo stringa e itera e assume i vari valori
    		ris+= s+"\n";   // mi cambia la stringa precedente + quella nuova
    	}
    	end = System.nanoTime();
    	txtParola.clear();
    	txtResult.setText(ris);
    	tem=String.valueOf(end-start);
    	txtTempo.setText("Tempo impiegato aggiungere e riordinare parola: "+tem+ " nanosec");
    }

    @FXML
    void doReset(ActionEvent event) {
    	long start, end;
    	String tem;
    	start = System.nanoTime();
    	elenco.reset(); //metodo creato in parole usato per cancellare la lista
    	txtResult.clear();
    	txtTempo.clear();
    	end = System.nanoTime();
    	tem=String.valueOf(end-start);
    	txtTempo.setText("Tempo impiegato eliminare testo e oul txt: "+tem+ " nanosec");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTempo != null : "fx:id=\"txtTempo\" was not injected: check your FXML file 'Scene.fxml'.";
        elenco = new Parole();
    }

}
