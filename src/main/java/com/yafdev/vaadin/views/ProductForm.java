package com.yafdev.vaadin.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;

public class ProductForm extends VerticalLayout {

    private TextField name;
    private TextArea description;
    private NumberField price;
    private DatePicker available;
    private ComboBox<String> category;
    private Button save;

    public ProductForm() {
        name = new TextField("Name");
        description = new TextArea("Description");

        price = new NumberField("Price");
        price.setSuffixComponent(new Span("€"));
        price.setStep(0.01);

        available = new DatePicker("Available");
        category = new ComboBox("Category");
        category.setItems("A", "B", "C");
        setSpacing(true);

        save = new Button("Save");
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button cancel = new Button("Cancel");
        HorizontalLayout buttons = new HorizontalLayout(save, cancel);

        add(name, description, price, available, category, buttons);
    }
}
