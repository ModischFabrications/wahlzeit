package org.wahlzeit.utils;

import java.lang.annotation.Repeatable;

@Repeatable(PatternInstance.List.class)
public @interface PatternInstance {
    String patternName();

    String[] participants();

    // needed to be repeatable
    @interface List {
        PatternInstance[] value();
    }
}
