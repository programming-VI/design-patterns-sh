package org.design.patterns.decorator.decorators;

import org.design.patterns.decorator.Formatter;

public class ReverseDecorator extends TextDecorator{
    public ReverseDecorator(Formatter text) {
        super(text);
    }

    @Override
    public String giveFormat() {
        StringBuilder stringBuilder = new StringBuilder(text.giveFormat());
        return stringBuilder.reverse().toString();
    }
}
