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
    private Label percentTechR11;

    @FXML
    private Label percentFinR11;

    @FXML
    private Label percentPlanR11;

    @FXML
    private Label percentManR12;

    @FXML
    private Label percentManR111;

    @FXML
    private Label percentManR112;

    @FXML
    private Tab analysisTabanalysisTab;

    @FXML
    private TableView<RiskEvent> tableRiskProbability;


    @FXML
    private TableView<RiskEvent>tableSolution;

    @FXML
    private TableColumn<RiskEvent, String> RiskEvents;

    @FXML
    private TableColumn<RiskEvent, String> Solution;

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
    private TableView<RiskEvent> tableRiskProbability11;

    @FXML
    private TableColumn<RiskEvent, String> tableEventsR4;

    @FXML
    private TableColumn<RiskEvent, Double> ER1;

    @FXML
    private TableColumn<RiskEvent, Double> amountOfDamage1;

    @FXML
    private TableColumn<RiskEvent, Double> VRER1;

    @FXML
    private TableColumn<RiskEvent, String> Priority1;

    @FXML
    private Tab planningTab;

    @FXML
    private Tab monitoringTab;

    @FXML
    private TableView<RiskEvent> tableRiskProbability2;

    @FXML
    private TableColumn<RiskEvent, String> tableEventsR2;

    @FXML
    private TableColumn<RiskEvent, Double> ex1r;

    @FXML
    private TableColumn<RiskEvent, Double> ex2r;

    @FXML
    private TableColumn<RiskEvent, Double> ex3r;

    @FXML
    private TableColumn<RiskEvent, Double> ex4r;

    @FXML
    private TableColumn<RiskEvent, Double> ex5r;

    @FXML
    private TableColumn<RiskEvent, Double> ex6r;

    @FXML
    private TableColumn<RiskEvent, Double> ex7r;

    @FXML
    private TableColumn<RiskEvent, Double> ex8r;

    @FXML
    private TableColumn<RiskEvent, Double> ex9r;

    @FXML
    private TableColumn<RiskEvent, Double> ex10r;

    @FXML
    private TableColumn<RiskEvent, Double> er1;

    @FXML
    private Tab resultTab;

    @FXML
    private Button calculateButton2;

    @FXML
    private Button calculateButton1;

    @FXML
    private Button calculateButton11;

    @FXML
    void initialize () {
        ObservableList<String> solutions = FXCollections.observableArrayList(
                "попереднє навчання членів проектного колективу",
                "узгодження детального переліку вимог до ПЗ із замовником",
                "внесення узгодженого переліку вимог до ПЗ замовника в договір",
                "точне слідування вимогам замовника з узгодженого переліку вимог до ПЗ",
                "попередні дослідження ринку",
                "експертна оцінка програмного проекту досвідченим стороннім консультантом",
                "консультації досвідченого стороннього консультанта",
                "тренінг з вивчення необхідних інструментів розроблення ПЗ",
                "укладання договору страхування",
                "використання \"шаблонних\" рішень з вдалих попередніх проектів при управлінні програмним проектом",
                "підготовка документів, які показують важливість даного проекту для досягнення фінансових цілей компанії-розробника",
                "реорганізація роботи проектного колективу так, щоб обов'язки та робота членів колективу перекривали один одного",
                "придбання (замовлення) частини компонент розроблюваного ПЗ",
                "заміна потенційно дефектних компонент розроблюваного ПЗ придбаними компонентами, які гарантують якість виконання роботи",
                "придбання більш продуктивної бази даних",
                "використання генератора програмного коду",
                "реорганізація роботи проектного колективу залежно від рівня труднощів виконання завдань та професійних рівнів розробників",
                "повторне використання придатних компонент ПЗ, які були розроблені для інших програмних проектів",
                "аналіз доцільності розроблення даного ПЗ"
        );
        Solution.setCellValueFactory(cellData -> cellData.getValue().riskSolutionProperty());

        Solution.setCellFactory(tc -> {
            ComboBox<String> combo = new ComboBox<>();
            combo.getItems().addAll(solutions);
            TableCell<RiskEvent, String> cell = new TableCell<RiskEvent, String>() {
                @Override
                protected void updateItem(String reason, boolean empty) {
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
                    tableSolution.getItems().get(cell.getIndex()).setRiskSolution(combo.getValue().toString()));
            return cell ;
        });
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
        System.out.println(riskEvents.size());
        calculateButton11.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent e) {
                double factor = 1e5; // = 1 * 10^5 = 100000.
                Double eSum=0.0;
                Double tecRisk=0.0;
                Double finRisk=0.0;
                Double planRisk=0.0;
                Double ManRisk=0.0;
                for(RiskEvent r:riskEvents) {
                    eSum+=r.getER();
                }
                for(int i=0;i<11;i++) {
                    tecRisk+=riskEvents.get(i).getER();
                }
                tecRisk/=eSum;
                 tecRisk = Math.round(tecRisk * factor) / factor;

                for(int i=11;i<19;i++) {
                    finRisk+=riskEvents.get(i).getER();
                }
                finRisk/=eSum;
                finRisk = Math.round(finRisk * factor) / factor;
                for(int i=19;i<30;i++) {
                    planRisk+=riskEvents.get(i).getER();
                }
                planRisk/=eSum;
                planRisk = Math.round(planRisk * factor) / factor;

                for(int i=30;i<=46;i++) {
                    ManRisk+=riskEvents.get(i).getER();
                }
                ManRisk/=eSum;
                ManRisk = Math.round(ManRisk * factor) / factor;


                percentTechR11.setText(tecRisk.toString()+"%");
                percentManR12.setText(ManRisk.toString()+"%");
                percentPlanR11.setText(planRisk.toString()+"%");
                percentFinR11.setText(finRisk.toString()+"%");
                Double sum=tecRisk+ManRisk+planRisk+finRisk;
                sum = Math.round(sum * factor) / factor;

                percentManR112.setText(sum.toString()+"%");
            }
        });

        CalculatePriorities(riskEvents);
        CalculatePrioritiesR(riskEvents);

        Callback<TableColumn<RiskEvent,Double>, TableCell<RiskEvent,Double>> cellFactory = p -> new EditingCell();
        tableEventsR.setCellValueFactory(new PropertyValueFactory<RiskEvent, String>("name"));
        tableEventsR1.setCellValueFactory(new PropertyValueFactory<RiskEvent,String>("name"));
        RiskEvents.setCellValueFactory(new PropertyValueFactory<RiskEvent, String>("name"));
        tableEventsR4.setCellValueFactory(new PropertyValueFactory<RiskEvent,String>("name"));

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
        ER1.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ERr"));

        amountOfDamage.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("lrer"));
        amountOfDamage.setCellFactory(cellFactory);
        amountOfDamage1.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("lrerR"));
        amountOfDamage1.setCellFactory(cellFactory);
        VRER1.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("vrerR"));
        Priority1.setCellValueFactory(new PropertyValueFactory<RiskEvent,String>("priorityR"));


        ex8.setCellFactory(cellFactory);
        VRER.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("vrer"));
        Priority.setCellValueFactory(new PropertyValueFactory<RiskEvent,String>("priority"));

        tableEventsR2.setCellValueFactory(new PropertyValueFactory<RiskEvent,String>("name"));

        ex1r.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex1r"));
        ex1r.setCellFactory(cellFactory);
        ex2r.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex2r"));
        ex2r.setCellFactory(cellFactory);
        ex3r.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex3r"));
        ex3r.setCellFactory(cellFactory);
        ex4r.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex4r"));
        ex4r.setCellFactory(cellFactory);
        ex5r.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex5r"));
        ex5r.setCellFactory(cellFactory);
        ex6r.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex6r"));
        ex6r.setCellFactory(cellFactory);
        ex7r.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex7r"));
        ex7r.setCellFactory(cellFactory);
        ex8r.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex8r"));
        ex8r.setCellFactory(cellFactory);
        ex9r.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex9r"));
        ex9r.setCellFactory(cellFactory);
        ex10r.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex10r"));
        ex10r.setCellFactory(cellFactory);
        er1.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ERr"));



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
        amountOfDamage1.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<RiskEvent, Double>>() {
            @Override
            public void handle(CellEditEvent<RiskEvent, Double> t) {
                ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).setLrerR((t.getNewValue()));
                t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateERr();
                t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateVrerR();
                CalculatePrioritiesR(riskEvents);

            }
        });

        ex1r.setOnEditCommit(t -> {
            t.getTableView().getItems().get(t.getTablePosition().getRow()).setEx1r((t.getNewValue()));
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
            CalculatePriorities(riskEvents);
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateERr();
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateLrerRAndVrerR();

            CalculatePrioritiesR(riskEvents);
        });
        ex2r.setOnEditCommit(t -> {
            t.getTableView().getItems().get(t.getTablePosition().getRow()).setEx2r((t.getNewValue()));
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
            CalculatePriorities(riskEvents);
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateERr();
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateLrerRAndVrerR();

            CalculatePrioritiesR(riskEvents);

        });
        ex3r.setOnEditCommit(t -> {
            t.getTableView().getItems().get(t.getTablePosition().getRow()).setEx3r((t.getNewValue()));
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
            CalculatePriorities(riskEvents);
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateERr();
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateLrerRAndVrerR();

            CalculatePrioritiesR(riskEvents);

        });
        ex4r.setOnEditCommit(t -> {
            t.getTableView().getItems().get(t.getTablePosition().getRow()).setEx4r((t.getNewValue()));
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
            CalculatePriorities(riskEvents);
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateERr();
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateLrerRAndVrerR();

            CalculatePrioritiesR(riskEvents);

        });
        ex5r.setOnEditCommit(t -> {
            t.getTableView().getItems().get(t.getTablePosition().getRow()).setEx5r((t.getNewValue()));
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
            CalculatePriorities(riskEvents);
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateERr();
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateLrerRAndVrerR();

            CalculatePrioritiesR(riskEvents);
        });
        ex6r.setOnEditCommit(t -> {
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
            CalculatePriorities(riskEvents);
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateERr();
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateLrerRAndVrerR();

            CalculatePrioritiesR(riskEvents);

        });
        ex7r.setOnEditCommit(t -> {
            t.getTableView().getItems().get(t.getTablePosition().getRow()).setEx7r((t.getNewValue()));
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
            CalculatePriorities(riskEvents);
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateERr();
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateLrerRAndVrerR();

            CalculatePrioritiesR(riskEvents);

        });
        ex8r.setOnEditCommit(t -> {
            t.getTableView().getItems().get(t.getTablePosition().getRow()).setEx8r((t.getNewValue()));
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
            CalculatePriorities(riskEvents);
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateERr();
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateLrerRAndVrerR();

            CalculatePrioritiesR(riskEvents);

        });
        ex9r.setOnEditCommit(t -> {
            t.getTableView().getItems().get(t.getTablePosition().getRow()).setEx9r((t.getNewValue()));
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
            CalculatePriorities(riskEvents);
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateERr();
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateLrerRAndVrerR();

            CalculatePrioritiesR(riskEvents);

        });
        ex10r.setOnEditCommit(t -> {
            t.getTableView().getItems().get(t.getTablePosition().getRow()).setEx10r((t.getNewValue()));
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateER();
            ((RiskEvent) t.getTableView().getItems().get(t.getTablePosition().getRow())).calculateVRER();
            CalculatePriorities(riskEvents);
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateERr();
            t.getTableView().getItems().get(t.getTablePosition().getRow()).calculateLrerRAndVrerR();

            CalculatePrioritiesR(riskEvents);

        });




        tableRiskProbability.setItems(riskEvents);
        tableRiskProbability1.setItems(riskEvents);
        tableRiskProbability2.setItems(riskEvents);
        tableRiskProbability11.setItems(riskEvents);
        tableSolution.setItems(riskEvents);
        tableRiskProbability.setEditable(true);
        tableRiskProbability11.setEditable(true);
        tableRiskProbability2.setEditable(true);



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

    static void CalculatePrioritiesR(ObservableList<RiskEvent> riskEvents) {
        ArrayList<Double>vrerList=new ArrayList<>();
        for(RiskEvent r:riskEvents) {
            vrerList.add(r.getVrerR());
        }
        double max=Collections.max(vrerList);
        double min=Collections.min(vrerList);
        double mpr=(max-min)/3;
        for(RiskEvent r:riskEvents){
            if(r.getVrerR()>=min && r.getVrerR()<(min+mpr)) {
                r.setPriorityR("Низький");
            }
            if(r.getVrerR()>=(min+mpr) && r.getVrerR()<(min+2*mpr)) {
                r.setPriorityR("Середній");
            }
            if(r.getVrerR()<=max && r.getVrerR()>=(min+2*mpr)) {
                r.setPriorityR("Високий");
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
