package org.design.patterns.decorator.decorators;

import org.design.patterns.decorator.Formatter;

public class UnderlineDecorator extends TextDecorator{
    public UnderlineDecorator(Formatter text) {
        super(text);
    }

    @Override
    public String giveFormat() {
        int length = text.giveFormat().length();
        StringBuilder stringBuilder = new StringBuilder(text.giveFormat());
        stringBuilder.append("\n");
        stringBuilder.append("_".repeat(length));
        return stringBuilder.toString();
    }
}
