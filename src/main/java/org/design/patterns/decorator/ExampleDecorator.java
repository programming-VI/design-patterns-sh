package org.design.patterns.decorator;

import org.design.patterns.decorator.decorators.CapitalDecorator;
import org.design.patterns.decorator.decorators.ReplaceSpaceDecorator;
import org.design.patterns.decorator.decorators.UnderlineDecorator;

public class ExampleDecorator {

    public static void main(String[] args) {
        Formatter formatter = new Text("Hi how are you Andres!!!");
        CapitalDecorator capital = new CapitalDecorator(formatter);
//        ReverseDecorator reverse = new ReverseDecorator(capital);
        UnderlineDecorator underline = new UnderlineDecorator(capital);
        ReplaceSpaceDecorator replace = new ReplaceSpaceDecorator(underline);

        System.out.println(replace.giveFormat());
    }

}
