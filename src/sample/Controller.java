package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

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
    private CheckBox с1r;

    @FXML
    private CheckBox с2r;

    @FXML
    private CheckBox с3r;

    @FXML
    private CheckBox с4r;

    @FXML
    private CheckBox с5r;

    @FXML
    private CheckBox с6r;

    @FXML
    private CheckBox с7r;

    @FXML
    private CheckBox с8r;

    @FXML
    private CheckBox с9r;

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
    private TableView<?> tableRiskProbability1;

    @FXML
    private TableColumn<?, ?> tableEventsR1;

    @FXML
    private TableColumn<?, ?> ER;

    @FXML
    private TableColumn<?, ?> amountOfDamage;

    @FXML
    private TableColumn<?, ?> VRER;

    @FXML
    private TableColumn<?, ?> Priority;

    @FXML
    private Tab planningTab;

    @FXML
    private Tab monitoringTab;

    @FXML
    private Tab resultTab;
    @FXML
    void initialize () {
        ArrayList<Double> riskEventMarks = new ArrayList<>();
        for(double i=0.1;i<=0.6;i+=0.05) {
            riskEventMarks.add(i);
        }
        ObservableList<RiskEvent> riskEvents = FXCollections.observableArrayList(
                new RiskEvent("затримки у постачанні обладнання, необхідного для підтримки процесу " +
                "розроблення ПЗ",riskEventMarks),
                new RiskEvent("затримки у постачанні інструментальних засобів, необхідних для підтримки " +
                        "процесу розроблення ПЗ",riskEventMarks),
                new RiskEvent("небажання команди виконавців ПЗ використовувати інструментальні засоби для " +
                        "підтримки процесу розроблення ПЗ",riskEventMarks),
                new RiskEvent("відмова команди виконавців від CASE-засобів розроблення ПЗ",riskEventMarks),
                new RiskEvent("формування запитів на більш потужні інструментальні засоби розроблення ПЗ",riskEventMarks),
                new RiskEvent("недостатня продуктивність баз(и) даних для підтримки процесу розроблення ПЗ",riskEventMarks),
                new RiskEvent("програмні компоненти, які використовують повторно в ПЗ, мають дефекти та " +
                        "обмежені функціональні можливості",riskEventMarks),
                new RiskEvent("неефективність програмного коду, згенерованого CASE-засобами розроблення ПЗ",riskEventMarks),
                new RiskEvent("неможливість інтеграції CASE-засобів з іншими інструментальними засобами " +
                        "для підтримки процесу розроблення ПЗ",riskEventMarks),
                new RiskEvent("швидкість виявлення дефектів у програмному коді є нижчою від раніше " +
                        "запланованих термінів",riskEventMarks),
                new RiskEvent("поява дефектних системних компонент, які використовують для розроблення ПЗ",riskEventMarks),
                new RiskEvent("недооцінювання витрат на реалізацію програмного проекту (надмірно низька вартість)",riskEventMarks),
                new RiskEvent("переоцінювання витрат на реалізацію програмного проекту (надмірно висока вартість)",riskEventMarks),
                new RiskEvent("фінансові ускладнення у компанії-замовника ПЗ",riskEventMarks),
                new RiskEvent("фінансові ускладнення у компанії-розробника ПЗ",riskEventMarks),
                new RiskEvent("збільшення бюджету програмного проекта з ініціативи компанії-розробника ПЗ під час його реалізації",riskEventMarks),
                new RiskEvent("збільшення бюджету програмного проекта з ініціативи компанії-розробника ПЗ під час його реалізації",riskEventMarks),
                new RiskEvent("висока вартість виконання повторних робіт, необхідних для зміни вимог до ПЗ",riskEventMarks),
                new RiskEvent("реорганізація структурних підрозділів у компанії-замовника ПЗ",riskEventMarks),
                new RiskEvent("реорганізація команди виконавців у компанії-розробника ПЗ",riskEventMarks),
                new RiskEvent("зміни графіка виконання робіт з боку замовника чи виконавця",riskEventMarks),
                new RiskEvent("порушення графіка виконання робіт у компанії-розробника ПЗ",riskEventMarks),
                new RiskEvent("потреба зміни користувацьких вимог до ПЗ з боку компанії-замовника ПЗ",riskEventMarks),
                new RiskEvent("потреба зміни функціональних вимог до ПЗ з боку компанії-розробника ПЗ",riskEventMarks),
                new RiskEvent("потреба виконання великої кількості повторних робіт, необхідних для зміни вимог до ПЗ",riskEventMarks),
                new RiskEvent("недооцінювання тривалості етапів реалізації програмного проекту з боку компанії-розробника ПЗ",riskEventMarks),
                new RiskEvent("переоцінювання тривалості етапів реалізації програмного проекту",riskEventMarks),
                new RiskEvent("остаточний розмір ПЗ перевищує заплановані його характеристики",riskEventMarks),
                new RiskEvent("остаточний розмір ПЗ значно менший за планові його характеристики",riskEventMarks),
                new RiskEvent("поява на ринку аналогічного ПЗ до виходу замовленого",riskEventMarks),
                new RiskEvent("поява на ринку більш конкурентоздатного ПЗ",riskEventMarks),
                new RiskEvent("низький моральний стан персоналу команди виконавців ПЗ",riskEventMarks),
                new RiskEvent("низька взаємодія між членами команди виконавців ПЗ",riskEventMarks),
                new RiskEvent("пасивність керівника (менеджера) програмного проекту",riskEventMarks),
                new RiskEvent("недостатня компетентність керівника (менеджера) програмного проекту",riskEventMarks),
                new RiskEvent("незадоволеність замовника результатами етапів реалізації програмного проекту",riskEventMarks),
                new RiskEvent("недостатня кількість фахівців у команді виконавців ПЗ з необхідним професійним рівнем",riskEventMarks),
                new RiskEvent("хвороба провідного виконавця в найкритичніший момент розроблення ПЗ",riskEventMarks),
                new RiskEvent("одночасна хвороба декількох виконавців підчас розроблення ПЗ",riskEventMarks),
                new RiskEvent("неможливість організації необхідного навчання персоналу команди виконавців ПЗ",riskEventMarks),
                new RiskEvent("зміна пріоритетів у процесі управління програмним проектом",riskEventMarks),
                new RiskEvent("недооцінювання необхідної кількості розробників (підрядників і субпідрядників) на етапах життєвого циклу розроблення ПЗ",riskEventMarks),
                new RiskEvent("переоцінювання необхідної кількості розробників (підрядників і субпідрядників) на етапах життєвого циклу розроблення ПЗ",riskEventMarks),
                new RiskEvent("надмірне документування результатів на етапах реалізації програмного проекту",riskEventMarks),
                new RiskEvent("недостатнє документування результатів на етапах реалізації програмного проекту",riskEventMarks),
                new RiskEvent("нереалістичне прогнозування результатів на етапах реалізації програмного проекту",riskEventMarks),
                new RiskEvent("недостатній професійний рівень представників від компанії-замовника ПЗ",riskEventMarks)
                );

        tableEventsR.setCellValueFactory(new PropertyValueFactory<RiskEvent, String>("name"));
        ex1.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex1"));
        ex2.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex2"));
        ex3.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex3"));
        ex4.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex4"));
        ex5.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex5"));
        ex6.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex6"));
        ex7.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex7"));
        ex8.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex8"));
        ex9.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex9"));
        ex10.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ex10"));
        er.setCellValueFactory(new PropertyValueFactory<RiskEvent,Double>("ER"));

        System.out.println(riskEvents.size());

        tableRiskProbability.setItems(riskEvents);

        tableRiskProbability.setEditable(true);
//        tableEventsR.setCellFactory();
//        tableRiskProbability.
    }
}
