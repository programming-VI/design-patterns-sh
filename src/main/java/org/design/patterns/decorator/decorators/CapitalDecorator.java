package org.design.patterns.decorator.decorators;

import org.design.patterns.decorator.Formatter;

public class CapitalDecorator  extends TextDecorator{
    public CapitalDecorator(Formatter text) {
        super(text);
    }

    @Override
    public String giveFormat() {
        return text.giveFormat().toUpperCase();
    }
}
