package org.design.patterns.decorator.decorators;

import org.design.patterns.decorator.Formatter;

public class ReplaceSpaceDecorator extends TextDecorator{
    public ReplaceSpaceDecorator(Formatter text) {
        super(text);
    }

    @Override
    public String giveFormat() {
        return text.giveFormat().replace(" ", "_");
    }
}
