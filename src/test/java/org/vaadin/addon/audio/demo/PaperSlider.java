package org.vaadin.addon.audio.demo;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@Tag("paper-slider")
@HtmlImport("bower_components/paper-slider/paper-slider.html")
public class PaperSlider extends AbstractSinglePropertyField<PaperSlider, Double> implements HasStyle {

    private static final double SCALE_MULTIPLIER = 1.0;
    private double scale = SCALE_MULTIPLIER;

    public PaperSlider() {
        super("value", 0.0, false);
    }

    public PaperSlider(double min, double max, double initial) {
        super("value", initial, false);
        setMaxValue(max * scale);
        setMinValue(min * scale);
        getStyle().set("width", "100px");
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public void setMinValue(double min) {
        getElement().setProperty("min", min * scale);
    }

    public void setMaxValue(double max) {
        getElement().setProperty("max", max * scale);
    }

    @Override
    public void setValue(Double value) {
        getElement().setProperty("value", value * scale);
    }

    @Override
    public Double getValue() {
        return Double.parseDouble(getElement().getProperty("value")) / scale;
    }
}
