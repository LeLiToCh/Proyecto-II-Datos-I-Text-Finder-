package code.textfinder;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class MainController{ //implements Initializable {
    @FXML
    public Button bckbutton;
    @FXML
    public TableView<SearchInfo> resultsTable;
    @FXML
    private TableColumn<SearchInfo, String> resultsColumn;
    @FXML
    public Label nameLabel;
    @FXML
    public Button searchBtn;
    @FXML
    public TextField searchTxtField;
    @FXML
    public Button addFilesBtn;
    @FXML
    public RadioButton PhraseBtn;
    String docPath= "esta seria la variable con la data";
    Boolean phraseOn= false;
    public Object phraseButtonClicked(MouseEvent event) throws IOException, InterruptedException {

        if (phraseOn==false){

            phraseOn=true;
            System.out.println(phraseOn);
            return null;
        }


        if (phraseOn==true){

            phraseOn=false;
            System.out.println(phraseOn);
            return null;
        }
        return null;
    }

    public Object resultsTableGetClicked(MouseEvent event) throws IOException, InterruptedException { // metodo que se activa si el boton de acceso es tocado,
        if (num==2) {
            System.out.println("prueba inicio");
            return null;

        }
        if (num==3) {
            System.out.println("prueba segundo");
            return null;
        }
        return null;
    }
    public void searchBtnGetClicked(ActionEvent event) throws IOException, InterruptedException{
        relleno();
    }
    ObservableList<SearchInfo> infoObservable = FXCollections.observableArrayList();

    // a futuro aqui va a ir el while que me va a cargar
    // todo en la table view lo hago con el ".getderecha() y el .getizquierda()
    Integer num= 1;
    public Integer relleno(){

        if (num==1) {
            String prueba = "holaaaaaaaaaa que talll";
            infoObservable.add(new SearchInfo(prueba));

            resultsColumn.setCellValueFactory(new PropertyValueFactory<>("result"));

            resultsTable.setItems(infoObservable);

            return
                    num+=1;

        }
        if (num==2) {
            String prueba = "siuiiiiiiiii";
            infoObservable.add(new SearchInfo(prueba));

            resultsColumn.setCellValueFactory(new PropertyValueFactory<>("result"));

            resultsTable.setItems(infoObservable);
            return
                    num+=1;


        }

        return null;
    }
    private Server server;
    private Client client;




}
/*
    @Override
    public void initialize(URL url, ResourceBundle resource){
        //a futuro aqui estaria el while que mete todo lo que quiera ver en la lista, con base al resultado obtenido
        //ejempolo aqui cargo cuando el de existe es en true
        String prueba = "holaaaaaaaaaa que talll";
        String prueba2 = "siuiiiii";
        infoObservable.add(new SearchInfo(prueba2));


        resultsColumn.setCellValueFactory(new PropertyValueFactory<>("result"));

        resultsTable.setItems(infoObservable);
    }
    */
/*
    @Override
    public void initialize (URL location, ResourceBundle resources){

        try{
            client = new Client(new Socket("localhost", 1234));
            System.out.println("Connected to Server");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Error creating Client ... ");
        }

    }
*/