package sample;

import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.cell.ComboBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;

import javafx.event.EventHandler;

import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.util.converter.DefaultStringConverter;

import java.util.ArrayList;
import java.util.Collections;

public class Controller {
    @FXML
    private TabPane allTabPane;

    @FXML
    private Tab identificationTabidentificationTab;

    @FXML
    private TabPane firstStageTab;

    @FXML
    private Tab sourcesTab;

    @FXML
    private CheckBox t1;

    @FXML
    private CheckBox t2;

    @FXML
    private CheckBox t3;

    @FXML
    private CheckBox t4;

    @FXML
    private CheckBox t5;

    @FXML
    private CheckBox t6;

    @FXML
    private CheckBox t7;

    @FXML
    private CheckBox c1;

    @FXML
    private CheckBox c2;

    @FXML
    private CheckBox c3;

    @FXML
    private CheckBox p1;

    @FXML
    private CheckBox p2;

    @FXML
    private CheckBox p3;

    @FXML
    private CheckBox m1;

    @FXML
    private CheckBox m2;

    @FXML
    private CheckBox m3;

    @FXML
    private CheckBox m4;

    @FXML
    private CheckBox m5;

    @FXML
    private Label percentTechR1;

    @FXML
    private Label percentFinR1;

    @FXML
    private Label percentPlanR1;

    @FXML
    private Label percentManR1;

    @FXML
    private Label percentManR11;

    @FXML
    private Tab potentialRiskEvents;

    @FXML
    private CheckBox t1r;

    @FXML
    private CheckBox t2r;

    @FXML
    private CheckBox t3r;

    @FXML
    private CheckBox t4r;

    @FXML
    private CheckBox t5r;

    @FXML
    private CheckBox t6r;

    @FXML
    private CheckBox t7r;

    @FXML
    private CheckBox t8r;

    @FXML
    private CheckBox t9r;

    @FXML
    private CheckBox t10r;

    @FXML
    private CheckBox t11r;

    @FXML
    private CheckBox c1r;

    @FXML
    private CheckBox c2r;

    @FXML
    private CheckBox c3r;

    @FXML
    private CheckBox c4r;

    @FXML
    private CheckBox c5r;

    @FXML
    private CheckBox c6r;

    @FXML
    private CheckBox c7r;

    @FXML
    private CheckBox c8r;

    @FXML
    private CheckBox c9r;

    @FXML
    private CheckBox p1r;

    @FXML
    private CheckBox p2r;

    @FXML
    private CheckBox p3r;

    @FXML
    private CheckBox p4r;

    @FXML
    private CheckBox p5r;

    @FXML
    private CheckBox p6r;

    @FXML
    private CheckBox p7r;

    @FXML
    private CheckBox p8r;

    @FXML
    private CheckBox p9r;

    @FXML
    private CheckBox p10r;

    @FXML
    private CheckBox p11r;

    @FXML
    private CheckBox m1r;

    @FXML
    private CheckBox m2r;

    @FXML
    private CheckBox m3r;

    @FXML
    private CheckBox m4r;

    @FXML
    private CheckBox m5r;

    @FXML
    private CheckBox m6r;

    @FXML
    private CheckBox m7r;

    @FXML
    private CheckBox m8r;

    @FXML
    private CheckBox m9r;

    @FXML
    private CheckBox m10r;

    @FXML
    private CheckBox m11r;

    @FXML
    private CheckBox m12r;

    @FXML
    private CheckBox m13r;

    @FXML
    private CheckBox m14r;

    @FXML
    private CheckBox m15r;

    @FXML
    private CheckBox m16r;

    @FXML
    private Label percentTechR;

    @FXML
    private Label percentFinR;

    @FXML
    private Label percentPlanR;

    @FXML
    private Label percentManR;

    @FXML
    private Label percentManR111;

    @FXML
    private Tab analysisTabanalysisTab;

    @FXML
    private TableView<RiskEvent> tableRiskProbability;

    @FXML
    private TableView<RiskEvent>tableSolution;

    @FXML
    private TableColumn<RiskEvent, String> RiskEvents;

    @FXML
    private TableColumn<RiskEvent, RiskSolution> Solution;

    @FXML
    private TableColumn<RiskEvent, String> tableEventsR;

    @FXML
    private TableColumn<RiskEvent, Double> ex1;

    @FXML
    private TableColumn<RiskEvent, Double> ex2;

    @FXML
    private TableColumn<RiskEvent, Double> ex3;

    @FXML
    private TableColumn<RiskEvent, Double> ex4;

    @FXML
    private TableColumn<RiskEvent, Double> ex5;

    @FXML
    private TableColumn<RiskEvent, Double> ex6;

    @FXML
    private TableColumn<RiskEvent, Double> ex7;

    @FXML
    private TableColumn<RiskEvent, Double> ex8;

    @FXML
    private TableColumn<RiskEvent, Double> ex9;

    @FXML
    private TableColumn<RiskEvent, Double> ex10;

    @FXML
    private TableColumn<RiskEvent, Double> er;

    @FXML
    private TableView<RiskEvent> tableRiskProbability1;

    @FXML
    private TableColumn<RiskEvent, String> tableEventsR1;

    @FXML
    private TableColumn<RiskEvent, Double> ER;

    @FXML
    private TableColumn<RiskEvent, Double> amountOfDamage;

    @FXML
    private TableColumn<RiskEvent, Double> VRER;

    @FXML
    private TableColumn<RiskEvent, String> Priority;

    @FXML
    private Tab planningTab;

    @FXML
    private Tab monitoringTab;

    @FXML
    private Tab resultTab;

    @FXML
    private Button calculateButton2;

    @FXML
    private Button calculateButton1;

    @FXML
    void initialize () {
        ObservableList<String> solutions = FXCollections.observableArrayList(
                "1",
                "2",
                "3"
        );
        Solution.setCellValueFactory(cellData -> cellData.getValue().riskSolutionProperty());

        Solution.setCellFactory(tc -> {
            ComboBox<RiskSolution> combo = new ComboBox<>();
            combo.getItems().addAll(RiskSolution.values());
            TableCell<RiskEvent, RiskSolution> cell = new TableCell<RiskEvent, RiskSolution>() {
                @Override
                protected void updateItem(RiskSolution reason, boolean empty) {
                    super.updateItem(reason, empty);
                    if (empty) {
                        setGraphic(null);
                    } else {
                        combo.setValue(reason);
                        setGraphic(combo);
                    }
                }
            };
            combo.setOnAction(e ->
                    tableSolution.getItems().get(cell.getIndex()).setRiskSolution(combo.getValue()));
            return cell ;
        });
//        Solution.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
//        Solution.setCellValueFactory(new PropertyValueFactory<RiskSolution,String>("name"));
//        Solution.setCellFactory(ComboBoxTableCell.forTableColumn(solutions));
//        Solution.setOnEditCommit(
//                new EventHandler<CellEditEvent<RiskSolution, String>>() {
//                    @Override
//                    public void handle(CellEditEvent<RiskSolution, String> t) {
//                        ((RiskSolution) t.getTableView().getItems().get(t.getTablePosition().getRow())).setName(t.getNewValue());
//                    };
//                });
//        Solution.setEditable(true);

//        Solution.setCellFactory(ComboBoxTableCell.forTableColumn(
//                new DefaultStringConverter(), solutions));
        tableRiskProbability.setEditable(true);
        tableRiskProbability1.setEditable(true);
        calculateButton1.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent e) {

                Double r1 = calculateSourceRisk(t1, t2, t3r, t4, t5, t6, t7);
                percentTechR1.setText(r1.toString()+"%");
                Double m11 = calculateSourceRisk(m1, m2, m3, m4, m5);
                percentManR1.setText(m11.toString()+"%");
                Double p11= calculateSourceRisk(p1, p2, p3);
                percentPlanR1.setText(p11.toString()+"%");
                Double c11 = calculateSourceRisk(c1,c2,c3);
                percentFinR1.setText(c11.toString()+"%");
                Double sum=r1+m11+p11+c11;
                percentManR11.setText(sum.toString()+"%");
            }
        });
        calculateButton2.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent e) {

                Double r1 = calculateRisks(t1r, t2r, t3r, t4r, t5r, t6r, t7r, t9r, t8r, t10r, t11r);
                percentTechR.setText(r1.toString()+"%");
                Double m1 = calculateRisks(m1r, m2r, m3r, m4r, m5r, m6r, m7r, m9r, m8r, m10r, m11r,m12r,m13r,m14r,m15r,m16r);
                percentManR.setText(m1.toString()+"%");
                Double p1= calculateRisks(p1r, p2r, p3r, p4r, p5r, p6r, p7r, p9r, p8r, p10r, p11r);
                percentPlanR.setText(p1.toString()+"%");
                Double c1 = calculateRisks(c1r,c2r,c3r,c4r,c5r,c6r,c7r,c8r,c9r);
                percentFinR.setText(c1.toString()+"%");
                Double sum=r1+m1+p1+c1;
                percentManR111.setText(sum.toString()+"%");
            }
        });

        ObservableList<RiskEvent> riskEvents = FXCollections.observableArrayList(

            new RiskEvent("затримки у постачанні обладнання, необхідного для підтримки процесу " +
                "розроблення ПЗ",randomMarks(),randomMark()),
                new RiskEvent("затримки у постачанні інструментальних засобів, необхідних для підтримки " +
                        "процесу розроблення ПЗ",randomMarks(),randomMark()),
                new RiskEvent("небажання команди виконавців ПЗ використовувати інструментальні засоби для " +
                        "підтримки процесу розроблення ПЗ",randomMarks(),randomMark()),
                new RiskEvent("відмова команди виконавців від CASE-засобів розроблення ПЗ",randomMarks(),randomMark()),
                new RiskEvent("формування запитів на більш потужні інструментальні засоби розроблення ПЗ",randomMarks(),randomMark()),
                new RiskEvent("недостатня продуктивність баз(и) даних для підтримки процесу розроблення ПЗ",randomMarks(),randomMark()),
                new RiskEvent("програмні компоненти, які використовують повторно в ПЗ, мають дефекти та " +
                        "обмежені функціональні можливості",randomMarks(),randomMark()),
                new RiskEvent("неефективність програмного коду, згенерованого CASE-засобами розроблення ПЗ",randomMarks(),randomMark()),
                new RiskEvent("неможливість інтеграції CASE-засобів з іншими інструментальними засобами " +
                        "для підтримки процесу розроблення ПЗ",randomMarks(),randomMark()),
                new RiskEvent("швидкість виявлення дефектів у програмному коді є нижчою від раніше " +
                        "запланованих термінів",randomMarks(),randomMark()),
                new RiskEvent("поява дефектних системних компонент, які використовують для розроблення ПЗ",randomMarks(),randomMark()),
                new RiskEvent("недооцінювання витрат на реалізацію програмного проекту (надмірно низька вартість)",randomMarks(),randomMark()),
                new RiskEvent("переоцінювання витрат на реалізацію програмного проекту (надмірно висока вартість)",randomMarks(),randomMark()),
                new RiskEvent("фінансові ускладнення у компанії-замовника ПЗ",randomMarks(),randomMark()),
                new RiskEvent("фінансові ускладнення у компанії-розробника ПЗ",randomMarks(),randomMark()),
                new RiskEvent("збільшення бюджету програмного проекта з ініціативи компанії-розробника ПЗ під час його реалізації",randomMarks(),randomMark()),
                new RiskEvent("збільшення бюджету програмного проекта з ініціативи компанії-розробника ПЗ під час його реалізації",randomMarks(),randomMark()),
                new RiskEvent("висока вартість виконання повторних робіт, необхідних для зміни вимог до ПЗ",randomMarks(),randomMark()),
                new RiskEvent("реорганізація структурних підрозділів у компанії-замовника ПЗ",randomMarks(),randomMark()),
                new RiskEvent("реорганізація команди виконавців у компанії-розробника ПЗ",randomMarks(),randomMark()),
                new RiskEvent("зміни графіка виконання робіт з боку замовника чи виконавця",randomMarks(),randomMark()),
                new RiskEvent("порушення графіка виконання робіт у компанії-розробника ПЗ",randomMarks(),randomMark()),
                new RiskEvent("потреба зміни користувацьких вимог до ПЗ з боку компанії-замовника ПЗ",randomMarks(),randomMark()),
                new RiskEvent("потреба зміни функціональних вимог до ПЗ з боку компанії-розробника ПЗ",randomMarks(),randomMark()),
                new RiskEvent("потреба виконання великої кількості повторних робіт, необхідних для зміни вимог до ПЗ",randomMarks(),randomMark()),
                new RiskEvent("недооцінювання тривалості етапів реалізації програмного проекту з боку компанії-розробника ПЗ",randomMarks(),randomMark()),
                new RiskEvent("переоцінювання тривалості етапів реалізації програмного проекту",randomMarks(),randomMark()),
                new RiskEvent("остаточний розмір ПЗ перевищує заплановані його характеристики",randomMarks(),randomMark()),
                new RiskEvent("остаточний розмір ПЗ значно менший за планові його характеристики",randomMarks(),randomMark()),
                new RiskEvent("поява на ринку аналогічного ПЗ до виходу замовленого",randomMarks(),randomMark()),
                new RiskEvent("поява на ринку більш конкурентоздатного ПЗ",randomMarks(),randomMark()),
                new RiskEvent("низький моральний стан персоналу команди виконавців ПЗ",randomMarks(),randomMark()),
                new RiskEvent("низька взаємодія між членами команди виконавців ПЗ",randomMarks(),randomMark()),
                new RiskEvent("пасивність керівника (менеджера) програмного проекту",randomMarks(),randomMark()),
                new RiskEvent("недостатня компетентність керівника (менеджера) програмного проекту",randomMarks(),randomMark()),
                new RiskEvent("незадоволеність замовника результатами етапів реалізації програмного проекту",randomMarks(),randomMark()),
                new RiskEvent("недостатня кількість фахівців у команді виконавців ПЗ з необхідним професійним рівнем",randomMarks(),randomMark()),
                new RiskEvent("хвороба провідного виконавця в найкритичніший момент розроблення ПЗ",randomMarks(),randomMark()),
                new RiskEvent("одночасна хвороба декількох виконавців підчас розроблення ПЗ",randomMarks(),randomMark()),
                new RiskEvent("неможливість організації необхідного навчання персоналу команди виконавців ПЗ",randomMarks(),randomMark()),
                new RiskEvent("зміна пріоритетів у процесі управління програмним проектом",randomMarks(),randomMark()),
                new RiskEvent("недооцінювання необхідної кількості розробників (підрядників і субпідрядників) на етапах життєвого циклу розроблення ПЗ",randomMarks(),randomMark()),
                new RiskEvent("переоцінювання необхідної кількості розробників (підрядників і субпідрядників) на етапах життєвого циклу розроблення ПЗ",randomMarks(),randomMark()),
                new RiskEvent("надмірне документування результатів на етапах реалізації програмного проекту",randomMarks(),randomMark()),
                new RiskEvent("недостатнє документування результатів на етапах реалізації програмного проекту",randomMarks(),randomMark()),
                new RiskEvent("нереалістичне прогнозування результатів на етапах реалізації програмного проекту",randomMarks(),randomMark()),
                new RiskEvent("недостатній професійний рівень представників від компанії-замовника ПЗ",randomMarks(),randomMark())
                );
        CalculatePriorities(riskEvents);
        Callback<TableColumn<RiskEvent,Double>, TableCell<RiskEvent,Double>> cellFactory = p -> new EditingCell();
        tableEventsR.setCellValueFactory(new PropertyValueFactory<RiskEvent, String>("name"));
        tableEventsR1.setCellValueFactory(new PropertyValueFactory<RiskEvent,String>("name"));
        RiskEvents.setCellValueFactory(new PropertyValueFactory<RiskEvent, String>("name"));
        ex1.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex1"));
        ex1.setCellFactory(cellFactory);
        ex2.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex2"));
        ex2.setCellFactory(cellFactory);
        ex3.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex3"));
        ex3.setCellFactory(cellFactory);
        ex4.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex4"));
        ex4.setCellFactory(cellFactory);
        ex5.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex5"));
        ex5.setCellFactory(cellFactory);
        ex6.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex6"));
        ex6.setCellFactory(cellFactory);
        ex7.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex7"));
        ex7.setCellFactory(cellFactory);
        ex8.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex8"));
        ex8.setCellFactory(cellFactory);
        ex9.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex9"));
        ex9.setCellFactory(cellFactory);
        ex10.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex10"));
        ex10.setCellFactory(cellFactory);
        er.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ER"));
        ER.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ER"));
        amountOfDamage.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("lrer"));
        amountOfDamage.setCellFactory(cellFactory);
        ex8.setCellFactory(cellFactory);
        VRER.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("vrer"));
        Priority.setCellValueFactory(new PropertyValueFactory<RiskEvent,String>("priority"));
//        Solution.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
//
//        Solution.setCellFactory(ComboBoxTableCell.forTableColumn("Friends", "Family", "Work Contacts"));


//        Solution.setCellValueFactory(cellData -> {
//            return cellData.getValue().nameProperty();
//        });
//        Solution.setCellFactory(ComboBoxTableCell.forTableColumn(solutions));
//        Solution.setCellFactory(ComboBoxTableCell.forTableColumn(solutions));
//        Solution.setCellValueFactory(i -> {
//            final StringProperty value = i.getValue().optionProperty();
//            // binding to constant value
//            return Bindings.createObjectBinding(() -> value);
//        });
//        Solution.setCellFactory(col -> {
//            TableCell<TableViewTest, StringProperty> c = new TableCell<>();
//            final ComboBox<String> comboBox = new ComboBox<>(solutions);
//            c.itemProperty().addListener((observable, oldValue, newValue) -> {
//                if (oldValue != null) {
//                    comboBox.valueProperty().unbindBidirectional(oldValue);
//                }
//                if (newValue != null) {
//                    comboBox.valueProperty().bindBidirectional(newValue);
//                }
//            });
//            c.graphicProperty().bind(Bindings.when(c.emptyProperty()).then((Node) null).otherwise(comboBox));
//            return c;
//        });


        ex1.setOnEditCommit(t -> {
            t.getTableView().getItems().get(t.getTablePosition().getRow()).setEx1((t.getNewValue()));
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateER();
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateVRER();
            CalculatePriorities(riskEvents);
        });
        ex2.setOnEditCommit(t -> {
            t.getTableView().getItems().get(t.getTablePosition().getRow()).setEx2((t.getNewValue()));
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateER();
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateVRER();
            CalculatePriorities(riskEvents);
        });
        ex3.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<RiskEvent, Double>>() {
            @Override
            public void handle(CellEditEvent<RiskEvent, Double> t) {
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).setEx3((t.getNewValue()));
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
                CalculatePriorities(riskEvents);
            }
        });
        ex4.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<RiskEvent, Double>>() {
            @Override
            public void handle(CellEditEvent<RiskEvent, Double> t) {
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).setEx4((t.getNewValue()));
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
                CalculatePriorities(riskEvents);
            }
        });
        ex5.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<RiskEvent, Double>>() {
            @Override
            public void handle(CellEditEvent<RiskEvent, Double> t) {
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).setEx5((t.getNewValue()));
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
                CalculatePriorities(riskEvents);
            }
        });
        ex6.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<RiskEvent, Double>>() {
            @Override
            public void handle(CellEditEvent<RiskEvent, Double> t) {
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).setEx6((t.getNewValue()));
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
                CalculatePriorities(riskEvents);
            }
        });
        ex7.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<RiskEvent, Double>>() {
            @Override
            public void handle(CellEditEvent<RiskEvent, Double> t) {
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).setEx7((t.getNewValue()));
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
                CalculatePriorities(riskEvents);
            }
        });
        ex8.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<RiskEvent, Double>>() {
            @Override
            public void handle(CellEditEvent<RiskEvent, Double> t) {
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).setEx8((t.getNewValue()));
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
                CalculatePriorities(riskEvents);
            }
        });
        ex9.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<RiskEvent, Double>>() {
            @Override
            public void handle(CellEditEvent<RiskEvent, Double> t) {
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).setEx9((t.getNewValue()));
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
                CalculatePriorities(riskEvents);
            }
        });
        ex10.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<RiskEvent, Double>>() {
            @Override
            public void handle(CellEditEvent<RiskEvent, Double> t) {
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).setEx10((t.getNewValue()));
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
                CalculatePriorities(riskEvents);
            }
        });
        amountOfDamage.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<RiskEvent, Double>>() {
            @Override
            public void handle(CellEditEvent<RiskEvent, Double> t) {
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).setLrer((t.getNewValue()));
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
                CalculatePriorities(riskEvents);
            }
        });



        tableRiskProbability.setItems(riskEvents);
        tableRiskProbability1.setItems(riskEvents);
        tableSolution.setItems(riskEvents);
        tableRiskProbability.setEditable(true);


    }

    static ArrayList<Double> randomMarks() {
        ArrayList <Double> riskEventMarks=new ArrayList<Double>();
        for(int i=0;i<10;i++) {
            double x=Math.random();
            double factor = 1e2; // = 1 * 10^5 = 100000.
            double result = Math.round(x * factor) / factor;
            System.out.println(factor);
            riskEventMarks.add(result);
        }
        return riskEventMarks;
    }
    static double randomMark(){
        double x=Math.random();
        double factor = 1e2; // = 1 * 10^5 = 100000.
        double result = Math.round(x * factor) / factor;
        return result;
    }
    static void CalculatePriorities(ObservableList<RiskEvent> riskEvents) {
        ArrayList<Double>vrerList=new ArrayList<>();
        for(RiskEvent r:riskEvents) {
            vrerList.add(r.getVrer());
        }
        double max=Collections.max(vrerList);
        double min=Collections.min(vrerList);
        double mpr=(max-min)/3;
        for(RiskEvent r:riskEvents){
            if(r.getVrer()>=min && r.getVrer()<(min+mpr)) {
                r.setPriority("Низький");
            }
            if(r.getVrer()>=(min+mpr) && r.getVrer()<(min+2*mpr)) {
                r.setPriority("Середній");
            }
            if(r.getVrer()<=max && r.getVrer()>=(min+2*mpr)) {
                r.setPriority("Високий");
            }
        }
    }

    static double calculateRisks(CheckBox t1r, CheckBox t2r, CheckBox t3r, CheckBox t4r, CheckBox t5r, CheckBox t6r, CheckBox t7r, CheckBox t9r, CheckBox t8r, CheckBox t10r, CheckBox t11r) {
        System.out.println("Start");
        double r=0;
        if(t1r.isSelected()) {
            r++;
        }
        if(t2r.isSelected()) {
            r++;
        }
        if(t3r.isSelected()) {
            r++;
        }
        if(t4r.isSelected()) {
            r++;
        }
        if(t5r.isSelected()) {
            r++;
        }
        if(t6r.isSelected()) {
            r++;
        }
        if(t7r.isSelected()) {
            r++;
        }
        if(t8r.isSelected()) {
            r++;
        }
        if(t9r.isSelected()) {
            r++;
        }
        if(t10r.isSelected()) {
            r++;
        }
        if(t11r.isSelected()) {
            r++;
        }
        r/=46;
        double factor = 1e5; // = 1 * 10^5 = 100000.
        r = Math.round(r * factor)*100 / factor;
        return r;
    }
    static double calculateRisks(CheckBox t1r, CheckBox t2r, CheckBox t3r, CheckBox t4r, CheckBox t5r, CheckBox t6r, CheckBox t7r, CheckBox t9r, CheckBox t8r, CheckBox t10r, CheckBox t11r, CheckBox t12r, CheckBox t13r, CheckBox t14r, CheckBox t15r, CheckBox t16r) {
        double r=0;
        if(t1r.isSelected()) {
            r++;
        }
        if(t2r.isSelected()) {
            r++;
        }
        if(t3r.isSelected()) {
            r++;
        }
        if(t4r.isSelected()) {
            r++;
        }
        if(t5r.isSelected()) {
            r++;
        }
        if(t6r.isSelected()) {
            r++;
        }
        if(t7r.isSelected()) {
            r++;
        }
        if(t8r.isSelected()) {
            r++;
        }
        if(t9r.isSelected()) {
            r++;
        }
        if(t10r.isSelected()) {
            r++;
        }
        if(t11r.isSelected()) {
            r++;
        }
        if(t12r.isSelected()) {
            r++;
        }
        if(t13r.isSelected()) {
            r++;
        }
        if(t14r.isSelected()) {
            r++;
        }
        if(t15r.isSelected()) {
            r++;
        }
        if(t16r.isSelected()) {
            r++;
        }

        r/=46;
        double factor = 1e5; // = 1 * 10^5 = 100000.
        r = Math.round(r * factor)*100 / factor;
        return r;
    }
    static double calculateRisks(CheckBox c1r, CheckBox c2r, CheckBox c3r, CheckBox c4r, CheckBox c5r, CheckBox c6r, CheckBox c7r, CheckBox c8r, CheckBox c9r) {

        double r2=0;
        if(c1r.isSelected()) {
            r2++;
        }
        if(c2r.isSelected()) {
            r2++;
        }
        if(c3r.isSelected()) {
            r2++;
        }
        if(c4r.isSelected()) {
            r2++;
        }
        if(c5r.isSelected()) {
            r2++;
        }
        if(c6r.isSelected()) {
            r2++;
        }
        if(c7r.isSelected()) {
            r2++;
        }
        if(c8r.isSelected()) {
            r2++;
        }
        if(c9r.isSelected()) {
            r2++;
        }
        r2/=46;
        double factor = 1e5; // = 1 * 10^5 = 100000.
        r2 = Math.round(r2 * factor)*100 / factor;
        return r2;
    }

    static Double calculateSourceRisk(CheckBox t1,CheckBox t2,CheckBox t3) {
        Double x=0.0;
        if(t1.isSelected()) {
            x++;
        }
        if(t2.isSelected()) {
            x++;
        }if(t3.isSelected()) {
            x++;
        }
        x/=18;
        double factor = 1e5; // = 1 * 10^5 = 100000.
        x = Math.round(x * factor)*100 / factor;
        return x;

    }
    static Double calculateSourceRisk(CheckBox t1,CheckBox t2,CheckBox t3,CheckBox t4,CheckBox t5,CheckBox t6,CheckBox t7) {
        Double x=0.0;
        if(t1.isSelected()) {
            x++;
        }
        if(t2.isSelected()) {
            x++;
        }
        if(t3.isSelected()) {
            x++;
        }
        if(t4.isSelected()) {
            x++;
        }
        if(t5.isSelected()) {
            x++;
        }
        if(t6.isSelected()) {
            x++;
        }
        if(t7.isSelected()) {
            x++;
        }

        x/=18;
        double factor = 1e5; // = 1 * 10^5 = 100000.
        x = Math.round(x * factor)*100 / factor;
        return x;

    }

    static Double calculateSourceRisk(CheckBox t1,CheckBox t2,CheckBox t3,CheckBox t4,CheckBox t5) {
        Double x=0.0;
        if(t1.isSelected()) {
            x++;
        }
        if(t2.isSelected()) {
            x++;
        }
        if(t3.isSelected()) {
            x++;
        }
        if(t4.isSelected()) {
            x++;
        }
        if(t5.isSelected()) {
            x++;
        }
        x/=18;
        double factor = 1e5; // = 1 * 10^5 = 100000.
        x = Math.round(x * factor)*100 / factor;
        return x;

    }

}
