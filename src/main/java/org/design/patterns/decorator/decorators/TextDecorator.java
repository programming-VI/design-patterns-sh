package org.design.patterns.decorator.decorators;

import org.design.patterns.decorator.Formatter;

public abstract class TextDecorator implements Formatter {

    protected Formatter text;

    public TextDecorator(Formatter text) {
        this.text = text;
    }
}
